/*Filter Band
You are working on a project for a local music festival. The festival has a list of bands and their corresponding genres, stored in an array of objects. Your task is to create a function that takes in an array of bands and a genre, and returns an array of the bands that belong to that genre.

Input Format
An array of objects, arr, where each object has the following properties:

name (string): the name of the band genre (string): the genre of the band A string, genre, representing the genre to filter by.

Output Format
An array of objects containing only the bands in arr that belong to the specified genre.

Example 1
Input[{"name": "Band 1", "genre":"Rock"},{ "name":"Band 2", "genre":"Pop"},{ "name":"Band 3", "genre":"Rock"}]
Rock
output[{"name":"Band 1","genre":"Rock"},{"name":"Band 5","genre":"Rock"},{"name":"Band 7","genre":"Rock"}]
*/

function filterBands(arr, genre) {
    // Filter the array of bands to only include those that belong to the specified genre
    const filteredBands = arr.filter((band) => band.genre === genre);
  
    // Return the array of filtered bands
    return filteredBands;
  }
  
  var readline = require("readline").createInterface(process.stdin);
  let inputArr = [];
  var lineNumber = -1;
  
  readline.on("line", readInputs);
  
  function readInputs(line) {
    inputArr.push(line);
    lineNumber++;
   
    if (lineNumber ==  1) {
      logic();
      readline.close();
    }
  }
  
  function logic() {
      let arr=JSON.parse(inputArr[0]);
      let genre=inputArr[1];
      const filteredBands = filterBands(arr, genre);
      console.log(JSON.stringify(filteredBands));
  }
  