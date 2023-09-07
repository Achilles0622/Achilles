public class Method01{
	public static void main (String[]args) {
		//方法写好后 不去使用 不会生效和输出语句
		Perso p1 = new Perso();
		p1.speak();	
		p1.cal01();
		p1.cal02(1000000);
		p1.getSum(10,20);
		int returnRes =p1.getSum(10, 20);
		System.out.println("getSum方法返回的数值="+returnRes);
	}
}
class Perso {
	String name;
	int age;
	//public表示方法是S公开的;void没有返回值；speak方法名称
	public void speak() {
		System.out.println("我是一个好人");
	}
	public void cal01() {
		int res =0;
		for(int i =1;i<=1000;i++) {
			res+=i; 
		}
		System.out.println("计算结果等于"+res);
	}
	public void cal02(int n) {//直接修改n就能够更改计算值了
		int res =0;
		for(int i =1;i<=n;i++) {
			res+=i; 
		
			}
		System.out.println("计算结果等于"+res);
	}
	public int getSum(int num1,int num2) {
		int res=num1 +num2;
		return res;
	}
	
}