
/*Given an array A of positive integers. Your task is to sort them in such a way that the first part of the array contains odd numbers sorted in descending order, rest portion contains even numbers sorted in ascending order.

Input Format
First line of each test case contains an integer N denoting the size of the array. The next line contains N space separated values of the array.

Output Format
Print the space separated values of the modified array.

Example 1
Input

7
1 2 3 5 4 7 10
output

7 5 3 1 2 4 10*/ 
function sortEvenOdd(arr, arrSize) {
  const oddArr = [];
  const evenArr = [];

  // Separate odd and even numbers
  for (let i = 0; i < arrSize; i++) {
    if (arr[i] % 2 === 0) {
      evenArr.push(arr[i]);
    } else {
      oddArr.push(arr[i]);
    }
  }

  // Sort odd numbers in descending order
  oddArr.sort((a, b) => b - a);

  // Sort even numbers in ascending order
  evenArr.sort((a, b) => a - b);

  // Concatenate the sorted odd and even arrays
  return oddArr.concat(evenArr);
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
  let n = parseInt(inputArr[0].trim());
  let Arr = inputArr[1]
    .trim()
    .split(" ")
    .map((x) => parseInt(x));
  console.log(sortEvenOdd(Arr, n).join(" ").trim());
}
