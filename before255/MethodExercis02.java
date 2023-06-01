package before255;

public class MethodExercis02{
	public static void main (String[]args) {
		Person123 p=new Person123();
		p.name="milan";
		p.age=100;
		//创建一个tools
		Mytools tools =new Mytools();
		Person123 p2=tools.copyPerson123(p);//p和p2是俩个独立的对象
		System.out.println("p的属性 age="+p.age+"名字="+p.name);
		System.out.println("p2的属性 age="+p2.age+"名字2="+p2.name);
		System.out.println(p==p2);
	}
}
class Person123{
	String name ;
	int age;
	
}
class Mytools{
	public Person123 copyPerson123(Person123 p){
		Person123 p2=new Person123();
	p2.name=p.name;
	p2.age=p.age;
	return p2;
		
	}
	//确定返回类型void，方法名字 方法形参  循环
}