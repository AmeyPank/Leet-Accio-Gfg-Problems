// 2148. Count Elements With Strictly Smaller and Greater Elements
/**
 * @param {number[]} nums
 * @return {number}
 */
var countElements = function (nums) {
    var count = 0;

    for (var i = 0; i < nums.length; i++) {
        var currentElement = nums[i];
        var smallerExists = false;
        var greaterExists = false;

        for (var j = 0; j < nums.length; j++) {
            if (nums[j] < currentElement) {
                smallerExists = true;
            } else if (nums[j] > currentElement) {
                greaterExists = true;
            }
        }

        if (smallerExists && greaterExists) {
            count++;
        }
    }

    return count;
};