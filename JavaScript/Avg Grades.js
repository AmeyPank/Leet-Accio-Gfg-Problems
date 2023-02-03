function averageGrade(arr) {
    // return the average value
   // do not console.log here
       let avg = 0;
       for(let i = 0; i<arr.length;i++){
           let current = arr[i]
               avg += current; 
       }
       avg = avg / arr.length
       return avg;
   }
   
   
   /*Do not change the code below */
   
   var readline = require("readline").createInterface(process.stdin);
   
   let inputArr = [];
   var lineNumber = -1;
   var inputSize;
   
   //multipleline input from User
   readline.on("line", readInputs);
   
   function readInputs(line) {
     inputArr.push(line);
     lineNumber++;
   
     //Exit Condition
     if (lineNumber == 0) {
       logic("s");
       readline.close();
     }
   }
   
   function logic(input) {
     let str = JSON.parse(inputArr[0].trim());
     console.log(averageGrade(str));
   }
   