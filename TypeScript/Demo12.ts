class Person{

}
class Teacher extends Person{
    constructor(public age:number){
       super()
    }
}
const teacher =new Teacher(18)
console.log(teacher.age)
