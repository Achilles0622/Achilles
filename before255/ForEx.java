package before255;

public class ForEx{
	public static void main (String[]args) {
		int count =0;//个数
		int sum=0;//总和
		int start=40;//起始数值
		int end=100;//结束数值
		for(int i=start;i<=end;i++){//其中更改start和end的指就能更改取数范围了
			
		if(i%9==0) {//取9的倍数
			System.out.println("i="+i);
			count++;//个数自增
			
			sum+= i;//总和相加
		}
		}
		System.out.println("count="+count);
		System.out.println("sum="+sum);
	}
}