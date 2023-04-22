var readline = require("readline").createInterface(process.stdin);

let inputArr = [];
var lineNumber = -1;

readline.on("line", readInputs);

function readInputs(line) {
  inputArr.push(line);
  lineNumber++;

  if (lineNumber == 1) {
    logic("s");
    readline.close();
  }
}

function logic(input) {
  let N = parseInt(inputArr[0]);
  let Arr = inputArr[1].split(" ").map((x) => parseInt(x));
  console.log(maxSubArraySum(Arr));
}

function maxSubArraySum(arr) {
  let maxSoFar = arr[0]; // maximum sum so far
  let maxEndingHere = arr[0]; // maximum sum ending here
  for (let i = 1; i < arr.length; i++) {
    // calculate the maximum sum ending here for each element in the array
    maxEndingHere = Math.max(maxEndingHere + arr[i], arr[i]);
    // update the maximum sum so far if the maximum sum ending here is greater
    maxSoFar = Math.max(maxSoFar, maxEndingHere);
  }
  return maxSoFar;
}
