/*Complete the function checkCanIVote Such that it takes a number as first argument(time) and a number as second argument(age). It returns a promise which resolves or rejected after time milliseconds and if age >= 18, it resolves to "You can vote" else it rejects to "You can not vote".*/
const readline = require('readline');

function checkCanIVote(time, age) {
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

    checkCanIVote(num, op).then((dat) => {
        let end = Date.now()
        console.log(num < end - start < num + 200, dat);
    }).catch((err) => {
        let end = Date.now()
        console.log(num < end - start < num + 200, err);
    }).finally(() => {
        rl.close()
    })
})