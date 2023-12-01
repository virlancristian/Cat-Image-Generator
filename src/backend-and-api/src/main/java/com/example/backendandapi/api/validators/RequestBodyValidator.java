package com.example.backendandapi.api.validators;

import com.example.backendandapi.memory.Cachedb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RequestBodyValidator {
    Cachedb cachedb;

    @Autowired
    public RequestBodyValidator(Cachedb cachedb) {
        this.cachedb = cachedb;
    }

    public boolean validateData(String breed, int imageNumber) {
        return (imageNumber > 0 &&
                (cachedb.containsBreed(breed) || breed.equals("")));
    }
}
