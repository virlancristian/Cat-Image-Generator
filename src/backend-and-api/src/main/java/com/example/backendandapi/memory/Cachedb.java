package com.example.backendandapi.memory;

import com.example.backendandapi.api.responses.CatBreedsAPIResponse;
import com.example.backendandapi.services.FetchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class Cachedb {
    HashMap<String, String> breeds;
    FetchService service;

    @Autowired
    public Cachedb(FetchService service) {
        this.service = service;
        breeds = new HashMap<>();

        initCache();
    }

    private void initCache() {
        CatBreedsAPIResponse[] responses = service.fetchBreeds();

        for(CatBreedsAPIResponse it:responses) {
            breeds.put(it.getName().toLowerCase(), it.getId());
        }
    }

    public boolean containsBreed(String breed) {
        return breeds.containsKey(breed.toLowerCase());
    }

    public String getBreed(String breed) {
        return breeds.get(breed.toLowerCase());
    }
}
