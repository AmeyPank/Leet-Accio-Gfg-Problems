/*
Pattern making
Given an integer n, your task is to print the pattern as shown in example:-

For n=5, the pattern is:

1

1 2 1

1 2 3 2 1

1 2 3 4 3 2 1

1 2 3 4 5 4 3 2 1

1 2 3 4 3 2 1

1 2 3 2 1

1 2 1

1

Input Format
User Task: Since this will be a functional problem, you don't have to take input. You just have to complete the function pattern_making() that takes the integer n as parameter.

Output Format
Print the pattern as shown.

Example 1
Input

 5
Output

 1
 1 2 1
 1 2 3 2 1
 1 2 3 4 3 2 1
 1 2 3 4 5 4 3 2 1
 1 2 3 4 3 2 1
 1 2 3 2 1
 1 2 1
 1

Example 2
Input

 2
Output

 1
 1 2 1
 1
Constraints
1 <= n <= 100
*/

function pattern(n) {
    // print the pattern using console.log() statements
	let temp = n;
	for(let i = 1; i <= (2 * n) - 1; i++){
		let bagStr = "";
		let k = 1;
		let incre = true;
		if(i <= n){
			for(let j = 1; j <= 2 * i - 1; j++){
				bagStr += k + " ";
				if(k < i && incre){
					k++;
				} else {
					k--;
					incre = false;
				}
			}
		} else {
			for(let j = 2 * (temp - 1) - 1; j >= 1; j--){
				bagStr += k + " ";
				if(k < temp - 1 && incre){
					k++;
				} else {
					k--;
					incre = false;
				}
			}
			temp--;
		}	
		console.log(bagStr);
	}
}

var readline = require("readline").createInterface(process.stdin);

let inputArr = [];
var lineNumber = -1;

readline.on("line", readInputs);

function readInputs(line) {
  inputArr.push(line);
  lineNumber++;
  if (lineNumber == 0) {
    N = parseInt(inputArr[0]);
    logic("s");
    readline.close();
  }
  

}

function logic(input) {
  pattern(N);
}

