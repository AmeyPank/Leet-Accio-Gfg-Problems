function disappearingArray(N, myArr) {
    let missingNums = [];
    let numSet = new Set(myArr); // create a set from the array to remove duplicates
  
    // loop through 1 to N and add any missing numbers to missingNums array
    for (let i = 1; i <= N; i++) {
      if (!numSet.has(i)) {
        missingNums.push(i);
      }
    }
  
    // print the missing numbers
      return missingNums.join(" ");
    // console.log(missingNums.join(' '));
  }
  
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
    const N = +inputArr[0];
    inputArr.shift();
    const Arr = inputArr[0].split(" ").map((x) => +x);
  
    console.log(disappearingArray(N, Arr));
  }
  