function StudentRecords(Data){
    let names = [];
       for (let i = 0; i< Data.length; i++){
           if(Data[i].marks >50){
               names.push(Data[i].name)
           }
       } 
       return names;
   }
  
  const rl = require('readline')
   
  
   const reader = rl.createInterface({
    input: process.stdin,
    output: process.stdout
   })
   
  
   reader.on('line', (line) => {
    let str=line
   str = str.replace(/\\/g, '');
   const A=JSON.parse(str)
  
  console.log(StudentRecords(A))
  
   })
   
   
  