function sumPlusOne(arr) {
    const sum = arr.reduce((acc, curr) => acc + curr + 1, 0);
    return sum;
}

/*  
let sum = 0;

  for (let i = 0; i < arr.length; i++) {
    sum += arr[i] + 1;
  }

  return sum;
*/ 