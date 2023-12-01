import { downloadImage } from '../../image-downloader/index.js';

const saveButton = document.querySelector('.save-button');

saveButton.addEventListener('click', () => {
    downloadImage();
});