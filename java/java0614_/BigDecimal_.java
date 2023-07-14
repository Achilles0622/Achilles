package java0614_;

import java.math.BigDecimal;

public class BigDecimal_ {
    public static void main(String[] args) {
        double d=19.11111112312312312313213123123123213123d;
        System.out.println(d);
        BigDecimal bigDecimal = new BigDecimal("19.11111112312312312313213123123123213123");
        System.out.println(bigDecimal);
        BigDecimal bigDecimal1 = new BigDecimal("13");
        System.out.println(bigDecimal.subtract(bigDecimal1));




    }
}
