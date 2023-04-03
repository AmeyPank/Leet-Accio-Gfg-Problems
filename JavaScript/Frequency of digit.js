
function countDigitFrequency(n, d) {
    // convert n to a string to iterate over its digits
     const numString = n.toString();
     
     let count = 0;
     
     // iterate over the digits of n and count the occurrences of d
     for (let i = 0; i < numString.length; i++) {
       if (parseInt(numString[i]) === d) {
         count++;
       }
     }
     
     // return the count of occurrences of d
     return count;
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
     
     let num=(inputArr[0]);
     let dig=parseInt(inputArr[1]);
   
     console.log(countDigitFrequency(num, dig));
     
 }
 