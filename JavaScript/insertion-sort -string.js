// Approach 1:
// We can use the basic insertion sort algorithms on each string of the array.
// we can compare it with other strings using the localeCompare function starting from the last until we get the correct position for that string.
// We need to repeat this step for each string in the array
// Time Complexity:

// O(N^2), where N is the number of strings in the array (for this will be constant)

// Space Complexity:

// O(1), no extra space required.

// Below is the implementation of the above idea:

// 1. Javascript Function

function Main(input) {
  const inputs = input.split("\n"); //const N = Number(inputs[0]); const arr = inputs[0].split(' ');

  let res = easySorting(arr);
  print(res);

  function print(res) {
    for (let i = 0; i < 5; i++) process.stdout.write(res[i] + " ");
  }
  function easySorting(arr) {
    for (let i = 1; i < 5; i++) {
      let str = arr[i];
      let j = i - 1;
      while (j >= 0 && arr[j].toString().localeCompare(str) > 0) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = str;
    }
    return arr;
  }
}

Main(require("fs").readFileSync("/dev/stdin", "utf8"));