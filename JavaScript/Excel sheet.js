function findRowNumber(str) {
    // write your code here
      const modulo = 1e9 + 7;
      let rowNumber = 0;
      for (let i = 0; i < str.length; i++) {
          const charCode = str.charCodeAt(i) - 64; // A has ASCII code 65, 
          // so subtracting 64 gives the corresponding value
          rowNumber = (rowNumber * 26 + charCode) % modulo;
      }
      return rowNumber;
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
    
      console.log(findRowNumber(word1));
      
  }
  
  