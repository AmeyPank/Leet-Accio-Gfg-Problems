
 function compoundinterest(P, R, T) {
    let A=P*(Math.pow((1 + R / 100), T));
    let CI = A - P;
    return Math.round(CI*100)/100;
   
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