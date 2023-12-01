const downloadImage = () => {
    const image = document.querySelector('.cat-images img')
    const hyperlink = document.createElement('a');

    hyperlink.href = image.src;
    hyperlink.download = 'cute-cat-image.jpg';

    document.body.appendChild(hyperlink);
    hyperlink.click();
    document.body.removeChild(hyperlink);
};

export { downloadImage };