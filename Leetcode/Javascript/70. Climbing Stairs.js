/**
 * @param {number} n
 * @return {number}
 */
var climbStairs = function (n) {
    // Base cases
    if (n === 1) return 1;
    if (n === 2) return 2;

    // Initialize variables for the two previous steps
    let prev1 = 1;
    let prev2 = 2;

    // Calculate the number of distinct ways for each step
    for (let i = 3; i <= n; i++) {
        const distinctWays = prev1 + prev2;
        prev1 = prev2;
        prev2 = distinctWays;
    }

    // Return the number of distinct ways to climb to the top
    return prev2;
};
