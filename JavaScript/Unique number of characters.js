// function countUniqueCharacters(s) {
//   // Create an empty object to store the counts of unique characters
//   const charCount = {};

//   // Iterate over each character in the string
//   for (let char of s) {
//     // Increment the count for the current character in the object
//     charCount[char] = (charCount[char] || 0) + 1;
//   }

//   // Return the count of unique characters
//   return Object.keys(charCount).length;
// }

function countUniqueCharacters(s) {
    // Create a Set to store unique characters
    const uniqueChars = new Set(s);

    // Return the size of the Set
    return uniqueChars.size;
}



/*Do not change the code below */

var readline = require("readline").createInterface(process.stdin);

let inputArr = [];
var lineNumber = -1;
var query = 100000;
var K;
readline.on("line", readInputs);

function readInputs(line) {
    inputArr.push(line);
    lineNumber++;
    if (lineNumber == 0) {
        size = parseInt(inputArr[0]);
    }
    //Exit Condition
    if (lineNumber == 0) {
        logic("s");
        readline.close();
    }
}

function logic(input) {
    //let s = parseInt(inputArr[0].trim());
    //let str1 = inputArr[1].trim();
    let Arr = inputArr[0].trim();

    console.log(countUniqueCharacters(Arr));
}
