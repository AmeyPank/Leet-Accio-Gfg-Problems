function sumWithCallback(arr, callback) {
    // Do not console.log here
    // Just return the output
      for(var i = 0;i<arr.length;i++){
          arr[i]= callback(arr[i]);
      }
      var sum = 0;
  
      arr.forEach(function(val){
          sum = computesum(sum, val);// callback(val)
      })
      return sum;
  }
  
  function computesum(runningsum, currentvalue){
      var newsum = runningsum+currentvalue;
      return newsum;
  }
  
  function multiplyByTwo(num) {
    return num * 2;
  }
  
  const readline = require("readline");
  
  const input = [];
  
  const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
  });
  
  rl.on("line", function (cmd) {
    input.push(cmd);
  });
  
  rl.on("close", function (cmd) {
    Main(input);
  });
  
  function Main(input) {
    const arr = JSON.parse(input[0]);
    console.log(sumWithCallback(arr, multiplyByTwo));
  }
  