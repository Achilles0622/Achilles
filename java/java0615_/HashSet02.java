package java0615_;

import java.util.HashSet;

public class HashSet02 {
    public static void main(String[] args) {
      HashSet set=new HashSet();
        System.out.println(set.add("a"));
        System.out.println(set.add("s"));
        System.out.println(set.add("a"));
        System.out.println(set.add("f"));
        System.out.println(set.add("g"));
        set.remove("a");
        System.out.println("set="+set);

        set=new HashSet();
        System.out.println("set="+set);
        set.add("z");
        set.add("z");
        set.add(new Dog1("x"));
        set.add(new Dog1("x"));
        System.out.println("set="+set);

    }
}
class Dog1{
    private String name;
    public Dog1(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Dog1{" +
                "name='" + name + '\'' +
                '}';
    }
}
