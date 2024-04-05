const qrText = document.getElementById('qr-text');
const sizes = document.getElementById('sizes');
const generateBtn = document.getElementById('generateBtn');
const downloadBtn = document.getElementById('downloadBtn');

const qrContainer = document.querySelector('.qr-body');
let size; // Declare size variable

generateBtn.addEventListener('click', (e) => {
    e.preventDefault(); // Prevent page refresh
    isEmptyInput();
});

sizes.addEventListener('change', (e) => {
    size = e.target.value; // Update size variable
    isEmptyInput();
});

downloadBtn.addEventListener('click', (e) => {
    e.preventDefault(); // Prevent default anchor behavior
    let img = document.querySelector('.qr-body img');
    if (img !== null) {
        let imgAtrr = img.getAttribute('src');
        downloadBtn.setAttribute("href", imgAtrr);
    } else {
        downloadBtn.setAttribute("href", `${document.querySelector('canvas').toDataURL()}`);
    }
});

function isEmptyInput() {
    if (qrText.value.length > 0) {
        generateQRCode();
    } else {
        alert("Enter the text or URL to generate the code");
    }
}

function generateQRCode() {
    new QRCode(qrContainer, {
        text: qrText.value,
        height: size,
        width: size,
        colorLight: "#fff",
        colorDark: "#000",
    });
}
