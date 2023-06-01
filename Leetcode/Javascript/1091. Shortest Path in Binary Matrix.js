/**
 * @param {number[][]} grid
 * @return {number}
 */
var shortestPathBinaryMatrix = function (grid) {
    const n = grid.length;

    // Check if the starting or ending cell is blocked
    if (grid[0][0] === 1 || grid[n - 1][n - 1] === 1) {
        return -1;
    }

    const queue = [[0, 0]]; // Queue for BFS
    const directions = [
        [1, 0], // right
        [1, 1], // bottom right
        [0, 1], // bottom
        [-1, 1], // bottom left
        [-1, 0], // left
        [-1, -1], // top left
        [0, -1], // top
        [1, -1] // top right
    ];

    // Mark the starting cell as visited
    grid[0][0] = 1;

    let pathLength = 1;

    while (queue.length > 0) {
        const size = queue.length;

        for (let i = 0; i < size; i++) {
            const [row, col] = queue.shift();

            if (row === n - 1 && col === n - 1) {
                return pathLength; // Reached the destination
            }

            // Explore all possible directions
            for (const [dx, dy] of directions) {
                const newRow = row + dx;
                const newCol = col + dy;

                // Check if the new coordinates are within the matrix boundaries
                if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < n && grid[newRow][newCol] === 0) {
                    queue.push([newRow, newCol]);
                    // Mark the cell as visited and update its value to the path length
                    grid[newRow][newCol] = pathLength + 1;
                }
            }
        }

        pathLength++;
    }

    return -1; // No valid path found
};