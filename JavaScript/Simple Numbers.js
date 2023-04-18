function isAwesome(num) {
    let numArr = num.toString().split("");
    let prevEle = numArr[0];
    let count = 1;
    let is = false;
    for(let i = 1;i<numArr.length;i++){
      if(parseInt(numArr[i])>=1 && parseInt(numArr[i]) <=9 && numArr[i]==prevEle){
        count++;
        if(count >= 3){
          is = true;
          break;
        }
      }
      else{
        count = 1;
        prevEle = numArr[i];
      }
    }
    if (is) {
      return "Awesome";
    } else {
      return "Good";
    }
  }
  
  /*Do not change the code below */
  
  var readline = require("readline").createInterface(process.stdin);
  
  let inputArr = [];
  var lineNumber = -1;
  var inputSize;
  
  //multipleline input from User
  readline.on("line", readInputs);
  
  function readInputs(line) {
      inputArr.push(line);
      lineNumber++;
  
      //Exit Condition
      if (lineNumber == 0) {
          logic("s");
          readline.close();
      }
  }
  
  function logic(input) {
      let str = parseInt(inputArr[0].trim());
      console.log(isAwesome(str));
  }