interface Girl{
    name:string;
    age:number;
    bust:number;
    waistline ?:number;
    [propname:string]:any;
    say():string
}
interface Teacher extends Girl{
    teach():string;
}
class XiaoJieJie implements Girl{
    name="liuying" 
    age=18
    bust=90
    say(){return "いらしゃいます"}
}
const girl={
    name:'dajiao',age:18,bust:94,waistline:21,sex:'女',say(){return "いらしゃいます"} , teach(){ return'教えてあげます'}
}
const screenResume=(girl:Girl)=>{
    girl.age<24 && girl.bust >=90 && console.log(girl.name+'面接ことができます')
    girl.age>=24 || girl.bust<90 && console.log(girl.name+'面接ことができません')
}
const getResume =(girl:Teacher)=>{
console.log(girl.name+'年龄'+girl.age)
console.log(girl.name+'胸围'+girl.bust)
girl.waistline && console.log(girl.name+'腰围是'+girl.waistline)
girl.sex &&console.log(girl.name+'性别'+girl.sex)
}
screenResume(girl)
getResume(girl)