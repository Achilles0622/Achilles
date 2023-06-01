package before255;

public class  Homework4{
	public static void main(String[]args) {
		int n =153;
		int n1 =n/100;
		int n2=n%100/10;
		int n3=n%10;
		if(n1*n1*n1+n2*n2*n2+n3*n3*n3==n) {
			System.out.println( "是水仙花数"+n);
		}
		else {
			System.out.println("不是水仙花数"+n);
		}
		
	}
}