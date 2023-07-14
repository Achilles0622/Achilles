package java0606_;

public class Peasant extends Employee{
    public Peasant(String name, double sal) {
        super(name, sal);
    }

    @Override
    public int getSalMoneth() {
        System.out.println("农民");
        return super.getSalMoneth();
    }
}
