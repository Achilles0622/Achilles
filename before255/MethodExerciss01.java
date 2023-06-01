package before255;

public class MethodExerciss01{
public static void main (String[]args) {
	AC a =new AC ();
       if (a.isOdd  (1)){
		System.out.println("是奇数");
	}else{
		System.out.println("是偶数");
	};
	
};
};
class AC {	
	public boolean isOdd (int num) {
		//if (num%2!=0) {
		//	return true;
	//	}else{
		//	return false;
	//	}
 return num %2 !=0;
	}
	public void print (int row ,int col ,char c ) {
		 for(int i =0;i<row; i++) {
			 for (int j =0;j<col;j++) {
				 System.out.print(c);
			 }
		 System.out.println("");//换行
		 }
		 
	}
}