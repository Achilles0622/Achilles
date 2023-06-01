package before255;

public class Object01{
	public static void main (String[]args) {
		 String name1="黄冰棒";
	   String name2="黄文强";
	   int age1=28;
	   int age2=23;
	   String  stydy1="不爱学习";
	   String  study2="大师";
	   //单独变量解决 不利于数据管理，数组解决问题
	   String[]name3={"黄冰棒","28岁","不爱学习"};
	   man man1=new man();
	   man1.name="黄冰棒";
	  man1.age=28;
	   man1.study="不爱学习";
	    man man2=new man();
	    man2.name="黄文强";
	    man2.age=20;
	    man2.study="爱睡觉";
	    System.out.println("第一个人的信息"+man1.name+" "+man1.age+" "+man1.study);
	    System.out.println("第二个人的信息"+man2.name+" "+man2.age+" "+man2.study);
	}
}//实例化一个人
//定义1个类型
class man {
	String name;
	int age;
	String study;
	
}