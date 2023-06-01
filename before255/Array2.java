package before255;

import java .util.Scanner;
public class Array2{
	public static void main (String[]args) {
		//1.创建数组 double
		double[]scores=new double [5];
		Scanner myScanner=new Scanner(System.in);
		for (int i =0;i<scores.length;i++) {
			System.out.println("请输入第"+(i+1)+"个元素的值");
		scores[i]=myScanner.nextDouble();
		}

		System.out.println("当前元素情况如下---------");
		for (int i =0;i<scores.length;i++) {
			System.out.println("第"+(i+1)+"个元素的值="+scores[i]);
		}
		
}
}