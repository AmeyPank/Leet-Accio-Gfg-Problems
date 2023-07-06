function singleDigit(n) {
    //complete this function
    //do not console.log here
    while (n >= 10) {
        let sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = Math.floor(n / 10);
        }
        n = sum;
    }
    return n;
}

var readline = require("readline").createInterface(process.stdin);

let inputArr = [];
var lineNumber = -1;
var inputSize;
var K;
readline.on("line", readInputs);

function readInputs(line) {
    inputArr.push(line);
    lineNumber++;

    if (lineNumber === 0) {
        logic("s");
        readline.close();
    }
}

function logic(input) {
    const N = parseInt(inputArr[0]);

    console.log(singleDigit(N));
}


