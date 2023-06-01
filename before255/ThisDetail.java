package before255;

public class ThisDetail{
	public static void main(String[]args) {
//		Y y1=new Y();
//		y1.f2();
		Y y2=new Y();
		y2.f3();
		
	}
}
class Y{//如果有this构造器语法必须放在最前面 第一条语句
	String name ="jack";
	int age =100;
	public Y() {
		this("jack",1000);
		System.out.println("Y()构造器");
	}
	public Y(String name,int age) {
		System.out.println("Y(String name,int age)构造器");
	}
	//this可以访问成员愈发
	public void f3 () {
		String name="smith";int age=98;
		System.out.println("name="+name+"  age="+age);//就近原则
		System.out.println("name="+this.name+"  age="+this.age);//只访问属性
	}
	public void f1() {
		System.out.println("f1()方法");
	}
	public void f2() {
		System.out.println("f2()方法");
		f1();
		this.f1();
	}
	
}