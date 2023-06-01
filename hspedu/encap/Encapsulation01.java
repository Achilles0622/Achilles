package hspedu.encap;

public class Encapsulation01 {
    public static void main(String[] args) {
        //如果要是使用快捷键 需要先配置主类
        //第一次我们使用鼠标点击的形式 后来就可以用了
        Person person = new Person();
        person.name = "jack";
        person.setName("jackasdad");
        person.setAge(300);
        person.setSalary(30000);
        System.out.println(person.info());
Person smith=new Person("smith",2000,50000);
System.out.println("-------smith信息--------");
System.out.println(smith.info());
    }
}

class Person {
    public String name;
    private int age;
    private double salary;

    //    public void setName(String name){
//        this.name=name;
//    }
//    public String getName(){
//        return name;
    public Person() {
    }

    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //加入对数据的校验,增加业务逻辑
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("名字长度不正确，需要在2到6之间");
            this.name = "无名字";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("年纪需要1到120岁之间才可以");
            this.age = 18;//其他范围默认18岁
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //写一个方法，返回信息属性
    public String info() {
        return "信息为 name=" + name + "age=" + age + "薪水=" + salary;
    }
}

