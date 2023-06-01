package before255;

public class ArrayAdd{
	public static void main(String[]args) {
		 int[]arr= {1,2,3};
		 int []arrNew=new int [arr.length+1];
		 for (int i =0;i<arr.length;i++) {
			 arrNew[i]=arr[i];
		 }
		 arrNew[arrNew.length-1]=4;
		 arr =arrNew;
		 System.out.println("--------arr扩容后的元素情况--------");
		 for(int i =0;i<arr.length;i++) {
			 System.out.print(arr[i]);
		 }
		
	}
}