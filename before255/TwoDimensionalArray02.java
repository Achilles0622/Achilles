package before255;

public class TwoDimensionalArray02{
	public static void main (String[]args) {
		// int arr[][]=new int [2][3]; 一步到位
		int arr[][];//声明数组 再开空间
		arr=new int[2][3];//开空间
		arr[1][1]=8;
		 for(int i=0;i<arr.length;i++) {
					 for(int j =0;j<arr[i].length;j++) {
						 System.out.print(arr[i][j]+" ");
					 }
					 System.out.println();
				 }
	}
}