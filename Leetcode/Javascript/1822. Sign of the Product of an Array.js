/**
 * @param {number[]} nums
 * @return {number}
 */
var arraySign = function (nums) {
    let negativeCount = 0;

    for (let num of nums) {
        if (num === 0) {
            return 0; // If any element is 0, the product will be 0
        } else if (num < 0) {
            negativeCount++; // Increment the count for negative values
        }
    }

    // Determine the sign based on the number of negative values
    return negativeCount % 2 === 0 ? 1 : -1;
};