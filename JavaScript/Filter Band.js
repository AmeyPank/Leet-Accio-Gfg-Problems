function filterBands(arr, genre){
    var ans = [];
   arr.map((item)=>{
       if(item.genre == genre ) ans.push(item.name); 
   });
   ans.map((item)=> console.log(item));
}

var readline = require("readline").createInterface(process.stdin);
let inputArr = [];
var lineNumber = -1;

readline.on("line", readInputs);

function readInputs(line) {
 inputArr.push(line);
 lineNumber++;

 if (lineNumber ==  1) {
   logic("s");
   readline.close();
 }
}



function logic(input) {
   let arr=JSON.parse(inputArr[0]);
   let genre=inputArr[1];
   filterBands(arr, genre);
   
}



