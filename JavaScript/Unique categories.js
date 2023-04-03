
function uniqueCategories(arr) {
    const categories = new Set();
      for (let i = 0; i < arr.length; i++) {
        categories.add(arr[i][1]);
      }
      return Array.from(categories);
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
        let arr=JSON.parse(inputArr[0]);
        let word=inputArr[1];
        console.log(uniqueCategories(arr).join(" "));
        
    }
    