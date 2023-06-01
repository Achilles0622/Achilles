public class DoWhile{
	public static void main (String[]args) {
		 int i=1;
		 int sum=0;
		 
		 do {
			 System.out.println("hi"+i);
			  i++;
			  sum+=i;
		 }while(i<=100);
		 System.out.println("sum="+sum);
	}
}