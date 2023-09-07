public class TestPerson{
	public static void main (String[]args) {
		Ps p1=new Ps("mary",20);
		Ps p2=new Ps("smith",30);
		System.out.println(p1.compareTo(p2));
	}
}
class Ps{
	String name ;
	int age;
	public Ps(String name,int age) {
		this.name=name;
		this.age=age;
	} 
	public boolean compareTo(Ps p2) {
		if(this.name.equals(p2.name)&&this.age==p2.age) {
			return true;
		}else{
			return false;
		}
	}
}