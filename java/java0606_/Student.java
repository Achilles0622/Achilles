package java0606_;

public class Student extends Person{
    private String name;
    private char gender;
    private  int age ;
    private  int stu_id;

    public Student(String name, char gender, int age, int stu_id) {
        super(name, gender, age);
        this.stu_id = stu_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }
    public void study(){
        System.out.println("我承诺好好学习" +
                "");
    }
}
