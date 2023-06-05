function StudentRecords(Data) {
    // return using return keyword
    // do not console.log here
    let sum = 0;

    for (let i = 0; i < Data.length; i++) {
        if (Data[i].id > 120) {
            sum += Data[i].marks;
        }
    }

    return sum;
}

/*Do not change the code below*/
const rl = require("readline");

const reader = rl.createInterface({
    input: process.stdin,
    output: process.stdout,
});

reader.on("line", (line) => {
    let str = line;
    str = str.replace(/\\/g, "");
    const A = JSON.parse(str);

    console.log(StudentRecords(A));
});

