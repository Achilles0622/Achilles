package before255;

public class Stars{
	public static void main (String[]args) {
		int totalLevel=12 ;
		for(int i=1; i<=totalLevel;i++){//i表示层数
			
			for(int k=1;k<=totalLevel-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {//j表示星星的个数
				if(j==1||j==2*i-1 || i==totalLevel  ) {
		System.out.print ("*");
			} else  {
				System.out.print(" ");
			}
			}
			System.out.println("");
		}
		}
	
}
