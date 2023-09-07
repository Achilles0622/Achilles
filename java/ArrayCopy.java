public class ArrayCopy{
	public static void main (String[]args) {
		int []arr1 = {10,20,30};
		//先创建一个新的数组arr2；开辟新的数据空间
		//大小 arr1.length；
		int []arr2 = new int [arr1.length];
		for(int i =0;i<arr1.length;i++) {
			arr2[i]=arr1[i]; 
		}
		//
		arr2[0]=100;
		System.out.println("======arr1的元素-------");
		for(int i =0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("======arr2的元素-------");
		for(int i =0;i<arr2.length;i++) {
			System.out.println(arr2[i]);}
	}	
}