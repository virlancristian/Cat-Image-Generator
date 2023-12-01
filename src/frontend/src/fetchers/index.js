import { loadImages } from '../loaders/cat-images/index.js';

const API_URL = `http://localhost:8080/api/image-links`;

const getImageURLS = (breed, imageNumber) => {
    fetch(API_URL + "?breed=" + breed + "&imageNumber=" + imageNumber, {
        method: 'GET'
    }).then((response) => response.json())
    .then((data) => {
        loadImages(data);
    }).catch(error => {
        console.log(error);
    });
};

export { getImageURLS };
