function msSinceEpoch() {
    // write code here
    // return the output , do not use console.log here
   
      return Date.now();
      
   }
  
  const rl = require('readline')
   
  
   const reader = rl.createInterface({
    input: process.stdin,
    output: process.stdout
   })
   
  
   reader.on('line', (line) => {
    const [line1, ch, hc] = line.split(",")
   
  
    const start = Date.now()
    const ans = msSinceEpoch()
    console.log((start - 100 < ans) && (ans < start+500));
   
  
   })
  
   