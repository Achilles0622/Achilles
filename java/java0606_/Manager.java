package java0606_;

public class Manager extends Empliyee{
    private double bouns;

    public Manager(String name, int workDays, double daySal, double grade) {
        super(name, workDays, daySal, grade);
    }

    public void printSal(){
        System.out.println("经理"+getName()+"工资是="+(bouns+getDaySal()*getDaySal()*getGrade()));
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }
}
