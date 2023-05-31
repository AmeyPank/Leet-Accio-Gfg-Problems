function findMax(array) {
    // return the max value
    // do not console.log here
    let max = Number.NEGATIVE_INFINITY; // Set initial max value to negative infinity

    for (let i = 0; i < array.length; i++) {
        for (let j = 0; j < array[i].length; j++) {
            if (array[i][j] > max) {
                max = array[i][j];
            }
        }
    }

    return max;
}


/*Do not change the code below */

var readline = require("readline").createInterface(process.stdin);

let inputArr = [];
var lineNumber = -1;
var inputSize;

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
    let Arr = JSON.parse(inputArr[0].trim());
    //let k = parseInt(inputArr[1].trim());
    // console.log(Arr,k);
    console.log(findMax(Arr));
}
