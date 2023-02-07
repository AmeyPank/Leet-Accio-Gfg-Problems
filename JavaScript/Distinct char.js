// Approach 1:
// Construct a seen array to mark the last index of a character
// Update the seen array for every visited character
// current length of a substring with all distinct character will be i-seen[i]+1
// Maximize this length over the complete string
// Time Complexity

// O(N)

// Space Complexity

// O(N)

// Below is the implementation of the above idea:

// 1. JavaScript

function findLongestSubstring(s) {
  let maxLength = 0;
  let start = 0;
  let seen = {};

  for (let i = 0; i < s.length; i++) {
    if (seen[s[i]]) {
      start = Math.max(start, seen[s[i]]);
    }
    maxLength = Math.max(maxLength, i - start + 1);
    seen[s[i]] = i + 1;
  }

  return maxLength;
}




var readline = require("readline").createInterface(process.stdin);
let inputArr = [];
var lineNumber = -1;

readline.on("line", readInputs);

function readInputs(line) {
  inputArr.push(line);
  lineNumber++;
 
  if (lineNumber ==  0) {
    logic("s");
    readline.close();
  }
}



function logic(input) {
    
    let word1=inputArr[0];
  
    console.log(findLongestSubstring(word1));
    
}
