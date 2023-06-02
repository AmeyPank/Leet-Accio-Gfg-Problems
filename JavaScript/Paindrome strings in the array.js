function isPalindrome(str) {
    let start = 0;
    let end = str.length - 1;

    while (start < end) {
        if (str[start] !== str[end]) {
            return 0; // Not a palindrome
        }
        start++;
        end--;
    }

    return 1; // Palindrome
}

function palindromes(arr) {
    // return the array
    // do not console.log here
    const palindromes = [];

    for (let i = 0; i < arr.length; i++) {
        if (isPalindrome(arr[i]) === 1) {
            palindromes.push(arr[i]);
        }
    }

    return palindromes;
}

/*Do not change the code below */

var readline = require("readline").createInterface(process.stdin);

let inputArr = [];
var lineNumber = -1;
var inputSize;

//multipleline input from User
readline.on("line", readInputs);

function readInputs(line) {
    inputArr.push(line);
    lineNumber++;

    //Exit Condition
    if (lineNumber == 0) {
        logic("s");
        readline.close();
    }
}

function logic(input) {
    let Arr = JSON.parse(inputArr[0].trim());
    //let k = parseInt(inputArr[1].trim());
    // console.log(Arr,k);
    console.log(palindromes(Arr).join(", "));
}
