package java0607_;

public class StaticMethod {
    public static void main(String[] args) {
        Stu tom = new Stu("tom");
        tom.payFee(100);
        Stu mary = new Stu("mary");
        mary.payFee(200);
        Stu.showFee();
        System.out.println("9开平方的结果是="+Math.sqrt(9));

    }
}

class Stu {
    private String name;
    //定义一个静态变量累计学费
    private static double fee = 0;

    public Stu(String name) {
        this.name = name;
    }

    public static void payFee(double fee) {
        Stu.fee += fee;
    }

    public static void showFee() {
        System.out.println("学费总共是=" + Stu.fee);

    }
}
