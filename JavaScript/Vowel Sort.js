/*
You want to implement a function that takes an array of strings and returns a new array with all the strings 
sorted in lexicographic order, but with the restriction that the strings that start with a vowel should come before 
the strings that start with a consonant.

Input Format
First line contain a number N denoting the size of the array followed by an array of strings in the next line.

Output Format
An array of strings representing the elements of arr sorted in lexicographic order, with the strings that start 
with a vowel coming before the strings that start with a consonant.

Example 1
Input

4
godly inder ploma sxewqa
Output

inder godly ploma sxewqa

Explanation

Testcase1: although g is lexicographically smaller than i but inder comes before godly because the problem states 
that we have to consider strings starting with vowels smaller than those starting with consonant.*/ 
function vowelSort(arr) {
    let vowels = [];
    let consonants = [];

    for (let i = 0; i < arr.length; i++) {
        let firstLetter = arr[i][0].toLowerCase();
        if (firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i' || firstLetter == 'o' || firstLetter == 'u') {
            vowels.push(arr[i]);
        } else {
            consonants.push(arr[i]);
        }
    }

    vowels.sort();
    consonants.sort();

    return vowels.concat(consonants);
}


var readline = require("readline").createInterface(process.stdin);

let inputArr = [];
var lineNumber = -1;

readline.on("line", readInputs);

function readInputs(line) {
    inputArr.push(line);
    lineNumber++;

    if (lineNumber == 1) {
        logic("s");
        readline.close();
    }
}

function logic(input) {


    let Arr = inputArr[1].split(" ").map((x) => (x));

    console.log(vowelSort(Arr).join(" "));
}



