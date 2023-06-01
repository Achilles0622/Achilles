package before255;

public class Homework255{
	public static void main (String[]args) {
		int[]oldArr= {10,20,30,50};
		A031 a03=new A031();
		int[]newArr=a03.copyArr(oldArr);
		System.out.println("----返回newArr元素情况-----");
		for(int i =0;i<newArr.length;i++) {
			System.out.println(newArr[i]+"\t");
		}
	}
}
class A031{
	public int []copyArr(int[]oldArr){
		int []newArr=new int [oldArr.length];
		for(int i =0;i<oldArr.length;i++) {
			newArr[i]=oldArr[i];
		}
		return newArr;
	}
}