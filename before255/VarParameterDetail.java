package before255;

public class VarParameterDetail{
	public static void main (String[]args) {
		int []arr= {1,2,3};
		T02 t1=new T02();
		t1.f1(arr);
	}
}
class T02{
	public void f1(int ...nums) {
		 System.out.println("长度="+nums.length);
	}
	public void f2 (String str,double...nums) {
		
	}
	//public　void f3 (double ...num2) {
		
//	}
}