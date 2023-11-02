import { getImageURLS } from '../../fetchers/index.js';

const searchIcon = document.querySelector('#search-icon');
const searchField = document.querySelector('.search-field input');

searchIcon.addEventListener('click', () => {
    const breed = searchField.value;

    getImageURLS(breed, 1);
});