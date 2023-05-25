function sortCase(str) {
    // return the string
    // do not console.log here
    // Your code here
    const upperChars = [];
    const lowerChars = [];

    // Separate uppercase and lowercase characters
    for (let i = 0; i < str.length; i++) {
        const char = str[i];
        if (char >= 'A' && char <= 'Z') {
            upperChars.push(char);
        } else {
            lowerChars.push(char);
        }
    }

    // Sort uppercase and lowercase characters
    upperChars.sort();
    lowerChars.sort();

    let sortedStr = '';
    let upperIndex = 0;
    let lowerIndex = 0;

    // Merge uppercase and lowercase characters maintaining their relative order
    for (let i = 0; i < str.length; i++) {
        const char = str[i];
        if (char >= 'A' && char <= 'Z') {
            sortedStr += upperChars[upperIndex];
            upperIndex++;
        } else {
            sortedStr += lowerChars[lowerIndex];
            lowerIndex++;
        }
    }

    return sortedStr;
}


/*Do not change the code below */

var readline = require("readline").createInterface(process.stdin);

let inputArr = [];
var lineNumber = -1;
readline.on("line", readInputs);

function readInputs(line) {
    inputArr.push(line);
    lineNumber++;
    if (lineNumber == 0) {
        //size = parseInt(inputArr[0].trim());
    }
    //Exit Condition
    if (lineNumber == 0) {
        logic("s");
        readline.close();
    }
}

function logic(input) {
    console.log(sortCase(inputArr[0].trim()));
}
