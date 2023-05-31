function takeMultipleNumbersAndAdd(arr) {

    //do not console.log
    // return the sum 
    return arr.reduce((sum, number) => sum + number, 0);

}
/*Do not change the code below*/

var readline = require("readline").createInterface(process.stdin);
let inputArr = [];
var lineNumber = -1;
var inputSize;
var K;

//multipleline input from User
readline.on("line", readInputs);

function readInputs(line) {
    inputArr.push(line);
    lineNumber++;
    //Exit Condition
    if (lineNumber == 0) {
        logic("s");
        readline.close();
    }
}

function logic(input) {
    inputArr = inputArr[0].split(" ").map((x) => +x);
    console.log(takeMultipleNumbersAndAdd(inputArr));
}


