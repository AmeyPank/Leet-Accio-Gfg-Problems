function sortStrings(arr) {

    return arr.sort();
}

var readline = require("readline").createInterface(process.stdin);

let inputArr = [];
var lineNumber = -1;

readline.on("line", readInputs);

function readInputs(line) {
    inputArr.push(line);
    lineNumber++;

    if (lineNumber === 1) {
        logic(inputArr);
        readline.close();
    }
}

function logic(inputArr) {
    let Arr = inputArr[1].split(" ").map((x) => x);

    console.log(sortStrings(Arr).join(" "));
}
