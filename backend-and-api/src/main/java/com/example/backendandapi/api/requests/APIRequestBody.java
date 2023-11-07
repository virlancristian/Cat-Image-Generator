package com.example.backendandapi.api.requests;

public class APIRequestBody {
    String breed;
    int imageNumber;

    public APIRequestBody() {}

    public APIRequestBody(String breed, int imageNumber) {
        this.breed = breed;
        this.imageNumber = imageNumber;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getImageNumber() {
        return imageNumber;
    }

    public void setImageNumber(int imageNumber) {
        this.imageNumber = imageNumber;
    }

    @Override
    public String toString() {
        return "APIRequestBody{" +
                "breed='" + breed + '\'' +
                ", imageNumber=" + imageNumber +
                '}';
    }
}
