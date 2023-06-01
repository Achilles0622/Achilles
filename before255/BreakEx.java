package before255;

public class BreakEx{
	public static void main (String[]args) {
		 int sum=0;
		 int n=0;
		 for(int i =1;i<=100;i++) {//i的作用范围在大括号里	
			  sum+=i;
			  if(sum>20) {
				  System.out.println("和大于20了"+i);
				 n=i;
				  break;
				  
			  }
		 }
		 System.out.println("");
	}
}