function largestString(strings) {
    let frequency = {};

    // Count the frequency of each unique string
    for (let i = 0; i < strings.length; i++) {
        let string = strings[i];
        frequency[string] = (frequency[string] || 0) + 1;
    }

    let maxFrequency = 0;
    let lexicographicallyLargest = null;

    // Find the string with maximum frequency
    for (let string in frequency) {
        let count = frequency[string];
        if (count > maxFrequency || (count === maxFrequency && string > lexicographicallyLargest)) {
            maxFrequency = count;
            lexicographicallyLargest = string;
        }
    }

    return lexicographicallyLargest;
}

var readline = require("readline").createInterface(process.stdin);

let inputArr = [];
var lineNumber = -1;
let strs = [];
readline.on("line", readInputs);

function readInputs(line) {
    inputArr.push(line);
    lineNumber++;
    if (lineNumber == 0) {
        size = parseInt(inputArr[0]);
    }

    if (lineNumber > 0) strs.push(line);

    if (lineNumber == size) {
        logic("s");
        readline.close();
    }
}

function logic(input) {



    console.log(largestString(strs));

}







