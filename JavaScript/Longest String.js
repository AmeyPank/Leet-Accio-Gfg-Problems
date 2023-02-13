
function longestString(arr) {
    let result = '';
        for(let i= 0;i<arr.length;i++){
            let currentItem = arr[i];
            if(currentItem.length>result.length){
                result = arr[i];
            }
        }
        return result;
    }
    //in ES6 using reduce method
    // const longString = (arr) =>{
    // 	return arr.reduce((str1, str2)=>{
    // 		return str1.length - str2.length => 0 ? str1 : str2;
    // 	});
    // }
    
    
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
     
    
        let Arr = inputArr[1].split(" ").map((x) => (x));
    
        console.log(longestString(Arr));
      }
    
    
    
    