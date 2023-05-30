/**
 * @param {any[]} arr
 * @param {number} depth
 * @return {any[]}
 */
var flat = function (arr, n) {
    // Use recursion to flatten the array
    const flattened = [];

    const flatten = function (arr, depth) {
        for (let i = 0; i < arr.length; i++) {
            if (Array.isArray(arr[i]) && depth > 0) {
                flatten(arr[i], depth - 1);
            } else {
                flattened.push(arr[i]);
            }
        }
    };

    flatten(arr, n);

    return flattened;
};
