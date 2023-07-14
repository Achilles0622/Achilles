package java0602_;

public class Finalazi_ {
    public static void main(String[] args) {
        Car bwm = new Car("bwm");
        bwm=null;
        System.gc();
        System.out.println("程序退出");
    }
}

class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("我们销毁汽车"+name);
        System.out.println("释放了默写资源");
    }
}
