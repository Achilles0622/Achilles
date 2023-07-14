package java0627_;

import java.io.PrintWriter;

public class PrintWriter_ {
    public static void main(String[] args) {
        PrintWriter printWriter = new PrintWriter(System.out);
        printWriter.println("hi,beijing");
        printWriter.close();
    }
}
