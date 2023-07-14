package java0606_;

public class Teacher1 extends Person{
    private int work_age;

    public Teacher1(String name, char gender, int age, int work_age) {
        super(name,gender,age);
        this.work_age = work_age;
    }


    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }
    public void teach(){
        System.out.println("我承诺我会好好教学");
    }
}
