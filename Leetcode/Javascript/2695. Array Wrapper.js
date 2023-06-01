var ArrayWrapper = function (nums) {
    this.nums = nums;
};

ArrayWrapper.prototype.valueOf = function () {
    // Calculate the sum of all numbers in the nums array
    var sum = this.nums.reduce(function (acc, num) {
        return acc + num;
    }, 0);

    return sum;
};

ArrayWrapper.prototype.toString = function () {
    // Convert the nums array to a comma-separated string
    var str = this.nums.join(",");

    return "[" + str + "]";
};
