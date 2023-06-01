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
        console.log(PrintQuickSort(N, Arr).join(" ").trim());
    }
}

function quickSort(arr, low = 0, high = arr.length - 1) {
    if (low < high) {
        // Partition the array and get the pivot index
        const pivotIndex = partition(arr, low, high);

        // Recursively call quickSort on the left and right subarrays
        quickSort(arr, low, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, high);
    }
}

function partition(arr, low, high) {
    // Select the rightmost element as the pivot
    const pivot = arr[high];

    // Initialize the partition index (index of smaller element)
    let partitionIndex = low;

    for (let i = low; i < high; i++) {
        // If the current element is smaller than or equal to the pivot
        if (arr[i] <= pivot) {
            // Swap arr[i] and arr[partitionIndex]
            [arr[i], arr[partitionIndex]] = [arr[partitionIndex], arr[i]];
            partitionIndex++;
        }
    }

    // Swap the pivot element with the element at the partition index
    [arr[partitionIndex], arr[high]] = [arr[high], arr[partitionIndex]];

    // Return the partition index
    return partitionIndex;
}

const PrintQuickSort = (n, arr) => {
    // do not modify this function
    quickSort(arr, 0, n - 1);
    return arr;
};
