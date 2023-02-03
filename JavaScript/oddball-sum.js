function oddball_sum(nums) {
    // final count of all odd numbers added up
    let final_count = 0;
    // loop through entire list
    for (let i = 0; i < nums.length; i++) {
    // we divide by 2, and if there is a remainder then
    // the number must be odd so we add it to final_count
    if (nums[i] % 2 === 1) {
    final_count += nums[i]
    }
    }
    console.log(final_count);
    }
   
   /*Do not change the code below*/
   
   const readline = require('readline');
    const rl = readline.createInterface({
     input: process.stdin,
     output: process.stdout,
     terminal: false
    });
    let noGuessName = []
    rl.on('line', function(line){
     noGuessName= line.split(" ").map(a=>parseInt(a))
     oddball_sum(noGuessName)
     })
   