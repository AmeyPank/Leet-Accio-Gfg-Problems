/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function (prices) {
    let maxProfit = 0;
    let minPrice = prices[0];

    for (let i = 1; i < prices.length; i++) {
        if (prices[i] < minPrice) {
            minPrice = prices[i]; // Update the minimum price
        } else {
            const profit = prices[i] - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit; // Update the maximum profit
            }
        }
    }

    return maxProfit;
};
