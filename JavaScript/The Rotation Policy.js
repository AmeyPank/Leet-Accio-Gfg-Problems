function RotationPolicy(a, b) {
    // write code here
    // do no console.log the answer
    // return the output using return keyword
  let count = 0;
  for(let i=a; i<=b; i++){
      if((i-1) % 2 !== 0 && (i-1) % 3 !==0){
          count++;
      }
  }
      return count;
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
    // if (lineNumber == 0) {
    //   size = parseInt(inputArr[0]);
    // }
    //Exit Condition
    if (lineNumber == 0) {
      logic("s");
      readline.close();
    }
  }
  
  function logic(input) {
    const [n1, n2] = inputArr[0].split(" ").map((x) => parseInt(x));
    console.log(RotationPolicy(n1, n2));
  }
  