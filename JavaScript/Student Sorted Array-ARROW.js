function sortStudents(arr) {
    // return the sorted array
    // do not console.log here
    // extract the names of the students
    const names = arr.map(student => student[0]);// map returns Array
    // sort the names alphabetically
    names.sort();
    return names;
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
    let str = JSON.parse(inputArr[0].trim());
    console.log(sortStudents(str).join(" "));
}
