function averageTemperatures(temperatures) {
    const averages = [];

    for (let i = 0; i < temperatures.length; i++) {
        const cityTemperatures = temperatures[i].slice(1); // Get temperatures for the current city
        const sum = cityTemperatures.reduce((acc, temp) => acc + temp, 0);
        const average = sum / cityTemperatures.length;
        averages.push(average);
    }

    return averages;
}

var readline = require("readline").createInterface(process.stdin);
let inputArr = [];
var lineNumber = -1;

readline.on("line", readInputs);

function readInputs(line) {
    inputArr.push(line);
    lineNumber++;

    if (lineNumber == 0) {
        logic("s");
        readline.close();
    }
}



function logic(input) {
    let arr = JSON.parse(inputArr[0]);
    console.log(averageTemperatures(arr).join(" "));

}


