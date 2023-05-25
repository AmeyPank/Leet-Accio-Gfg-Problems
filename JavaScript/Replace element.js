// arr is the array of numbers, n is the number fo elements
function replaceArray(arr, n) {
    // write code here
    // do not console.log
    // return the new array
    const modifiedArray = [];

    for (let i = 0; i < n; i++) {
        if (i === 0) {
            // First element
            modifiedArray[i] = arr[i] * arr[i + 1];
        } else if (i === n - 1) {
            // Last element
            modifiedArray[i] = arr[i - 1] * arr[i];
        } else {
            // Other elements
            modifiedArray[i] = arr[i - 1] * arr[i + 1];
        }
    }

    return modifiedArray;
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
    if (lineNumber == 1) {
        logic("s");
        readline.close();
    }
}

function logic(input) {
    let n = parseInt(inputArr[0].trim());
    let Arr = inputArr[1].trim().split(" ").map(x => parseInt(x));
    console.log(replaceArray(Arr, n).join(" ").trim());
}
