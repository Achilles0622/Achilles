class XiaoJieJie{
    constructor(private _age:number){}
    get age(){
        return this._age-10
    
    }
    set age(age:number){
        this._age=age+3
    }
}
const dajiao=new XiaoJieJie (28)
dajiao.age=25
console.log(dajiao.age)

class Girl{
    static sayLove(){
        return 'I love u!'
    }
}
// const girl=new Girl()
console.log (Girl.sayLove())