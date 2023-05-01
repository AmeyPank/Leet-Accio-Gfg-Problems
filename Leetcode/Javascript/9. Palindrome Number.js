/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(num) {
    // Convert the number to a string
    const str = num.toString();
  
    // Loop through the string, comparing the characters at opposite ends
    for (let i = 0; i < Math.floor(str.length / 2); i++) {
      if (str[i] !== str[str.length - 1 - i]) {
        return false; // If any characters don't match, it's not a palindrome
      }
    }
  
    return true; // If we made it through the loop, it's a palindrome!
  };  