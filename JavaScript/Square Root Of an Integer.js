// function SqrtBinary(x) {
//       return Math.sqrt(x);
//   }
function SqrtBinary(x) {
    if (x < 2) {
        return x;
    }

    let left = 1;
    let right = Math.floor(x / 2);

    while (left <= right) {
        let mid = Math.floor((left + right) / 2);
        let square = mid * mid;

        if (square === x) {
            return mid;
        } else if (square < x) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    return right;
}

var readline = require("readline").createInterface(process.stdin);

let inputArr = [];
var lineNumber = -1;

readline.on("line", readInputs);

function readInputs(line) {
    inputArr.push(line);
    lineNumber++;
    if (lineNumber == 0) {
        size = parseInt(inputArr[0]);
    }

    if (lineNumber == size) {
        logic("s");
        readline.close();
    }
}

function logic(input) {
    const T = size;
    for (let i = 1; i <= T; i = i = i + 1) {
        let N = parseInt(inputArr[i]);

        console.log(SqrtBinary(N));
    }
}

