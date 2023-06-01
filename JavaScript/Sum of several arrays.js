function sum_array(arr) {
    // write code here
    // use console.log for displaying the output
    let sum = 0;

    for (let i = 0; i < arr.length; i++) {
        const innerArray = arr[i];

        for (let j = 0; j < innerArray.length; j++) {
            sum += innerArray[j];
        }
    }

    console.log(sum);
}

const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
    terminal: false
});


rl.on('line', function (line) {
    sum_array(JSON.parse(line))
})


