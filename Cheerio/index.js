const request = require('request');

request.get("https://github.com/Anshu-rai89" , function(err, data){

if(err){
    console.log("Error fetching user profile");
}
    console.log(data.body);
    });