// Approach 1
// Initialize an empty array called counts to store the counts.
// Iterate through the elements in the array. For each element, do the following:
// Initialize a count variable to 0.
// Iterate through the elements after the current element. If the element is a multiple of the current element, increment the count variable.
// Add the count variable to the counts array.
// Return the counts array.
// Time Complexity

// O(N^2)

// Space Complexity

// O(1)

// Below is the implementation of the above idea

// 1. JavaScript function

const Multiple = (N, Arr) => {
  // return the answer as an array
  let counts = [];
  for (let i = 0; i < N; i = i + 1) {
    let count = 0;
    for (let j = i + 1; j < N; j = j + 1) {
      if (Arr[j] % Arr[i] == 0) count++;
    }
    counts.push(count);
  }
  return counts;


};

/*Do Not Change anything below*/
var readline = require("readline").createInterface(process.stdin);

let inputArr = [];
var lineNumber = -1;
var inputSize;

//multipleline input from User
readline.on("line", readInputs);

function readInputs(line) {
  inputArr.push(line);
  lineNumber++;
  if (lineNumber == 0) {
    size = parseInt(inputArr[0]);
  } else if (lineNumber < size) {
  }

  //Exit Condition
  if (lineNumber == 1) {
    logic("s");
    readline.close();
  }
}

function logic(input) {
  const N = parseInt(inputArr[0]);
  inputArr.shift();
  const Arr = inputArr[0].split(" ").map((x) => +x);

  console.log(Multiple(N, Arr).join(" "));
}
