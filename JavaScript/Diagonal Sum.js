function DiagonalSum(n, mat) {
    // Initialize variables to store the sums of the primary and secondary diagonals.
    let primaryDiagonalSum = 0;
    let secondaryDiagonalSum = 0;

    // Iterate over the rows in the matrix.
    for (let row = 0; row < n; row++) {
        // Add the current element in the primary diagonal to the sum of the primary diagonal.
        primaryDiagonalSum += mat[row][row];

        // Add the current element in the secondary diagonal to the sum of the secondary diagonal.
        secondaryDiagonalSum += mat[row][n - row - 1];
    }

    // Return the primary and secondary diagonals as a string literal.
    return `${primaryDiagonalSum} ${secondaryDiagonalSum}`;
}


/*Do not change any code below*/
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
    if (lineNumber == size) {
        logic("s");
        readline.close();
    }
}

function logic(input) {
    const N = parseInt(inputArr[0]);
    inputArr.shift();
    let Matrix = [];
    for (let i = 0; i < N; i = i + 1) {
        const Arr = inputArr[i].split(" ").map((x) => +x);
        Matrix.push(Arr);
    }

    console.log(DiagonalSum(N, Matrix));
}


