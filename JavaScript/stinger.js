function minimumMoves(s, t) {
	let count = 0;
	let i = s.length -1, j = t.length-1;
	while(i >-1 && j >-1){
		if(s[i--] != t[j--]) break;
		count++;
	}
	let total = s.length + t.length;
	return total -(2*count);
}
var readline = require("readline").createInterface(process.stdin);
let inputArr = [];
var lineNumber = -1;

readline.on("line", readInputs);

function readInputs(line) {
  inputArr.push(line);
  lineNumber++;
 
  if (lineNumber ==  1) {
    logic("s");
    readline.close();
  }
}



function logic(input) {
    
    let word1=inputArr[0];
    let word2=inputArr[1];
  
    console.log(minimumMoves(word1, word2));
    
}

