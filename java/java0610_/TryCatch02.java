package java0610_;

public class TryCatch02 {
    public static void main(String[] args) {
        try {
            Person person = new Person();
            person=null;
            System.out.println(person.getName());
            int n1=10;
            int n2=0;
            int res=n1/n2;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
        }
    }
}
class Person{
    private String name="jack";
    public String getName(){
        return name;
    }
}
