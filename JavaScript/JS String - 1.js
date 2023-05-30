
function numOfWords(line) {
    // Use trim() to remove leading and trailing whitespace
    // Use split() to split the string into an array of words
    // Use filter() to remove any empty strings from the array
    // Use length property to get the number of words
    return line.trim().split(" ").filter(word => word !== "").length;
}