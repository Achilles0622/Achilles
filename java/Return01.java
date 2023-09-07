public class Return01{
	public static void main (String[]args) {
		for(int i =1;i<=5;i++) {
				if(i==3){
					System.out.println("フリーダム"+i);
					return;//return用在方法表示结束或者跳出方法//continue;//break (break是退出for循环，continue是可指定跳到循环位置）
				}//return用在main主方法所以程序直接结束
				System.out.println("素晴らしい世界");
		}
		System.out.println("立憲君主国");
	}
	}