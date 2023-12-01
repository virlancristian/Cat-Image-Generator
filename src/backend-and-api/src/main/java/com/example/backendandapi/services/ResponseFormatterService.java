package com.example.backendandapi.services;

import com.example.backendandapi.api.requests.APIRequestBody;
import com.example.backendandapi.api.responses.APIResponseInterface;
import com.example.backendandapi.api.responses.CatAPISearchResponse;
import com.example.backendandapi.api.responses.CatImageGeneratorAPIResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ResponseFormatterService {
    FetchService service;

    @Autowired
    public ResponseFormatterService(FetchService service) {
        this.service = service;
    }

    public ResponseEntity getRequestError(int statusCode) {
        return ResponseEntity.status(statusCode).body(null);
    }

    public ResponseEntity<APIResponseInterface[]> getFormattedResponse(APIRequestBody body) {
        CatAPISearchResponse[] searchResponse = service.fetchImageURLS(body);
        CatImageGeneratorAPIResponse[] responses = new CatImageGeneratorAPIResponse[searchResponse.length];

        for(int i = 0; i < searchResponse.length; i++) {
            responses[i] = new CatImageGeneratorAPIResponse(i, searchResponse[i].getUrl());
        }

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(responses);
    }
}
