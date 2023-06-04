/**
 * @param {number[]} salary
 * @return {number}
 */
var average = function (salary) {
    // Sort the array in ascending order
    salary.sort(function (a, b) {
        return a - b;
    });

    // Remove the first and last elements
    salary.shift();
    salary.pop();

    // Calculate the sum of the remaining values
    let sum = 0;
    for (let num of salary) {
        sum += num;
    }

    // Calculate the average and return it
    return sum / salary.length;
};