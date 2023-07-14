package java0606_;

public class Empliyee {
    private String name;
    private int workDays ;
    private double daySal;
private double grade;
public void printSal(){
    System.out.println("");
    System.out.println(name+"工资="+daySal*workDays*grade);
}

    public Empliyee(String name, int workDays, double daySal, double grade) {
        this.name = name;
        this.workDays = workDays;
        this.daySal = daySal;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }

    public double getDaySal() {
        return daySal;
    }

    public void setDaySal(double daySal) {
        this.daySal = daySal;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
