package before255;

public class Arrayreverse{
	public static void main (String[]args) {
		int []arr= {11,22,33,44,55,66};
		//把0位置和5位置进行交换
		//所有对称元素进行交换
		//交换次数正好是arr.length/2
		//每次交换时候对应下标是arr[i] 和arr[arr.length-1-i]
		int temp=0;
		int len =arr.length;
		for (int i=0;i<arr.length/2;i++) {
			temp=arr[arr.length-1-i];
			arr[arr.length-1-i]=arr[i];
			arr[i]=temp;
		}
		System.out.println("=====反转后的数组=======");
		for (int i=0;i<len;i++){
		System.out.print(arr[i]);}
	}
}