package before255;

public class Homework10{
	public static void main(String[]args) {
		 int[]arr= {10,12,45,90};
		 int insertNum=23 ;
		 int index = -1;
		 for(int i=0;i<arr.length;i++) {
			 if(insertNum<=arr[i]) {
				 index=i;
				 break;//找到位置后退出 
			 }
		 }
		 //可以判断index
		 if(index == -1) {//说明没有找到位置 
			 index=arr.length;
			 	 
		 }
		 System.out.println("index="+index);
		 int []arrNew =new int [arr.length+1];
		 //下面老师准备将arr的元素拷贝到arrNew，并且要跳过index位置
		 //int[]arr= {10,12,45,90};
		 for(int i =0,j=0;i<arrNew.length;i++) {
			 if(i !=index) {//说明可以把arr的元素拷贝到arrNew里
				 arrNew[i]=arr[j];
				 j++;
			 }else{
				 arrNew[i]=insertNum;
				 
			 }
		 }
		 arr=arrNew;
		 System.out.println("===========arr=========");
		 for(int i =0;i<arr.length;i++) {
			 System.out.println(arr[i]+"\t");
		 }
}}