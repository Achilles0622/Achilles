package java0608_;

public class common extends Employee{
    public common(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public void work() {
        System.out.println("pt"+getName()+"working^^^^^");
    }
}
