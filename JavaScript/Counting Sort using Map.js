function countingSort(N, arr) {
    // Find the maximum element in the array
    const maxElement = Math.max(...arr);
  
    // Initialize a count array with all elements as 0
    const count = new Array(maxElement + 1).fill(0);
  
    // Count the occurrences of each element in the array
    for (let i = 0; i < N; i++) {
      count[arr[i]]++;
    }
  
    // Modify the count array to contain the cumulative sum of the counts
    for (let i = 1; i <= maxElement; i++) {
      count[i] += count[i - 1];
    }
  
    // Initialize a sorted array with all elements as 0
    const sortedArr = new Array(N).fill(0);
  
    // Traverse the original array in reverse and place each element at its correct position in the sorted array
    for (let i = N - 1; i >= 0; i--) {
      sortedArr[count[arr[i]] - 1] = arr[i];
      count[arr[i]]--;
    }
  
    // Return the sorted array
    return sortedArr;
  }
  var readline = require("readline").createInterface(process.stdin);
  
  
  
  let inputArr = [];
  var lineNumber = -1;
  var inputSize;
  var K;
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
    const T = inputArr[0];
    
      let Arr = inputArr[1].split(" ").map((x) => parseInt(x));
      console.log(countingSort(Arr.length, Arr).join(" "));
    
  }
  
  