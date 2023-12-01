import { getImageURLS } from '../../fetchers/index.js';

const generateButton = document.querySelector('.generate-button');

generateButton.addEventListener('click', () => {
    getImageURLS('', 1);
});