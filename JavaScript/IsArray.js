var readline = require("readline").createInterface(process.stdin);

let inputArr = [];
var lineNumber = -1;

readline.on("line", readInputs);

function readInputs(line) {
  inputArr.push(line);
  lineNumber++;

  if (lineNumber == 0) {
    logic(inputArr[0]);
    readline.close();
  }
}

function isJsonString(str) {
  try {
    JSON.parse(str);
  } catch (e) {
    return false;
  }
  return true;
}

function isArray(input) {
  // Check if the input is a JavaScript array
  if (Array.isArray(input)) {
    return true;
  }

  // Check if the input is a string representation of an array
  if (typeof input === "string") {
    try {
      const parsedArray = JSON.parse(input);
      return Array.isArray(parsedArray);
    } catch (error) {
      return false;
    }
  }

  return false;
}

function logic(input) {
  const inputs = input.split("\n");

  for (let i = 0; i < inputs.length; i++) {
    const result = isArray(inputs[i]);
    console.log(result);
  }
}
