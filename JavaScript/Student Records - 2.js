function StudentRecords(data) {
    const students = data;

    // Filter the student records with more than 50 marks
    const highScorers = students.filter((student) => student.marks > 50);

    return highScorers;
}

const rl = require("readline");
const reader = rl.createInterface({
    input: process.stdin,
    output: process.stdout,
});

let inputData = ""; // Accumulate the input lines

reader.on("line", (line) => {
    inputData += line; // Append the current line to the accumulated input

    try {
        const data = JSON.parse(inputData); // Attempt to parse the accumulated input as JSON
        const result = StudentRecords(data);
        console.log(result.map(({ name, id, marks }) => ({ name, id, marks }))); /// output format

        // Reset the accumulated input for the next JSON object
        inputData = "";
    } catch (error) {
        // JSON parsing failed, the input is still incomplete
        // Continue accumulating the lines until a complete JSON is received
    }
});
