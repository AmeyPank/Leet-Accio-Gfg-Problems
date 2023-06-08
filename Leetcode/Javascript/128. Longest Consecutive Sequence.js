/**
 * @param {number[]} nums
 * @return {number}
 */
var longestConsecutive = function (nums) {
    // Create a hash set to store the numbers
    const numSet = new Set(nums);

    let longestStreak = 0;

    // Iterate through each number in the array
    for (const num of numSet) {
        // Check if the current number is the start of a sequence
        if (!numSet.has(num - 1)) {
            let currentNum = num;
            let currentStreak = 1;

            // Count the consecutive elements
            while (numSet.has(currentNum + 1)) {
                currentNum++;
                currentStreak++;
            }

            // Update the longest streak if necessary
            longestStreak = Math.max(longestStreak, currentStreak);
        }
    }

    // Return the length of the longest consecutive sequence
    return longestStreak;
};