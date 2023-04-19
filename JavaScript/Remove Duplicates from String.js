function removeDuplicates(str) {
    // return the string
    // do not console.log here
    // Your code here
    // Split the string into an array of characters
    const chars = str.split('');

    // Create a new array to hold the unique characters
    const uniqueChars = [];

    // Loop through each character in the original array
    for (let i = 0; i < chars.length; i++) {
        // If the character hasn't already been added to the new array, add it
        if (!uniqueChars.includes(chars[i])) {
            uniqueChars.push(chars[i]);
        }
    }

    // Join the unique characters back into a string and return it
    return uniqueChars.join('');
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
        size = parseInt(inputArr[0].trim());
    }
    //Exit Condition
    if (lineNumber == size) {
        logic("s");
        readline.close();
    }
}

function logic(input) {
    for (let i = 1; i <= parseInt(inputArr[0]); i++) {
        console.log(removeDuplicates(inputArr[i].trim()));
    }
}
