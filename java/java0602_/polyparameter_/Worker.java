package java0602_.polyparameter_;

public class Worker extends Employee {
    public Worker(String name, double salary) {

        super(name, salary);
    }
    public void word(){
        System.out.println("普通社員"+getName()+"仕事中です");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }

    public void work() {
    }
}
