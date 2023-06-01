package before255;

public class ForDetail{
	public static void main (String[]args) {
		int i=1;
		for(;i<=10;) {
			System.out.println("hi"+i);
			i++;
		}
		System.out.println("i="+i);//ok		
		
		int count=3;
		for(int l=0,j=0;l<count;l++,j+=2) {
			System.out.println("l="+l+"j="+j);
		}
		}
	}
