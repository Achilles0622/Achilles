public class Homework187{
	public static void main (String[]args) {
		int []arr =new int [10];
		 for(int i =0;i<arr.length;i++) {
			 arr[i]=(int)(Math.random()*100)+1;
		 }
		 System.out.println("--------arr---------");
		 for(int i =0;i<arr.length;i++) {
			 System.out.print(arr[i]+"\t");
		 }
		 System.out.println("\n--------arr倒叙---------");
		 for(int i =arr.length -1;i>=0;i--) {
			 System.out.print(arr[i]+"\t");
		 }
		 double sum=0;
		 int max =arr[0];
		 int maxIndex=0;
		 for(int i =1;i<arr.length;i++) {
			 if (max <arr[i]) {
				 max =arr[i];
				 maxIndex=i;
			 }
		 }
		 System.out.println("\nmax="+max+"\nmaxIndex="+maxIndex);
	}
}