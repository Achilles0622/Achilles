public class MethodParameter02{
	public static void main (String[]args) {
		 BA b=new BA();
		// int[]arr= {1,2,3};
		 //b.test100(arr);
		 //System.out.println("main的arr数组");
		 //for (int i =0;i<arr.length;i++) {
			//	System.out.print(arr[i]+"\t");
			//}
			//System.out.println();
			ABC p=new ABC();
			p.name="jack"; 
			p.age=10;   
			b.test200(p);
			System.out.println("main的p.age="+p.age); 
	}}
	class ABC{
		String name;
		int age;
	
}
class BA{
	public void test200(ABC p) {
		 p.age=10000;
	}
	public void  test100(int[] arr) {
		arr[0]=200;
		System.out.println("test100的arr数组");
		for (int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}
}