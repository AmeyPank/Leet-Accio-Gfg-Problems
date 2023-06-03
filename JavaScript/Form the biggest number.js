function BiggestNumber(n, Arr) {
    // return the value as a string
    // do not console.log here
    // Convert array elements to strings
    const strArr = Arr.map(String);

    // Sort the strings based on their concatenation order
    const sortedArr = strArr.sort((a, b) => {
        return (b + a) - (a + b);
    });

    // Join the sorted strings to form the largest number
    const largestNumber = sortedArr.join('');

    return largestNumber;
}
var readline = require("readline").createInterface(process.stdin);

let inputArr = [];
var lineNumber = -1;
var inputSize;

readline.on("line", readInputs);

function readInputs(line) {
    inputArr.push(line);
    lineNumber++;
    if (lineNumber == 0) {
        size = parseInt(inputArr[0]);
    } else if (lineNumber < size) {
    }

    //Exit Condition
    if (lineNumber == 1) {
        logic("s");
        readline.close();
    }
}

function logic(input) {
    const N = +inputArr[0];
    inputArr.shift();
    const Arr = inputArr[0].split(" ").map(x => +x);

    console.log(BiggestNumber(N, Arr));
}

