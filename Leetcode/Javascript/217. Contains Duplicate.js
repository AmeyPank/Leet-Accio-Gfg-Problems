/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function (nums) {
    const numSet = new Set(nums); // Create a Set from the input array
    return numSet.size !== nums.length; // Compare Set size to array length
};