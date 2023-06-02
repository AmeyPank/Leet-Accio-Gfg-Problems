// str1 and str2 are the two input strings
function isAnagram(str1, str2) {
    // Sort the characters of both strings
    const sortedStr1 = str1.split('').sort().join('');
    const sortedStr2 = str2.split('').sort().join('');

    // Compare the sorted strings
    if (sortedStr1 === sortedStr2) {
        return 'YES';
    } else {
        return 'NO';
    }
}


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
    // }
    //Exit Condition
    if (lineNumber == 1) {
        logic("s");
        readline.close();
    }
}

function logic(input) {
    const str1 = inputArr[0].trim();
    const str2 = inputArr[1].trim();
    console.log(isAnagram(str1, str2));
}
