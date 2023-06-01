package before255;

public class ConstrucotrExercis{
	public static void mian (String[]args) {
		Person0622 p1=new Person0622();
		System.out.println("p1的信息 name="+p1.name+"age="+p1.age);
		Person0622 p2=new Person0622("scott",60);
		System.out.println("p2的信息 name="+p2.name+"p2的age="+p2.age);
	}
}
class Person0622{
	String name ;//默认值是空
	int age;//默认为0
	public Person0622() {
		age =18;
	}
	public Person0622(String pName,int pAge) {
		name=pName;
		age=pAge;
	}
}