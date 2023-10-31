package com.example.backendandapi.api.controller;

import com.example.backendandapi.api.requests.APIRequestBody;
import com.example.backendandapi.api.responses.APIResponseInterface;
import com.example.backendandapi.api.responses.CatImageGeneratorAPIResponse;
import com.example.backendandapi.api.validators.RequestBodyValidator;
import com.example.backendandapi.memory.Cachedb;
import com.example.backendandapi.services.ResponseFormatterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {
    ResponseFormatterService service;
    RequestBodyValidator validator;
    Cachedb cachedb;

    @Autowired
    public APIController(ResponseFormatterService service, RequestBodyValidator validator, Cachedb cachedb) {
        this.service = service;
        this.validator = validator;
        this.cachedb = cachedb;
    }

    @GetMapping("/api/image-links")
    public ResponseEntity<APIResponseInterface[]> getResponse(@RequestParam String breed, @RequestParam int imageNumber) {
        if(!validator.validateData(breed, imageNumber)) {
            return service.getRequestError(400);
        }

        return service.getFormattedResponse(new APIRequestBody(cachedb.getBreed(breed), imageNumber));
    }
}
