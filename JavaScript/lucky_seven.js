
function lucky_sevens(arr) {
    // return the answer do not console.log here
	for (let i = 0; i < arr.length - 2; i++) {
    if (arr[i] + arr[i + 1] + arr[i + 2] === 7) {
      return true;
    }
  }
  return false;
}

var readline = require("readline").createInterface(process.stdin);

let inputArr = [];
var lineNumber = -1;
var query;
var K;
readline.on("line", readInputs);

function readInputs(line) {
  inputArr.push(line);
  lineNumber++;

  if (lineNumber === 0) {
    logic("s");
    readline.close();
  }
}

function logic(input) {
  let Arr = JSON.parse(inputArr[0]);
  console.log(lucky_sevens(Arr));
}


