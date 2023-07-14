package java0608_;

public class SingleTon02 {
    //    new Cat()
    public static void main(String[] args) {
//        System.out.println(Cat.n1);
        Cat instance = Cat.getInstance();
        System.out.println(instance);
    }
}

class Cat {
    private String name;
    public static int n1 = 999;
    private static Cat cat;

    private Cat(String name) {
        System.out.println("gouzaoqi");
        this.name = name;
    }

    public static Cat getInstance() {
        if (cat == null) {
            cat = new Cat("ぃあおけ");

        }
        return cat;


    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
