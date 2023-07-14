package java0606_;

public class Teacher extends Employee{
    private int classDay;
    private double classSal;

    public Teacher(String name, double sal) {
        super(name, sal);

    }

    @Override
    public void printSal() {
        System.out.print("老师");
        System.out.println(getName()+"年工资"+(getSal()*getSalMoneth()+classSal*classDay));
    }

    public int getClassDay() {
        return classDay;
    }

    public void setClassDay(int classDay) {
        this.classDay = classDay;
    }

    public double getClassSal() {
        return classSal;
    }

    public void setClassSal(double classSal) {
        this.classSal = classSal;
    }
}
