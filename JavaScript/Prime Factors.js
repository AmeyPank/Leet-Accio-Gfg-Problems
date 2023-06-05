function primeFactors(n) {
    const factors = [];
    let divisor = 2;

    while (n > 1) {
        if (n % divisor === 0) {
            factors.push(divisor);
            n /= divisor;
        } else {
            divisor++;
        }
    }

    return factors;
}


/* Do not change the code below  */

const rl = require("readline");
const reader = rl.createInterface({
    input: process.stdin,
    output: process.stdout,
});
reader.on("line", function (line1) {
    const primeFactorsArray = primeFactors(parseInt(line1));
    let output = "";
    for (let i = 0; i < primeFactorsArray.length; i++) {
        output = output + primeFactorsArray[i] + " ";
    }
    console.log(output);
    reader.close();
});
