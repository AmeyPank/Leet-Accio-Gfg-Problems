/*
Given an integer N, your task is to print an array of N elements such that:-

Their sum is 0

All elements are distinct

Difference between maximum and minimum element of the array should be smallest

Input Format
Input contains a single integer N.

Output Format
Print the lexicographically smallest array possible.

i.e Suppose your ans is {1 -1 2 -2 } then lexicographically smallest array will be {-2 -1 1 2}

Example 1
Input

 3
Output

-1 0 1

*/ 


function smallestDifferenceArray(N) {
    let mid = N % 2 == 0 ? N / 2 : Math.floor(N / 2);
     let arr = new Array(N);
     let val = -mid;
   
     // Fill the array with values
     for (let i = 0; i < N; i++) {
       if (i < mid) {
         arr[i] = val++;
       } else if (i == mid && N % 2 == 1) {
         arr[i] = 0;
       } else {
         arr[i] = -arr[N - i - 1];
       }
     }
   
     // Sort the array in ascending order
     arr.sort(function(a, b){return a - b});
   
     return arr;
   }
   
   // // example usage
   // console.log(smallestDifferenceArray(3)); // prints [-1, 0, 1]
   // console.log(smallestDifferenceArray(2)); // prints [-1, 1]
   
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
     console.log(smallestDifferenceArray(N).join(" "));
   }
   