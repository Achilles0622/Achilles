package before255;

public class BreakDetail{
	public  static void main (String[]args) {
		label1:
			for(int j =0;j<4;j++) {
		label2:
			for(int i=0;i<10;i++) {
				if(i==2) {
					break label1 ;//break可选择退出位置
				}
				System.out.println("i="+i);
			}
	}
}
	}