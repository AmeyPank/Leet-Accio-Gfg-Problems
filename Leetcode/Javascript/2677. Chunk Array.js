/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array[]}
 */
var chunk = function (arr, size) {
    // Create an empty array to store the chunks
    var chunkedArray = [];

    // Loop through the original array, incrementing by the chunk size
    for (var i = 0; i < arr.length; i += size) {
        // Extract a chunk of the specified size using the slice method
        var chunk = arr.slice(i, i + size);

        // Push the chunk into the chunked array
        chunkedArray.push(chunk);
    }

    return chunkedArray;
};