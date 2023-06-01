public class Array1{
	public static void main (String[]args) {
		double hen1=3;
		double hen2=5;
		double hen3=1;
		double hen4=3.4;
		double hen5=2;
		double hen6=50;
		double sum=hen1+hen2+hen3+hen4+hen5+hen6;
		double avg=sum/6;
		 System.out.println("总体重="+sum+"平均体重"+avg);//传统方法计算 
		double[]hens= {3,5,1,3.4,2,50};//表示double类型的数组,存放的不是1个而是1组了
		System.out.println(" -------用数组解决-------");
		//我们通过hens[]来访问得到数组的元素
		//下标是从0开始编号的
		//通过for循环的取出数组的元素或值
		//使用一个变量来得到各个元素磊姐
		double totalsum=0;
		for (int i =0;i<6;i++) {
		System.out.println("第"+(i+1) +"个元素的值="+hens[i]);
		totalsum+=hens[i];
		}
		System.out.println("总体重="+totalsum+"平均体重="+avg)	;
		}
}