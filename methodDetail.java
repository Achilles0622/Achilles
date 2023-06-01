public class methodDetail{
	public static void main (String[]args) {
		AA a=new AA();
		int []res =a.getSumAndSub(1, 4);
		System.out.println("和="+res[0]);
		System.out.println("差="+res[1]);
	}
}
class AA {
	public int[] getSumAndSub(int n1, int n2){
		int []resArr =new int [2];
		resArr[0]=n1+n2;
		resArr[1]=n1-n2;
		return resArr;
	}
	public double f1() {
		double d1 =1.1*3;
		int n =100;
		return n;// int 给一个double会自动转换 反之不可以 
	}
}