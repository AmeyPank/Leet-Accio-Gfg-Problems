function sortStudents(arr) {
    let names = [];
    for (let i = 0; i < arr.length; i++) {
      names.push(arr[i][0]);
    }
    return names.sort();
}  