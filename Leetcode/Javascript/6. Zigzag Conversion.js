/**
 * @param {string} s
 * @param {number} numRows
 * @return {string}
 */
var convert = function(s, numRows) {
    if (numRows === 1) {
      return s;
    }
    const rows = new Array(numRows).fill("");
    let i = 0;
    let dir = -1;
    for (const c of s) {
      rows[i] += c;
      if (i === 0 || i === numRows - 1) {
        dir = -dir;
      }
      i += dir;
    }
    return rows.join("");
  };