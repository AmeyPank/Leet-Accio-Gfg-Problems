/**
 * @param {number} num
 * @return {number}
 */
var addDigits = function (num) {
    while (num >= 10) {
        let sum = 0;
        while (num > 0) {
            sum += num % 10; // Add the last digit to the sum
            num = Math.floor(num / 10); // Remove the last digit from the number
        }
        num = sum; // Update the number with the sum of its digits
    }
    return num;
};
;