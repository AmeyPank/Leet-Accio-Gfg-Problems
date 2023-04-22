var lengthOfLongestSubstring = function(s) {
    let start = 0, end = 0, maxLength = 0;
    const chars = new Set();
    while (end < s.length) {
        if (!chars.has(s[end])) {
            chars.add(s[end]);
            end++;
        } else {
            chars.delete(s[start]);
            start++;
        }
        maxLength = Math.max(maxLength, end - start);
    }
    return maxLength;
};
