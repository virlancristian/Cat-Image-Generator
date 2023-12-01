package com.example.backendandapi.api.responses;

public class CatImageGeneratorAPIResponse implements APIResponseInterface{
    int id;
    String url;

    public CatImageGeneratorAPIResponse() {}

    public CatImageGeneratorAPIResponse(int id, String url) {
        this.id = id;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "CatImageGeneratorAPIResponse{" +
                "id=" + id +
                ", url='" + url + '\'' +
                '}';
    }
}
