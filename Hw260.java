public class Hw260{
	public static void mian (String[]args) {
		
	}
}
class Employee{
	String name;
	char gender;
	int age;
	String job;
	double sal;
	public Employee(String job,double sal) {
		this.job=job;
		this.sal=sal;
	}
	public Employee(String name,int age,char gender) {
		this.name=name;
		this.age=age;
		this.gender=gender;
}
	public Employee(String job,double sal,String name,int age,char gender) {
		this(name,age,gender);
	//	this(job,sal);
		this.job=job;
		this.sal=sal;
	}
	}