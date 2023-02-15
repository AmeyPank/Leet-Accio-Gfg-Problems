
function compoundinterest(P, R, T) {
    let A=P*(1 + R / 100)**T;
    let CI = A - P;
      
    return CI.toFixed(2)*1
   
   }
 
 const rl = require('readline')
  
 
  const reader = rl.createInterface({
   input: process.stdin,
   output: process.stdout
  })
  
 
  reader.on('line', (line) => {
   const [a, b,c] = line.split(" ")
  
   const P=parseInt(a)
   const R=parseInt(b)
   const T=parseInt(c)
  
 
   
   console.log(compoundinterest(P, R,T));
  
 
  })
 