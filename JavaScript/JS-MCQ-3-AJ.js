// Callbacks

x((a,b,c) =>{
    return a+b+c;
},2,3,6)

function x(callback, a,b,c){
    let str = ""
    setTimeout(() =>{
        str +="x"
    });
    str += callback(a,b,c);
    console.log(str);
}