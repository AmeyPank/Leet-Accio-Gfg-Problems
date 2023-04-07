/*
 * Complete the 'miniMaxSum' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 * Given five positive integers, find the minimum and maximum 
 * values that can be calculated by summing exactly four of the
 *  five integers. Then print the respective minimum and maximum 
 * values as a single line of two space-separated long integers.
 */

function miniMaxSum(arr) {
    // Write your code here
    let min = Number.MAX_VALUE;
    let max = Number.MIN_VALUE;
    let sum = 0;

    // Find the minimum and maximum values in the array, and calculate the sum of all elements
    for(let i = 0; i < arr.length; i++) {
        sum += arr[i];
        if(arr[i] < min) {
        min = arr[i];
        }
        if(arr[i] > max) {
        max = arr[i];
        }
    }

    // Calculate the minimum and maximum sum by subtracting the min or max value from the total sum
    let minSum = sum - max;
    let maxSum = sum - min;

    // Print the results
    console.log(minSum + " " + maxSum);

}