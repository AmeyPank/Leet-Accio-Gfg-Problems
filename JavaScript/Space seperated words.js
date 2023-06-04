function numOfWords(str) {
    // write code here
    // return the output , do not use console.log here
    // Remove leading and trailing whitespace
    const trimmedStr = str.trim();

    // Split the string into an array of words based on whitespace
    const words = trimmedStr.split(/\s+/);

    // Return the length of the array
    return words.length;
}
