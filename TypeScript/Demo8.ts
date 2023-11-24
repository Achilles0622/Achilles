interface Girl{
    name:string;
    age:number;
    bust:number;
    waistline ?:number;
}
const girl={
    name:'dajiao',age:18,bust:94,waistline:21
}
const screenResume=(girl:Girl)=>{
    girl.age<24 && girl.bust >=90 && console.log(girl.name+'面接ことができます')
    girl.age>=24 || girl.bust<90 && console.log(girl.name+'面接ことができません')
}
const getResume =(girl:Girl)=>{
console.log(girl.name+'年龄'+girl.age)
console.log(girl.name+'胸围'+girl.bust)
girl.waistline && console.log(girl.name+'腰围是'+girl.waistline)
}
screenResume(girl)
getResume(girl)