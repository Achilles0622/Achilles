public class Homework02{
	public static void main (String[]args) {
		String[]strs= {"jack","tom","mary","milan"};
			A03 a02=new A03();
		int index =a02.find("jack", strs);
		System.out.println(index);
	}
}
class A03{
	public int find(String findStr,String[]strs) {
		for(int i =0;i<strs.length;i++) {
			if(findStr.equals(strs[i])) {
				return i;
			}
		}
	return -1;	
	}
}