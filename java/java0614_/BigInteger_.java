package java0614_;

import java.math.BigInteger;

public class BigInteger_ {
    public static void main(String[] args) {
//当变成需要处理狠大的数 long就不够用了
        //可以使用BigInteger这个类来搞定
//        long l=23888888999999999999999999l;
//        System.out.println("l"+l);
        BigInteger bigInteger=new BigInteger("2378899999999999999999999999999999");
        BigInteger bigInteger1 = new BigInteger("100");
        System.out.println(bigInteger);
        BigInteger add=bigInteger.add(bigInteger1);
        System.out.println(add);
        BigInteger subtract=bigInteger.subtract(bigInteger1);
        System.out.println(subtract);
        BigInteger multiply=bigInteger.multiply(bigInteger1);
        System.out.println(multiply);
        BigInteger divide=bigInteger.divide(bigInteger1);
        System.out.println(divide);


    }
}
