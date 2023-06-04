/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function (s) {
    // Convert the string to lowercase and remove non-alphanumeric characters
    s = s.toLowerCase().replace(/[^a-z0-9]/g, '');

    // Check if the string is a palindrome
    let left = 0;
    let right = s.length - 1;
    while (left < right) {
        if (s[left] !== s[right]) {
            return false; // Characters don't match, not a palindrome
        }
        left++;
        right--;
    }
    return true; // All characters matched, it's a palindrome
};


// Another Approach

function isPalindrome(s) {
    // Remove non-alphanumeric characters and convert to lowercase
    s = s.replace(/[^a-zA-Z0-9]/g, "").toLowerCase();

    // Check if the string is a palindrome
    for (let i = 0; i < Math.floor(s.length / 2); i++) {
        if (s[i] !== s[s.length - 1 - i]) {
            return false; // Characters don't match, not a palindrome
        }
    }
    return true; // All characters matched, it's a palindrome
}
