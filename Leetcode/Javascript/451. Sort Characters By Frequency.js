/**
 * @param {string} s
 * @return {string}
 */
var frequencySort = function(s) {
    // Create a hash table to store the frequency of each character
    const freq = {};
    for (let i = 0; i < s.length; i++) {
      freq[s[i]] = (freq[s[i]] || 0) + 1;
    }
  
    // Sort the characters in the string based on their frequency
    const sortedChars = Object.keys(freq).sort((a, b) => freq[b] - freq[a]);
  
    // Create a new string by appending each character the number of times it appears in the original string
    let result = '';
    for (let i = 0; i < sortedChars.length; i++) {
      result += sortedChars[i].repeat(freq[sortedChars[i]]);
    }
  
    return result;
  };