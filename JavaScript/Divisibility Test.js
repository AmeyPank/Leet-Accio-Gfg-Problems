//Divisibility Test
//You are given a big number in form of a string A of characters from 0 to 9. Return 1 if it''s divisible by 30 and 0 otherwise.
// A function to check if a string is divisible by 30
function isDivisibleBy30(A) {
    // A number is divisible by 30 if it is divisible by both 3 and 10
    // To check if a number is divisible by 3, we can sum up its digits and see if the sum is divisible by 3
    // To check if a number is divisible by 10, we can see if its last digit is 0
    // We can use the modulo operator (%) to get the remainder of a division

    // Initialize a variable to store the sum of digits
    let sum = 0;

    // Loop through each character of the string
    for (let i = 0; i < A.length; i++) {
        // Convert the character to a number and add it to the sum
        sum += Number(A[i]);
    }

    // Get the last digit of the string
    let lastDigit = Number(A[A.length - 1]);

    // Check if the sum is divisible by 3 and the last digit is 0
    if (sum % 3 === 0 && lastDigit === 0) {
        // Return 1 if true
        return 1;
    } else {
        // Return 0 otherwise
        return 0;
    }
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
    //let n = parseInt(inputArr[0].trim());
    //let str1 = inputArr[1].trim();
    let str = inputArr[0].trim();
    console.log(isDivisibleBy30(str));
}
