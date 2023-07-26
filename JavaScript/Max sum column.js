function maxColSum(mat) {
    // Initialize a variable to store the maximum sum.
    let maxSum = -Infinity;
    // Initialize a variable to store the index of the column with the maximum sum.
    let maxSumCol = -1;
    // Iterate over the columns in the matrix.
    for (let col = 0; col < mat[0].length; col++) {
        // Initialize a variable to store the sum of the elements in the current column.
        let colSum = 0;
        // Iterate over the rows in the matrix.
        for (let row = 0; row < mat.length; row++) {
            colSum += mat[row][col];
        }
        // If the current column sum is greater than the maximum sum, update the maximum sum and the index of the column with the maximum sum.
        if (colSum > maxSum) {
            maxSum = colSum;
            maxSumCol = col;
        }
    }
    // Return the sum of the column with the maximum sum.
    return maxSum;
}


/*Do not edit the code below*/

var readline = require("readline").createInterface(process.stdin);

let inputArr = [];
let mat = [];
var lineNumber = -1;

readline.on("line", readInputs);

let n, m;

function readInputs(line) {
    inputArr.push(line);
    lineNumber++;

    if (lineNumber == 0) {

        let Arr = inputArr[0].split(" ").map((x) => parseInt(x));
        n = Arr[0];
        m = Arr[1];


    }

    else {
        let Arr = inputArr[lineNumber].split(" ").map((x) => parseInt(x));
        mat.push(Arr);

    }


    if (lineNumber == n) {
        logic("s");
        readline.close();
    }
}

function logic(input) {
    console.log(maxColSum(mat));
}





