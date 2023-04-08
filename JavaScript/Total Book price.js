function totalPrice(arr) {
    // return the sum
  // do not console.log here
      let totalPrice = 0;
    for (let i = 0; i < arr.length; i++) {
      totalPrice += arr[i].price;
    }
    return totalPrice;
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
    let str = JSON.parse(inputArr[0].trim().replace(/\\/g, ""));
    console.log(totalPrice(str));
  }
  