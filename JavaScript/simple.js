function sqSum(a,b){
    function square(x){
    return x*x;
    }
    return square(a) + square(b);
    }
    console.log(sqSum(2,4));

    let people = function(person, age) {
        this.person = person;
        this.age = age;
        this.info = function() {
          console.log(this);
          setTimeout(() => {
            console.log(this.person + " is " + this.age + " years old");
          }, 3000);
        }
      }
      
      let person1 = new people('John', 21);
      person1.info();