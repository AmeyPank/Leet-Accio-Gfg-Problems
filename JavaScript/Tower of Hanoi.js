function towerOfHanoi(n, from_rod, to_rod, aux_rod) {  // do not return print using console.log
    if (n === 1) {
        console.log(`${from_rod}->${to_rod}`);
        return;
    }

    towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
    console.log(`${from_rod}->${to_rod}`);
    towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
}

/*Do not edit the code below*/

var readline = require("readline").createInterface(process.stdin);

let inputArr = [];
var lineNumber = -1;
var inputSize;

//multipleline input from User
readline.on("line", readInputs);

function readInputs(line) {
    inputArr.push(line);
    lineNumber++;
    // if (lineNumber == 0) {
    //   size = parseInt(inputArr[0]);
    // } else if (lineNumber < size) {
    // }

    //Exit Condition
    if (lineNumber == 0) {
        logic("s");
        readline.close();
    }
}

function logic(input) {
    const N = parseInt(inputArr[0]);
    towerOfHanoi(N, 'A', 'C', 'B');
}
