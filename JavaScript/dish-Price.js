function totalPrice(arr) {

    let total = 0;
    arr.forEach((item) => {
        total += item[2];
    });
    return total;
}

var readline = require("readline").createInterface(process.stdin);
let inputArr = [];
var lineNumber = -1;

readline.on("line", readInputs);

function readInputs(line) {
    inputArr.push(line);
    lineNumber++;

    if (lineNumber == 0) {
        logic("s");
        readline.close();
    }
}



function logic(input) {
    let arr = JSON.parse(inputArr[0]);
    console.log(totalPrice(arr));

}

