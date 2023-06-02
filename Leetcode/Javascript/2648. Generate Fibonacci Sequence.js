/**
 * @return {Generator<number>}
 */
var fibGenerator = function* () {
    var a = 0, b = 1;

    while (true) {
        yield a;
        [a, b] = [b, a + b];
    }
};

// Creating an instance of the Fibonacci generator
var generator = fibGenerator();

// Generating the Fibonacci sequence
for (var i = 0; i < 10; i++) {
    console.log(generator.next().value);
}


/**
 * const gen = fibGenerator();
 * gen.next().value; // 0
 * gen.next().value; // 1
 */