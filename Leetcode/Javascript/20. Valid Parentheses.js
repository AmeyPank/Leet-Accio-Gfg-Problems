/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    const stack = [];
    const map = {
      '(': ')',
      '{': '}',
      '[': ']'
    };
  
    for (let i = 0; i < s.length; i++) {
      const char = s[i];
      if (map[char]) { // If the character is an opening bracket, push it onto the stack
        stack.push(char);
      } else if (char !== map[stack.pop()]) { // If the character is a closing bracket, check whether it matches the top of the stack
        return false; // If it doesn't match or the stack is empty, the string is invalid
      }
    }
  
    return stack.length === 0; // If we made it through the loop and the stack is empty, the string is valid
  };