package java0610_;

public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        try {
            int res = num1 / num2;
        } catch (Exception e) {
//            e.printStackTrace()
            System.out.println("出现一场的原因是"+e.getMessage());
        }
            System.out.println("程序继续执行");
        }
    }