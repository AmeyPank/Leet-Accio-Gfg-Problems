function StudentRecords(records) {
    var filteredRecords = records.filter(student => student.marks > 50 && student.id > 120);
    var sum = filteredRecords.reduce((total, student) => total + student.marks, 0);
    return sum;
}

/*Do not change the code below*/

const rl = require('readline')
const reader = rl.createInterface({
    input: process.stdin,
    output: process.stdout
})


reader.on('line', (line) => {
    let str = line
    str = str.replace(/\\/g, '');
    const A = JSON.parse(str)

    console.log(StudentRecords(A))

})


