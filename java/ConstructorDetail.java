public class ConstructorDetail{
	public static void main (String[]args) {
		Person2131 p1=new Person2131("king",40);
		Person2131 p2=new Person2131("tom");//age的默认值为0
	}
}
class dog1{
	public dog1(String dName) {
		
	}
}
class Person2131{
	String name ;
	int age ;
	public Person2131(String pName,int pAge) {
		name =pName;
		age=pAge;
	}
	public Person2131(String pName) {
		name =pName;
	}
}