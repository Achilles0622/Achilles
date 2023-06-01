package before255;

public  class ArrayAssign{
	public static void main (String[]args) {
		 int n1=10; 
		 int n2=n1;
		  
		 n2=80;
		 System.out.println("n1="+n1);
		 System.out.println("n2="+n2);
		 int[]arr1= {1,2,3,};
		 int[]arr2=arr1;//数组是引用传递的   //arr2 的变化会影响到arr1
		 arr2[0]=10;
		 for (int i=0;i<arr1.length;i++){
		 System.out.println(arr1);
		 for(int b =0;b<arr2.length;b++){
		 System.out.println(arr2);}
		 }
		 
	}
}