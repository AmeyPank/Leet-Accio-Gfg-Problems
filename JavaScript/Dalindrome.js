function isDalindrome(s) {
    // Check if the entire string is a palindrome
    if (isPalindrome(s)) {
        return "YES";
    }

    // Check if any substring is a palindrome
    for (let i = 0; i < s.length; i++) {
        for (let j = i + 1; j < s.length; j++) {
            const substring = s.substring(i, j + 1);
            if (isPalindrome(substring)) {
                return "YES";
            }
        }
    }

    return "NO";
}

// Helper function to check if a string is a palindrome
function isPalindrome(str) {
    const reversedStr = str.split("").reverse().join("");
    return str === reversedStr;
}

/*Do not change the code below */

var readline = require("readline").createInterface(process.stdin);

let inputArr = [];
var lineNumber = -1;
readline.on("line", readInputs);

function readInputs(line) {
    inputArr.push(line);
    lineNumber++;
    if (lineNumber == 0) {
        //size = parseInt(inputArr[0]);
    }
    //Exit Condition
    if (lineNumber == 0) {
        logic("s");
        readline.close();
    }
}

function logic(input) {
    let s = inputArr[0].trim();

    console.log(isDalindrome(s));
}
