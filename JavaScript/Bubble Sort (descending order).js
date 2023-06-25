/*Bubble Sort (descending order)
Given an array, sort the array in reverse order by simply swapping its adjacent elements.

This is JS only question.

Input Format
First line of the input contains an integer, N, which denotes the length of the array. Next N inputs are elements of the array that is to be sorted in descending order.

Output Format
Output sorted array in descending order where each element is space separated.

Example 1
Input

 6
 3 1 2 7 9 87


Output

  87 9 7 3 2 1*/ 

const BubbleSort = (arr, n) => {
  // Loop through the array
  for (let i = 0; i < n - 1; i++) {
    // Perform a pass through the array
    for (let j = 0; j < n - i - 1; j++) {
      // Swap adjacent elements if they are in the wrong order
      if (arr[j] < arr[j + 1]) {
        [arr[j], arr[j + 1]] = [arr[j + 1], arr[j]];
      }
    }
  }

  // Return the sorted array
  return arr;
};


var readline = require("readline").createInterface(process.stdin);

let inputArr = [];
var lineNumber = -1;
var inputSize;
var K;

//multipleline input from User
readline.on("line", readInputs);

function readInputs(line) {
  inputArr.push(line);
  lineNumber++;
  if (lineNumber == 0) {
    size = parseInt(inputArr[0]);
  }
  //else if (lineNumber < size) {
  // }

  //Exit Condition
  if (lineNumber == 1) {
    logic("s");
    readline.close();
  }
}

function logic(input) {
  const N=size;
  const Arr=inputArr[1].split(" ").map(x=>parseInt(x));
  console.log(BubbleSort(Arr,N).join(" ").trim());
}

