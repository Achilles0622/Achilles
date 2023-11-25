function join<T>(first:T,second:T){
    return'${first}${second}'
}

join<string>("jspang",".com");
//
function myFun<T>(params:Array<T>){
 return params;
}
myFun<string>(["123","456"]); 