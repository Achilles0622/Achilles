package before255;

import java.util.Scanner;
public class DoWhile02{
	public static void main (String[]args) {
		 Scanner myScanner = new Scanner(System.in);
		 char answer = ' ';
		 do {
			 System.out.println("???");
			 System.out.println("y/n");
			 answer = myScanner.next().charAt(0);
			 System.out.println("back"+answer);
			 
		 }while(answer !='y');
		 System.out.println("ok");
	}
}