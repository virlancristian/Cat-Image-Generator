const unloadImages = () => {
    const catImgDiv = document.querySelector('.cat-images')

    while(catImgDiv.firstChild) {
        catImgDiv.removeChild(catImgDiv.firstChild);
    }
}

export { unloadImages }