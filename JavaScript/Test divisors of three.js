/*Test divisors of three
You will be given 2 parameters: a low and high number. Your goal is to print all numbers between low and high, and for each of these numbers print whether or not the number is divisible by 3. If the number is divisible by 3, print the word "div3" directly after the number.

Input Format
2 numbers, one will be low and other high.

Output Format
If the number is divisible by 3, print the word "div3" directly after the number.

Example 1
Input

1 6
Output

1 2 3 div3 4 5 6 div3
Explanation

3 and 6 are divisible by 3.*/ 
const DivisibleBy3 = (low, high) => {
    // Your code here
    let res = " ";
    for (let i = low; i <= high; i++) {
        if (i % 3 === 0) {
            res += i + ' div3 ';
        } else {
            res += i + ' ';
        }
    }
    console.log(res.trim());
};

/*Do not change the code below*/
const readline = require("readline");
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
    terminal: false,
});

rl.on("line", (line) => {
    let [low, high] = line.split(" ").map((x) => +x);
    DivisibleBy3(low, high)
});


