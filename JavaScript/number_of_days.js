const rl = require('readline')
 

 const reader = rl.createInterface({
  input: process.stdin,
  output: process.stdout
 })
 

 reader.on('line', (line) => {
  //const [a, b,c] = line.split(" ")
 const m=parseInt(line);

 

  
  console.log(NumberofDays(m));
 

 })
 function NumberofDays(m) {
   
  const d  =new Date(2022,m,0).getDate();
 // console.log(d);
  return d;
  
  }