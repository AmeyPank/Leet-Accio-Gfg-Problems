/**
You are given an array prices where prices[i] is the price of a given stock on the 
ith day, and an integer fee representing a transaction fee.

Find the maximum profit you can achieve. You may complete as many transactions 
as you like, but you need to pay the transaction fee for each transaction.
Note: You may not engage in multiple transactions simultaneously (i.e., you must 
sell the stock before you buy again).
 * @param {number[]} prices
 * @param {number} fee
 * @return {number}
 */
var maxProfit = function (prices, fee) {
    const n = prices.length;
    let hold = -prices[0];
    let free = 0;

    for (let i = 1; i < n; i++) {
        const prevHold = hold;
        const prevFree = free;
        hold = Math.max(prevHold, prevFree - prices[i]);
        free = Math.max(prevFree, prevHold + prices[i] - fee);
    }

    return free;
};
