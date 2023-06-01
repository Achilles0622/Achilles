package before255;

public class Constructor01{
	public static void main (String []args) {
		Person1234 p1=new Person1234("Simth",80);
		System.out.println("p1的信息是name="+p1.name+"p1的age"+p1.age);
	}
}
class Person1234{
	String name;
	int age;
	public Person1234(String pName,int pAge) {
		System.out.println("被构造器调用--完成初始化");
		name=pName; 
		age=pAge;
	}
} 