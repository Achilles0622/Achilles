package before255;

public class VarScopeDetail{
	public static void main(String[]args) {
		Person13 p1=new Person13();
		p1.say();//当执行say方法时，执行完毕后name变量就销毁了 
		TT1 t1=new TT1();
		t1.test();
		t1.test2 (p1);
	}
}
class TT1{
	public void test() {
		Person13 p1=new Person13();
		System.out.println(p1.name);
	}
	public void test2(Person13 p) {
		System.out.println(p.name);
	}
}
class Person13{
	String name ="jack";
	public void say() {
		String name ="king";
		System.out.println("say()name="+name);
		
	}
	public void hi () {
		String address="北京";
		String name ="hsp";
	}
}