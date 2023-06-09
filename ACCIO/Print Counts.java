const rl = require("readline");

const reader = rl.createInterface({
  input: process.stdin,
  output: process.stdout,
});

reader.on("line", (line) => {
  let str = line;

  //  const A = JSON.parse(str);

  console.log(PrintCharFreq(str));
});

function PrintCharFreq(myStr) {
  let freqMap = new Map();
  for (let i = 0; i < myStr.length; i++) {
    let char = myStr[i];
    freqMap.set(char, (freqMap.get(char) || 0) + 1);
  }
	
  let sortedKeys = Array.from(freqMap.keys()).sort();
  let result = "";
  for (let key of sortedKeys) 
	  result += key + " = " + freqMap.get(key) + "\n";
  return result;
}