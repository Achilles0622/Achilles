package java0602_.debug_;

import java.util.Arrays;

public class Debug03 {
    public static void main(String[] args) {
        int []arr ={1,-1,1,-20,100};

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"\t");

        }
    }
}
