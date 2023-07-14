package java0606_;

public class Worker extends Employee{
    public Worker(String name, double sal) {
        super(name, sal);
    }

    @Override
    public void printSal() {
        System.out.print("工人");
        super.printSal();//父类的print
    }
}
