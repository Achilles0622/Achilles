public class MethodParameter01{
	public static void main (String[]args){
		int a =10;
		int b =20;
		//创建AB对象
		AB a1 =new AB ();
		a1.swap(a,b);
		System.out.println("a="+a+"\tb="+b);
	}
}
class AB{
	public void swap (int a,int b ) {
		System.out.println("a="+a+"\tb="+b);	
		int tmp=a;
		a=b;
		b=tmp;
		System.out.println("a="+a+"\tb="+b);
	}
}