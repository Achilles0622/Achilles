package before255;

import java.util.Scanner;
public class MulFor1{
	public static void main (String[]args) {
		Scanner myScanner= new Scanner(System.in);
		double totalScore=0;
		int passnub =0;
		for(int i=1;i<=3;i++) {
		double sum=0;
		for(int j=1;j<=5;j++) {
		System.out.println(i+"请输入第"+ j+"个的成绩");
		double score =myScanner.nextDouble();
		if(score>=60) {
			passnub++;
		}
		sum+= score;
		System.out.println("成绩为"+score);
		}
		System.out.println("sum="+sum+"平均分="+(sum/5));
		totalScore+=sum;
		}
		System.out.println ("三个的总数="+totalScore+"平均分="+totalScore/15 );
		System.out.println ("passnub="+passnub);
	}
}