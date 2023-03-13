function filterEvenNumbers(arr, isEven) {
    // Write your code here
    // Do not console.log, just return the result.
      const filteredArr = arr.filter(isEven);
        return filteredArr;
  }
  
  const isEven = (num) => num % 2 === 1;
  
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
    const arr = JSON.parse(input[0]).map((e) => parseInt(e, 10));
    console.log(filterEvenNumbers(arr, isEven));
  }
  