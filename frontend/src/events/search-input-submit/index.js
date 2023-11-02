import { getImageURLS } from '../../fetchers/index.js';

const searchField = document.querySelector('.search-field input');

searchField.addEventListener('keyup', (event) => {
    if(event.key == 'Enter') {
        const breed = searchField.value;
        
        getImageURLS(breed, 1);
    }
});