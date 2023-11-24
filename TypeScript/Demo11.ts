class Person{
//protected
   public name! :string ;
   public sayHello(){
    console.log(this.name+'sayHello')
}
}
class Teacher extends Person{
    public sayBye(){
        this.name
    }

}
const person=new Person()
person.name='jspang'
person.sayHello()
console.log(person.name)