/**
 * @param {string} s
 * @return {string}
 */
var longestPalindrome = function(s) {
    let longest = "";
    for (let i = 0; i < s.length; i++) {
      for (let j = i + 1; j <= s.length; j++) {
        const substr = s.substring(i, j);
        if (isPalindrome(substr) && substr.length > longest.length) {
          longest = substr;
        }
      }
    }
    return longest;
  };
  
  function isPalindrome(s) {
    let i = 0;
    let j = s.length - 1;
    while (i < j) {
      if (s[i] !== s[j]) {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }