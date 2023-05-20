function checkAB(s) {
    if (s.length === 0) {
      return "YES";
    }
  
    if (s[0] === "a") {
      if (s[1] === undefined || s[1] === "a") {
        return checkAB(s.slice(1));
      } else if (s[1] === "b" && s[2] === "b") {
        if (s[3] === undefined || s[3] === "a") {
          return checkAB(s.slice(3));
        } else {
          return "NO";
        }
      } else {
        return "NO";
      }
    } else {
      return "NO";
    }
  }
  
  
  
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
    if (lineNumber == 0) {
      logic("s");
      readline.close();
    }
  }
  
  function logic(input) {
    console.log(checkAB(inputArr[0].trim()));
  }
  