const InsertionSort = (n, arr) => {
    //return the sorted array
    //do not console.log here
    for (let i = 1; i < n; i++) {
        let current = arr[i];
        let j = i - 1;

        while (j >= 0 && arr[j] > current) {
            arr[j + 1] = arr[j];
            j--;
        }

        arr[j + 1] = current;
    }

    return arr;
};




var readline = require("readline").createInterface(process.stdin);

let inputArr = [];
var lineNumber = -1;
var inputSize;
var K;
readline.on("line", readInputs);

function readInputs(line) {
    inputArr.push(line);
    lineNumber++;
    if (lineNumber == 0) {
        size = parseInt(inputArr[0]);
    }

    if (lineNumber == 2 * size) {
        logic("s");
        readline.close();
    }
}

function logic(input) {
    const T = size;
    for (let i = 1; i <= T * 2; i = i = i + 2) {
        let N = parseInt(inputArr[i]);
        let Arr = inputArr[i + 1].split(" ").map((x) => parseInt(x));
        console.log(InsertionSort(N, Arr).join(" ").trim());
    }
}

