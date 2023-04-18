function whichDay(date) {
    const daysOfWeek = ["last", "first", "second", "third", "fourth", "fifth", "sixth"];
    const dayOfWeek = daysOfWeek[date.getDay()];
  
    return `Today is the ${dayOfWeek} day of the week`;
  }
  
  const rl = require('readline')
   
  
   const reader = rl.createInterface({
    input: process.stdin,
    output: process.stdout
   })
   
  
   reader.on('line', (line) => {
    const [yyyy, mm, dd] = line.split(" ")
   
  
    const date = new Date(yyyy, mm, dd)
    const ans = whichDay(date)
    console.log(ans);
   
  
   })
  