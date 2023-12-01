package com.example.backendandapi.api.responses;

public class CatBreedsAPIResponse implements APIResponseInterface{
    String id;
    String name;

    public CatBreedsAPIResponse() {}

    public CatBreedsAPIResponse(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CatBreedsAPIResponse{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
