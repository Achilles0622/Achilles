package java0626_;

import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args) {
        System.out.println(System.in.getClass());
        System.out.println("hello");
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入内容");
        String next=scanner.next();
        System.out.println("next="+next);
    }
}
