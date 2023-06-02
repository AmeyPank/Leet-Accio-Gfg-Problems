function StringSum(str) {
    let sum = 0;

    for (let i = 0; i < str.length; i++) {
        const char = str[i];
        const digitValue = parseInt(char, 10);

        if (!isNaN(digitValue)) {
            sum += digitValue;
        }
    }

    return sum;
}



const rl = require('readline')
const reader = rl.createInterface({
    input: process.stdin,
    output: process.stdout
})
reader.on('line', (line) => {
    let str = line;
    str = str.trim();
    console.log(StringSum(str));
})

