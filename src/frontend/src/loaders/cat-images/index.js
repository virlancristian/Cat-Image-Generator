import { unloadImages } from '../../unloaders/remove-cat-images/index.js';
import { loadSaveButton } from '../save-button/index.js';

const loadImages = (URLS) => {
    const catImgDiv = document.querySelector('.cat-images');

    unloadImages();

    for(const imageURL of URLS) {
        const catImage = document.createElement('img');

        catImage.src = imageURL['url'];
        catImgDiv.appendChild(catImage);
    }

    loadSaveButton();
};

export { loadImages }