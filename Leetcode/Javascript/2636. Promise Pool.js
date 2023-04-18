/**
 * @param {Function[]} functions
 * @param {number} n
 * @return {Function}
 */
const promisePool = async function(functions, n) {
    // Create an array of pending promises
    const pendingPromises = [];
    // Create an array to store the results of the executed promises
    const results = [];
  
    // Create a loop to execute promises
    for (let i = 0; i < functions.length; i++) {
      // If the number of pending promises is less than the pool limit, execute a new promise
      if (pendingPromises.length < n) {
        // Execute the promise and add it to the pending promises array
        const promise = functions[i]();
        pendingPromises.push(promise);
  
        // When the promise resolves, remove it from the pending promises array and add its result to the results array
        promise.then(result => {
          pendingPromises.splice(pendingPromises.indexOf(promise), 1);
          results.push(result);
        });
      } else {
        // If the number of pending promises is equal to the pool limit, wait for one of them to resolve before executing a new one
        await Promise.race(pendingPromises);
        i--;
      }
    }
  
    // Wait for all promises to resolve before returning the results array
    await Promise.all(pendingPromises);
    return results;
  };
  
  
  /**
   * const sleep = (t) => new Promise(res => setTimeout(res, t));
   * promisePool([() => sleep(500), () => sleep(400)], 1)
   *   .then(console.log) // After 900ms
   */