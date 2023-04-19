/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function (nums) {
    // Create a new array to hold the unique numbers
    const uniqueNums = [];

    // Loop through each number in the original array
    for (let i = 0; i < nums.length; i++) {
        // If the number hasn't already been added to the new array, add it
        if (!uniqueNums.includes(nums[i])) {
            uniqueNums.push(nums[i]);
        }
    }

    // Modify the original array to contain only the unique numbers
    nums.splice(0, nums.length, ...uniqueNums);

    // Return the length of the modified array
    return nums.length;
};
