package before255;

public class ArrayExercis2{
	public static void main (String[]args) {
		int[]arr= {4,-1,9,10,23,888,999};
		int max =arr[0];//假定第一个元素是最大值
		 int maxIndes=0;//
		 for(int i =1;i<arr.length;i++) {
			 if(max<arr[i]) {
				 max=arr[i];
				 maxIndes=i;
				 
			 }
		 }
		 System.out.println("max="+max+"maxIndex="+maxIndes);
	}
}