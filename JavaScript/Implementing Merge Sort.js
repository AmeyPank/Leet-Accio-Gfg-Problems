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
  
  if (lineNumber == 2 * size) {
    logic("s");
    readline.close();
  }
}

function logic(input) {
  const T = size;
  for (let i = 1; i <= T*2; i = i = i + 2) {
    let N = parseInt(inputArr[i]);
    let Arr = inputArr[i + 1].split(" ").map((x) => parseInt(x));
    console.log(MergeSort(N, Arr).join(" ").trim());
  }
}


 

const MergeSort = (N, Arr) => {

  // your code here
  //do not console.log here return the array(sorted)

	// base case: if the array has 1 or 0 elements, it is already sorted
  if (N < 2) {
    return Arr;
  }

  // find the middle index of the array
  const middle = Math.floor(N / 2);

  // divide the array into two halves
  const leftArr = Arr.slice(0, middle);
  const rightArr = Arr.slice(middle);

  // recursively sort the left and right halves of the array
  const sortedLeftArr = MergeSort(leftArr.length, leftArr);
  const sortedRightArr = MergeSort(rightArr.length, rightArr);

  // merge the sorted left and right halves back into a single sorted array
  const mergedArr = [];
  let leftIndex = 0;
  let rightIndex = 0;
  while (leftIndex < sortedLeftArr.length && rightIndex < sortedRightArr.length) {
    if (sortedLeftArr[leftIndex] < sortedRightArr[rightIndex]) {
      mergedArr.push(sortedLeftArr[leftIndex]);
      leftIndex++;
    } else {
      mergedArr.push(sortedRightArr[rightIndex]);
      rightIndex++;
    }
  }
  return mergedArr.concat(sortedLeftArr.slice(leftIndex)).concat(sortedRightArr.slice(rightIndex));
};


