package java0613_;

public class StringMethod01 {
    public static void main(String[] args) {
        String str1="hello";
        String str2="Hello";
        System.out.println(str1.equals(str2));//比较内容是否相同区分大小写
        String username="johN";
        if("john".equalsIgnoreCase(username)) {
            System.out.println("Success!");
        }else {
            System.out.println("Failure!");
        }
        System.out.println("韩顺平".length());
        String s1="wer@terwe@g";
        int index=s1.indexOf('@');
        System.out.println(index);
        s1="wer@terwe@g@";
        index=s1.lastIndexOf('@');
        System.out.println(index);
        String name ="张三,hello";
        System.out.println(name.substring(6));
        System.out.println(name.substring(0,5));
    }
}
