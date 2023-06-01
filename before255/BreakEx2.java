package before255;

import java.util.Scanner;
public class BreakEx2{
	public static void main (String[]args){
		 Scanner myScanner = new Scanner( System.in);
		 String name ="";
		    String passwd="";
		    int chance=3;//登陆就减少一次
		    for(int i =1;i<=3;i++) {//又三次登陆机会
		    	System.out.println("请输入名字");
		    	 name =myScanner.next();
		    	 System.out.println("请输入密码");
		    	 passwd= myScanner.next();
		    	 if("高昂".equals(name) && "666".equals(passwd)){
		    	 System.out.println("ログインができる、おめでとう");
		    	 break;
		    }
		    chance--;
		    System.out.println( "你还有"+ chance + "次的 登陆机会" );
	}}}
