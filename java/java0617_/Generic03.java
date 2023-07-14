package java0617_;

public class Generic03 {
    public static void main(String[] args) {
        Person<String> person = new Person<>("hsp");
        Person<Integer>person2=new Person<Integer>(100);
        person.show();

    }
}
class Person<E>{
    E s;

    public Person(E s) {
        this.s = s;
    }
    public E f(){
        return s;
    }
    public void show(){
        System.out.println(s.getClass());//现实s的s允许类型

    }
}