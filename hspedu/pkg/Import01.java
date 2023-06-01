package hspedu.pkg;

import java.lang.reflect.Array;
import java.util.Arrays;

//需要使用什么类就导入什么类即可,不建议使用新的方式导入
//import java.util.Scanner;
//import  java.util.*;
public class Import01 {
    public static void main(String[] args) {
        int[] arr = {-1, 20, 2, 13, 3};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}

