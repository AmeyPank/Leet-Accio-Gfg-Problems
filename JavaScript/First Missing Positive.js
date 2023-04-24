function findSmallestMissingPositive(nums) {
    // Step 1: Remove non-positive integers
    nums = nums.filter(num => num > 0);
    
    // Step 2: Sort the array
    nums.sort((a, b) => a - b);
    
    // Step 3: Initialize smallestMissing to 1
    let smallestMissing = 1;
    
    // Step 4: Iterate through the sorted array
    for (let i = 0; i < nums.length; i++) {
      // Step 4a: If current number is equal to smallestMissing, increment smallestMissing
      if (nums[i] === smallestMissing) {
        smallestMissing++;
      }
      // Step 4b: If current number is greater than smallestMissing, return smallestMissing
      else if (nums[i] > smallestMissing) {
        return smallestMissing;
      }
    }
    
    // Step 5: If you reach the end of the array, return smallestMissing
    return smallestMissing;
  }
  
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
   
  
      let Arr = inputArr[1].split(" ").map((x) => parseInt(x));
  
      console.log(findSmallestMissingPositive(Arr));
    }
  
  