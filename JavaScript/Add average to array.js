var readline = require("readline").createInterface(process.stdin);
var dp = new Array(200000);

let inputArr = [];
var lineNumber = -1;
var inputSize;
var K;

//multipleline input from User
readline.on("line", readInputs);

function readInputs(line) {
    inputArr.push(line);
    lineNumber++;
    // if (lineNumber == 0) {
    //size = parseInt(inputArr[0])
    // } else if (lineNumber < size) {
    // }

    //Exit Condition
    if (lineNumber == 0) {
        logic("s");
        readline.close();
    }
}

function logic(input) {
    const arr = JSON.parse(inputArr[0])
    console.log(arr.average())
}

Array.prototype.average = function () {
    // Check if the array is empty
    if (this.length === 0) {
        return 0;
    }

    // Calculate the sum of all elements in the array
    const sum = this.reduce((total, current) => total + current, 0);

    // Calculate the average by dividing the sum by the number of elements
    const average = sum / this.length;

    // Return the average
    return average;
};

// make a method for array average
//code here
