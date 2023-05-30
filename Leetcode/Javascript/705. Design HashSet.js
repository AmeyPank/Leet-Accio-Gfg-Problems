/**
 * Initialize your data structure here.
 */
var MyHashSet = function () {
    this.set = [];
};

/**
 * Inserts the specified element into the HashSet.
 * @param {number} key
 * @return {void}
 */
MyHashSet.prototype.add = function (key) {
    if (!this.contains(key)) {
        this.set.push(key);
    }
};

/**
 * Removes the specified element from the HashSet if present.
 * @param {number} key
 * @return {void}
 */
MyHashSet.prototype.remove = function (key) {
    const index = this.set.indexOf(key);
    if (index > -1) {
        this.set.splice(index, 1);
    }
};

/**
 * Returns true if this set contains the specified element.
 * @param {number} key
 * @return {boolean}
 */
MyHashSet.prototype.contains = function (key) {
    return this.set.includes(key);
};

// Example usage:
// const myHashSet = new MyHashSet();
// myHashSet.add(1);            // set = [1]
// myHashSet.add(2);            // set = [1, 2]
// console.log(myHashSet.contains(1));    // Output: true
// console.log(myHashSet.contains(3));    // Output: false
// myHashSet.add(2);            // set = [1, 2]
// console.log(myHashSet.contains(2));    // Output: true
// myHashSet.remove(2);         // set = [1]
// console.log(myHashSet.contains(2));    // Output: false
