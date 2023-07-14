package java0617_;

import java.util.ArrayList;

public class Generic01 {
    public static void main(String[] args) {
//加高效率 更加安全

        ArrayList<Dog> arrayList = new ArrayList<Dog>();//当我们这样写表示存放到ArrayList集合元素是dog类型
        //编译器发现不满足要求就会报错了 约束数据类型
        //在遍历时候直接取dog类型而不是 object了

        arrayList.add(new Dog(" 旺财", 10));
        arrayList.add(new Dog(" 发财", 1));
        arrayList.add(new Dog(" 小黄", 5));
        //  arrayList.add(new Cat(" 招财猫", 8));//放猫类型就会报错了

        //假如程序不小心添加错了一只猫
//        for (Object o : arrayList) {
//            Dog dog = (Dog) o;
//            System.out.println(dog.getName() + "-" + dog.getAge());
//        }
        for (Dog dog : arrayList) {
            System.out.println(dog.getName() + "  " + dog.getAge());
        }

    }
}

class Dog {
    private String name;

    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
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
}

class Cat {
    private String name;

    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
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

}