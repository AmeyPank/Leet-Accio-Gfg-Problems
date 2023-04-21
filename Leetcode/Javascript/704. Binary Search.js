/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var search = function(nums, target) {
    for (var i = 0; i < nums.length; i++) {
        if (nums[i] === target) {
            return i; // found target at index i
        }
    }
    return -1; // target not found
};