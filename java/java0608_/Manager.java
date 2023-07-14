package java0608_;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, int age, double salary) {
        super(name, age, salary);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("manager"+getName()+"仕事中");
    }
}
