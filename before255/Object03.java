package before255;

public class Object03{
	public static void main (String[]args) {
		  Person22 p1=new Person22();
		  p1.age=10;
		  p1.name="小明";
		  Person22 p2=p1;
		  System.out.println(p2.age);
	}
}
class Person22 {
	public int age;
	String name;
}