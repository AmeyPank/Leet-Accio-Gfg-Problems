// Given a square matrix, calculate the absolute difference between the 
// sums of its diagonals.

// 1 2 3
// 4 5 6
// 9 8 9 
// sum1 = 159=17
// sum2 = 359= 15 
// Diff = 2 

function diagonalDifference(arr) {
    // Initialize variables to hold the two diagonal sums
    let sum1 = 0;
    let sum2 = 0;
  
    // Loop through the matrix and add up the diagonal elements
    for (let i = 0; i < arr.length; i++) {
      // Add up the top-left to bottom-right diagonal
      sum1 += arr[i][i];
  
      // Add up the top-right to bottom-left diagonal
      sum2 += arr[i][arr.length - i - 1];
    }
  
    // Calculate the absolute difference between the two sums
    const diff = Math.abs(sum1 - sum2);
  
    // Return the difference
    return diff;
  }
  