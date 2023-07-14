package java0603_;

public class Teacher {
    private String name;
    private int age;
    private String pose;
    private double salary;
    private  double grade;


    public Teacher(String name, int age, String pose, double salary, double grade) {
        this.name = name;
        this.age = age;
        this.pose = pose;
        this.salary = salary;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPose() {
        return pose;
    }

    public void setPose(String pose) {
        this.pose = pose;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
    public  void introduce(){
        System.out.println("name"+name +"age "+age+"post"+pose+"salaty"+salary+"grade:"+grade);
    }
}
