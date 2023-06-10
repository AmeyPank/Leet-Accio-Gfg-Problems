function reverseString(string) {
    // return the reversed string
    // do not console.log here
    // code here
    // Split the string into an array of characters
    let stringArray = string.split('');

    // Reverse the array
    let reversedArray = stringArray.reverse();

    // Join the array elements into a string
    let reversedString = reversedArray.join('');

    // Return the reversed string
    return reversedString;

}

function reverseString(string) {
    return string.split('').reverse().join('');
}