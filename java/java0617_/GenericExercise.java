package java0617_;

import java.util.*;

public class GenericExercise {
    public static void main(String[] args) {
//使用泛型给hashset放入三个学生
        HashSet<Student> students = new HashSet<Student>();
        students.add(new Student("jack", 18));
        students.add(new Student("mary", 28));
        students.add(new Student("tom", 19));
        for (Student student : students) {
            System.out.println(student);

        }
        System.out.println("--------------------");
        HashMap<String, Student> hm = new HashMap<String, Student>();
        hm.put("tom",new Student("tom",28));
        hm.put("tom",new Student("jack",118));
        hm.put("tom",new Student("smith",48));
        Set<Map.Entry<String, Student>> entries = hm.entrySet();

        Iterator<Map.Entry<String ,Student>> iterator=entries.iterator();
        System.out.println("-------------------------");
        while(iterator.hasNext()){
            Map.Entry<String, Student>next= iterator.next();
            System.out.println(next.getKey()+"-"+next.getValue());
        }

    }
}

class Student {
    private int age;
    private String name;

    public Student(String name, int age) {
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

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                '}';
    }
}
