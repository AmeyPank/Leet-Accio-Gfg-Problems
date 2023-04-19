const chocolate = (n, k, Arr) => {
    // do not console.log here
    // return the value
    // Your code here 
    let totalChocolates = 0;
    let bags = Arr.slice(0);

    // sort the bags in descending order
    bags.sort((a, b) => b - a);

    for (let i = 0; i < k; i++) {
        let maxChocolates = bags[0];
        totalChocolates += maxChocolates;
        bags[0] = Math.floor(maxChocolates / 2);
        bags.sort((a, b) => b - a);
    }

    return totalChocolates;
};

/*Do not change the code below */

var readline = require("readline").createInterface(process.stdin);

let inputArr = [];
var lineNumber = -1;
readline.on("line", readInputs);

function readInputs(line) {
    inputArr.push(line);
    lineNumber++;
    if (lineNumber == 1) {
        //size = parseInt(inputArr[0].trim());
    }
    //Exit Condition
    if (lineNumber == 1) {
        logic("s");
        readline.close();
    }
}

function logic(input) {
    let [n, k] = inputArr[0].trim().split(" ").map(x => +x)
    let Arr = inputArr[1].trim().split(" ").map(x => +x);
    console.log(chocolate(n, k, Arr));
}
