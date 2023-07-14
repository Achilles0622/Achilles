package java0610_;

public class TryCatch01 {
    public static void main(String[] args) {
        try {
            String str = "hsp";
            int a = Integer.parseInt(str);
            System.out.println("数字:" + a);
        } catch (java.lang.NumberFormatException e) {
            System.out.println("异常信息是"+e.getMessage());
        }finally {
            System.out.println("finally代码被执行");
        }
        System.out.println("程序继续");
    }

}


