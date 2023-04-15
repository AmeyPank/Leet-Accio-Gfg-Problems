/*You have a sequence p1, p2, p3..., pn which is a permutation of {1, 2, 3, ..., n}. You can do the following operation at most 1 time: Choose 2 indices i and j. Swap (pi, pj). Can you sort the permutation.

Input Format
The first line of the input contains an integer n, the number of elements in the permutation. The second line contains p1, p2, ..., pn.

Output Format
Output "YES" if it is possible to sort the permutation, else output "NO".

Example 1
Input

 5
 5 2 3 4 1
Output

YES
Explanation

 We can swap p1, p5.
Input

 5
 5 1 2 4 3
Output

NO*/

function SwapIT(n, arr){
    // code here
        let left = -1;
        let right = -1;
        for (let i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                if (left === -1) {
                    left = i;
                }
                right = i + 1;
            }
        }
        if (left !== -1 && right !== -1) {
            [arr[left], arr[right]] = [arr[right], arr[left]];
        }
        for (let i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return "NO";
            }
        }
        return "YES";
    }
    
    /*Do not change the code below*/
    var readline = require("readline").createInterface(process.stdin);
    
    let inputArr = [];
    var lineNumber = -1;
    var inputSize;
    
    //multipleline input from User
    readline.on("line", readInputs);
    
    function readInputs(line) {
      inputArr.push(line);
      lineNumber++;
      if (lineNumber == 0) {
        size = parseInt(inputArr[0]);
      } else if (lineNumber < size) {
      }
    
      //Exit Condition
      if (lineNumber == 1) {
        logic("s");
        readline.close();
      }
    }
    
    function logic(input) {
      const N = +inputArr[0];
      inputArr.shift();
      const Arr = inputArr[0].split(" ").map((x) => +x);
    
      console.log(SwapIT(N,Arr));
    }
    
    
    
    