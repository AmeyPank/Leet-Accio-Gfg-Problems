const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
  terminal: false,
});

rl.on("line", (line) => {
  let str = line.trim();
  console.log(EvaluateString(str));
});


function isvalidNumber(string){
	return !isNaN(parseInt(string))
}

const EvaluateString = (str) => {
 // Your code here.
	var firstChar = str[0];
	var lastChar = str[str.length-1];
	if(isvalidNumber(firstChar)&& isvalidNumber(lastChar)){
		return eval(str);
	}
	return "Invalid String";
};
