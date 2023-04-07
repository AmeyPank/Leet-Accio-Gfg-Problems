function reverseWords(str){
    // write code here
    // use console.log to print output
	// Split the sentence into an array of words
  const words = str.split(" ");

  // Loop through each word in the array and reverse the characters
  const reversedWords = words.map(word => word.split("").reverse().join(""));

  // Join the array of reversed words back into a string
  const reversedSentence = reversedWords.join(" ");

  // Print the reversed sentence to the console
  console.log(reversedSentence);
 }

/*Do not change the code below*/
const readline = require('readline');
 const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
  terminal: false
 });
 let noGuessName = []
 rl.on('line', function(line){
  reverseWords(line)
  })

   		
