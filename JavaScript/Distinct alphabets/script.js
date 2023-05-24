
function countAlphabetOccurrences(str) {
    const counts = new Array(26).fill(0); // Array to store counts for each alphabet

    // Iterate over each character in the string
    for (let i = 0; i < str.length; i++) {
        const char = str.charAt(i).toLowerCase();
        if (char >= 'a' && char <= 'z') {
            const index = char.charCodeAt(0) - 'a'.charCodeAt(0);
            counts[index]++;
        }
    }

    return counts;
}

// Example usage:
const input = 'stole now noch';
const occurrences = countAlphabetOccurrences(input);
console.log(occurrences.join(' '));
