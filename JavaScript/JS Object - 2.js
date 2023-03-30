function getObjKeys(obj){
    // write code here
   // return the answer, dont use console.log here
      return Object.keys(obj).join(',');
  }
  
  
  const rl = require('readline')
  const reader = rl.createInterface({
    input: process.stdin,
    output: process.stdout
  })
   
  
  reader.on('line',(line)=>{
    const obj = JSON.parse(line)
    console.log(getObjKeys(obj))
  })