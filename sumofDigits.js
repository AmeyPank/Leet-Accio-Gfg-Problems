// Approach 1
// Algorithm

// Get the number
// Get the remainder and pass the next remaining digits
// Get the rightmost digit of the number with help of the remainder ‘%’ operator by dividing it by 10 and adding it to the sum.
// Divide the number by 10 with help of the ‘/’ operator to remove the rightmost digit.
// Check the base case with n = 0
// Print or return the sum
// Time Complexity

// O(N)

// Space Complexity

// O(1)

// Below is the implementation of the above idea

// 1. JavaScript function

var readline = require("readline").createInterface(process.stdin);

let inputArr = [];
var lineNumber = -1;
var inputSize;
var K;
readline.on("line", readInputs);

function readInputs(line) {
  inputArr.push(line);
  lineNumber++;
  if (lineNumber == 0) {
    size = parseInt(inputArr[0]);
  }

  if (lineNumber == size) {
    logic("s");
    readline.close();
  }
}

function logic(input) {
  const T = size;
  for (let i = 1; i <= T ; i = i = i +1) {
    let N = parseInt(inputArr[i]);
    console.log(SumofDigits(N));
  }
}

function SumofDigits( n) {
  //complete this function
  // write a recursive method
  if (n < 10) return n;
 
  return n % 10 + SumofDigits(Math.floor(n / 10)) 
}