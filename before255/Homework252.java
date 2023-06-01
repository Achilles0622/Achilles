package before255;

public class Homework252{
	public static void main (String[]args) {
		A01 a01=new A01();
		double[]arr= {1,4.7,1.8};
		System.out.println("arr of max"+a01.max(arr));
		}
}
class A01{
	public Double max(double[]arr){
		double max=arr[0];//保证arr至少有一个元素
		if (arr.length>0) {
		for(int i=1;i<arr.length;i++){
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
		}else {
			return null;
		}
}}