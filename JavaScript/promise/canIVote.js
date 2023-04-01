const readline = require('readline');

function checkCanIVote(time, age) {
    // return the output using return keyword
    // do not console.log it
	return new Promise((resolve, reject) => {
    setTimeout(() => {
      if (age >= 18) {
        resolve("You can vote");
      } else {
        reject("You can not vote");
      }
    }, time);
  });
}

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
    terminal: false
});


rl.on('line', function (line) {
    const args = line.split(" ")
    const num = parseInt(args[0], 10)
    const op = args[1]

    let start = Date.now()

    checkCanIVote(num,op).then((dat)=>{
        let end = Date.now()
        console.log(num< end-start < num + 200, dat);
    }).catch((err)=>{
        let end = Date.now()
        console.log(num< end-start < num + 200, err);
    }).finally(()=>{
        rl.close()
    })
})