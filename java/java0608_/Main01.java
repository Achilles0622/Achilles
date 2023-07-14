package java0608_;

public class Main01 {
    private static String name="韩顺平教育";
    private int n1=1000;
    public void  cry(){
        System.out.println("main01的cry方法");
    }
    public static void hi(){
        System.out.println("main01的hi方法");
    }

    public static void main(String[] args) {
        System.out.println("name="+name);
        hi();
        //System.out.println(n1);
        Main01 main01 = new Main01();
        System.out.println(main01.n1);
        main01.cry();
    }
}
