package java0602_.Object_;

public class EqualsExercise02 {
    public static void main(String[] args) {
        Person_ p1 = new Person_();
        p1.name="hsp";
        Person_ p2 = new Person_();
        System.out.println(p1==p2);
        System.out.println(p1.name.equals(p2.name));
        System.out.println(p1.equals(p2));
        String s1=new String("abc");
        String s2=new String("abc");
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2   );

    }
}
class Person_{
    public String name;

}
