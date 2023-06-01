public class VarParameter01{
	public static void main (String[]args) {
		HspMethod m =new HspMethod();
	 m.sum(1,5,100);
	 System.out.println(m.sum(1,5,100));
	}
}
class HspMethod{
//	public int sum (int n1,int 2) {
//		return n1+n2;
//	}
//	public int sum (int n1,int 2,int 3 ) {
//		return n1+n2+n3;
//	}
	public int sum (int...nums) {
	//	System.out.println("可接受的参数个数"+nums.length);
		int res =0;
		for(int i =0; i <nums.length;i++) {
			res+=nums[i];
		}
		return res;
	}
}