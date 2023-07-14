package java0606_;

public class Employee {
    private String name;
    private double sal;
    private int salMoneth=12;
    public void printSal(){
        System.out.println(name+"年工资"+(sal*salMoneth));
    }

    public Employee(String name, double sal) {
        this.name = name;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getSalMoneth() {
        return salMoneth;
    }

    public void setSalMoneth(int salMoneth) {
        this.salMoneth = salMoneth;
    }
}
