package com.example.backendandapi.services;

import com.example.backendandapi.api.requests.APIRequestBody;
import com.example.backendandapi.api.responses.CatAPISearchResponse;
import com.example.backendandapi.api.responses.CatBreedsAPIResponse;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FetchService {
    RestTemplate restTemplate;
    String CATBREEDS_ENDPOINT_URL = "https://api.thecatapi.com/v1/breeds";
    String SEARCH_ENDPOINT_URL = "https://api.thecatapi.com/v1/images/search";
    @Value("${api.token}")
    String API_TOKEN;

    public FetchService() {
        restTemplate = new RestTemplate();
    }

    @JsonIgnore
    public CatBreedsAPIResponse[] fetchBreeds() {
        CatBreedsAPIResponse[] responses = restTemplate.getForObject(CATBREEDS_ENDPOINT_URL, CatBreedsAPIResponse[].class);

        return responses;
    }

    @JsonIgnore
    public CatAPISearchResponse[] fetchImageURLS(APIRequestBody body) {
        CatAPISearchResponse[] responses = restTemplate.getForObject(SEARCH_ENDPOINT_URL
                                                                        + "?limit=" + body.getImageNumber()
                                                                        + "&breed_ids=" + body.getBreed() + "&api_key=" + API_TOKEN,
                                                                        CatAPISearchResponse[].class);

        return responses;
    }
}
