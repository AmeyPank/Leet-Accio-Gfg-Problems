var fourSum = function(nums, target) {
    // initialize an empty array to store the quadruples
    const quadruples = [];
  
    // sort the input array in ascending order
    nums.sort((a, b) => a - b);
  
    // iterate over each unique combination of four elements in the array
    for (let i = 0; i < nums.length - 3; i++) {
      if (i > 0 && nums[i] === nums[i - 1]) continue; // avoid duplicates
      for (let j = i + 1; j < nums.length - 2; j++) {
        if (j > i + 1 && nums[j] === nums[j - 1]) continue; // avoid duplicates
        let left = j + 1,
          right = nums.length - 1;
        while (left < right) {
          const sum = nums[i] + nums[j] + nums[left] + nums[right];
          if (sum === target) {
            quadruples.push([nums[i], nums[j], nums[left], nums[right]]);
            left++;
            right--;
            while (left < right && nums[left] === nums[left - 1]) left++; // avoid duplicates
            while (left < right && nums[right] === nums[right + 1]) right--; // avoid duplicates
          } else if (sum < target) {
            left++;
          } else {
            right--;
          }
        }
      }
    }
  
    // return the array of quadruples
    return quadruples;
  };
  
  /*Do not change the code below */
  
  var readline = require("readline").createInterface(process.stdin);
  
  let inputArr = [];
  var lineNumber = -1;
  readline.on("line", readInputs);
  
  function readInputs(line) {
    inputArr.push(line);
    lineNumber++;
    if (lineNumber == 0) {
      // size = parseInt(inputArr[0].trim());
    }
    //Exit Condition
    if (lineNumber == 1) {
      logic("s");
      readline.close();
    }
  }
  
  function logic(input) {
    let [N, target] = inputArr[0].split(" ").map((x) => +x);
    let Arr = inputArr[1].trim().split(" ").map((x) => +x);
   const Ans= fourSum(Arr, target);
   Ans.map(x=>console.log(x.join(" ")));
  }
  