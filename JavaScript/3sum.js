function threeSum(nums, target) {
    // write your code here
      nums.sort((a, b) => a - b);
        let closestSum = Infinity;
        for (let i = 0; i < nums.length; i++) {
            let left = i + 1;
            let right = nums.length - 1;
            while (left < right) {
                const currSum = nums[i] + nums[left] + nums[right];
                if (Math.abs(currSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currSum;
                }
                if (currSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return closestSum;
    }
    
    module.exports = threeSum;
    