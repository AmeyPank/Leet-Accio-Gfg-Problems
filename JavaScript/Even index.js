function evenIndices(arr) {
    if(arr.length===0){
        return [];
    }
        return arr.filter(function(item, index){
            return index % 2 ==0;
        })
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
    
        console.log(evenIndices(Arr).join(" "));
      }
    
    
    
    