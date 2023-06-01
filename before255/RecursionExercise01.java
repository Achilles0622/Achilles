package before255;

public class RecursionExercise01{
	public static void main (String[]args) {
		T1 t1=new T1();	
//	int n =-1;
//	int res =t1.fibonacc (-1);
//	if(res !=-1) {
//		System.out.println("当n对应"+	n+"数是"+res);
//	}
		int day =1;
		int peachNum=t1.peach(day);
		if (peachNum != -1) {
			System.out.println("第x天有"+peachNum+"哥桃子");
		}
	}
}
class T1{
	public int fibonacc(int n ) {
		if(n>1) {
		if(n==1||n==2) {
			return 1;
		}else{
			return fibonacc (n-1)+fibonacc(n-2);
		}
		}else{
			System.out.println("要求输入整数n>=1的整数");
			return -1;
		}
	}
	public int peach(int day) {
		if(day==10) {
			return 1;
		}else if (day>=1 && day<=9) {
			return (peach(day+1)+1)*2;//得到规则 自己要想
		}else{
			System.out.println("day在1-10天");
			return -1;
		}
	}
}