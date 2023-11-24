class Person{
    public readonly _name:string
    constructor(public name :string){
      this._name=name
    }
}
const person=new Person ('jspang')
person.name='xieguangkun'
console.log(person._name)
abstract class Girl{
    abstract skill()

    
}
 class Waiter extends Girl{
    skill(){
        console.log('水を飲んでください！')
    }
 }
 class BaseTeacher extends Girl{
    skill(){
        console.log('マーサじをお願いしまし')
    }
 }
 class seniorTeacher extends Girl{
    skill(){
        console.log('SPA！')
    }
  }