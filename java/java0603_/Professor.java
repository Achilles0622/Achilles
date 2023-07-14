package java0603_;

public class Professor extends Teacher{
    public Professor(String name, int age, String pose, double salary, double grade) {
        super(name, age, pose, salary, grade);
    }

    @Override
    public void introduce() {
        System.out.println("这是教授的信息");
        super.introduce();
    }
}
