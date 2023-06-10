// Logic Gates
function solve(operation, input) {
if (operation === "AND") {
    return Number(input[0] && input[1]);
} else if (operation === "OR") {
    return Number(input[0] || input[1]);
} else if (operation === "NOT") {
    return Number(!input[0]);
}
}

/* Do not change the code below */

const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

let operation = "";
let intInputArr = [];

rl.on("line", (input) => {
    if (!operation) {
        operation = input;
    } else {
        intInputArr = input.split(" ").map((x) => parseInt(x));
        const result = solve(operation, intInputArr);
        console.log(result);
        rl.close();
    }
});
