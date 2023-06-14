/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number}
 */
var getMinimumDifference = function (root) {
    // List to store the node values.
    var nodeValues = [];

    function dfs(node) {
        if (node === null) {
            return;
        }

        nodeValues.push(node.val);
        dfs(node.left);
        dfs(node.right);
    }

    dfs(root);

    nodeValues.sort((a, b) => a - b);
    var minDifference = Infinity;
    // Find the difference between every two consecutive values in the array.
    for (var i = 1; i < nodeValues.length; i++) {
        minDifference = Math.min(minDifference, nodeValues[i] - nodeValues[i - 1]);
    }

    return minDifference;
};