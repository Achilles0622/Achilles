package java0607_;

public class ChildGame {
    public static void main(String[] args) {
        int count = 0;
        Child child1 = new Child("白骨精");
        child1.join();
        child1.count++;
        Child child2 = new Child("狐狸精");
        child2.join();
        child2.count++;
        Child child3 = new Child("老鼠精");
        child3.join();
        child3.count++;
        System.out.println("共有"+Child.count+"小孩加入了游戏 ");
        //类变量可以用类名来改变
        System.out.println("child1.count="+child1.count);
        System.out.println("child2.count="+child2.count);
        System.out.println("child3.count="+child3.count);

    }
}

class Child {
    private String name;
    public static int count=0;

    public Child(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println(name + "加入了游戏");
    }
}