package com.example.backendandapi.api.responses;

public class CatAPISearchResponse implements APIResponseInterface{
    String id;
    String url;

    public CatAPISearchResponse() {}

    public CatAPISearchResponse(String id, String url) {
        this.id = id;
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
        return "CatAPISearchResponse{" +
                "id='" + id + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
