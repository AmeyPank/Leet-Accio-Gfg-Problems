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
var maxLevelSum = function (root) {
    let maxSum = Number.MIN_SAFE_INTEGER;
    let ans = 0;
    let level = 0;

    let q = [];
    q.push(root);

    while (q.length !== 0) {
        level++;
        let sumAtCurrentLevel = 0;

        // Iterate over all the nodes in the current level.
        for (let sz = q.length; sz > 0; --sz) {
            let node = q.shift();
            sumAtCurrentLevel += node.val;

            if (node.left !== null) {
                q.push(node.left);
            }
            if (node.right !== null) {
                q.push(node.right);
            }
        }

        if (maxSum < sumAtCurrentLevel) {
            maxSum = sumAtCurrentLevel;
            ans = level;
        }
    }

    return ans;
};
