package before255;

public class HannoiTower{
	public static void main (String[]args) {
		Tower tower=new Tower();
		tower.move(5,'A','B','C');
	}
}
class Tower{
	public void move (int num,char a ,char b,char c) {//表示移动的个数 a,b,c分表示三座塔
		//如果只有一个塔 
		if(num==1) {
			System.out.println(a+"->"+c);
		}else{
			move(num-1,a,c,b);  
			System.out.println(a+"->"+c);
			move(num-1,b,a,c);
			
		}
		
	}
}