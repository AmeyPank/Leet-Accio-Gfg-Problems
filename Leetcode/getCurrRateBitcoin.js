// const https = require('https');

// function convertToWords(number) {
//     // Implement your logic to convert the number to words here
//     // This is just a basic implementation
//     const numberInWords = number.toLocaleString('en-US', { style: 'decimal' });
//     return numberInWords;
// }

// const url = 'https://api.coindesk.com/v1/bpi/currentprice.json';

// https.get(url, (res) => {
//     let data = '';

//     res.on('data', (chunk) => {
//         data += chunk;
//     });

//     res.on('end', () => {
//         const response = JSON.parse(data);
//         const rate = response.bpi.USD.rate;

//         const rateValue = parseInt(rate.replace(',', '').split('.')[0]);
//         const rateInWords = convertToWords(rateValue);

//         console.log(`Current rate of Bitcoin: ${rateInWords} dollars.`);
//     });

// }).on('error', (err) => {
//     console.log('Error:', err.message);
// });

const https = require('https');

// Function to convert a number to words
function convertToWords(number) {
    const units = ['', 'One', 'Two', 'Three', 'Four', 'Five', 'Six', 'Seven', 'Eight', 'Nine', 'Ten',
        'Eleven', 'Twelve', 'Thirteen', 'Fourteen', 'Fifteen', 'Sixteen', 'Seventeen', 'Eighteen', 'Nineteen'];
    const tens = ['', '', 'Twenty', 'Thirty', 'Forty', 'Fifty', 'Sixty', 'Seventy', 'Eighty', 'Ninety'];

    if (number === 0) {
        return 'Zero';
    }

    let words = '';

    if (number < 20) {
        words += units[number];
    } else if (number < 100) {
        words += tens[Math.floor(number / 10)] + ' ' + units[number % 10];
    } else if (number < 1000) {
        words += units[Math.floor(number / 100)] + ' Hundred ' + convertToWords(number % 100);
    } else if (number < 1000000) {
        words += convertToWords(Math.floor(number / 1000)) + ' Thousand ' + convertToWords(number % 1000);
    } else if (number < 1000000000) {
        words += convertToWords(Math.floor(number / 1000000)) + ' Million ' + convertToWords(number % 1000000);
    } else if (number < 1000000000000) {
        words += convertToWords(Math.floor(number / 1000000000)) + ' Billion ' + convertToWords(number % 1000000000);
    }

    return words.trim();
}

const url = 'https://api.coindesk.com/v1/bpi/currentprice.json';

https.get(url, (res) => {
    let data = '';

    res.on('data', (chunk) => {
        data += chunk;
    });

    res.on('end', () => {
        const response = JSON.parse(data);
        const rate = response.bpi.USD.rate;

        // Remove decimal part and commas, and convert rate to an integer
        const rateValue = parseInt(rate.split('.')[0].replace(/,/g, ''));
        // Convert rate to words
        const rateInWords = convertToWords(rateValue);

        console.log(`${rateInWords}`);
    });

}).on('error', (err) => {
    console.log('Error:', err.message);
});
