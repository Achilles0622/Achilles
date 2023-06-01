package before255;

public class VarScope{
	public static void main (String[]args) {
		
	}
}
class Cat{
	int age =10;
	double weight;//
	public void cry () {
		int n =10;
		String name ="jack";
		System.out.println("在cry中使用属性age="+age);
	}
	public void eat () {
		System.out.println("age="+age);
		
	}
}