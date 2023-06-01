package before255;

public class ArrayDetail{
	 public static  void main (String[]args) {
		 double [] arr1= {1.1,2.2,3.3,60,1.1};
	 String []arr2= {"北京","jack"};
	 short[]arr4= new short [3];
	 System.out.println("======arr4数组输出====");
	 for(int i =0;i<arr4.length;i++) {//数组下标从0开始的，且下标必须在外围之内
		 System.out.println(arr4[i]);
	 }
	 }
 }