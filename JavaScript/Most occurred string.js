function MostOccured(N, myArr) {
    let counts = {};
    let maxCount = 0;
    let mostFrequentString = '';
  
    // Count the frequency of each string
    for (let i = 0; i < N; i++) {
      let string = myArr[i];
      counts[string] = (counts[string] || 0) + 1;
      if (counts[string] > maxCount) {
        maxCount = counts[string];
        mostFrequentString = string;
      } else if (counts[string] === maxCount && string > mostFrequentString) {
        mostFrequentString = string;
      }
    }
  
    return mostFrequentString;
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
    if (lineNumber == size) {
      logic("s");
      readline.close();
    }
  }
  
  function logic(input) {
    const N = +inputArr[0];
    inputArr.shift();
  
    console.log(MostOccured(N, inputArr));
  }
  
  
  