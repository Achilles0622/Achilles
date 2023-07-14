package java0613_;

import java.util.Arrays;
import java.util.Comparator;

public class ArrarysSortCustom {
    public static void main(String[] args) {
        int[] arr = {1, -1, 8, 0, 20};
        //bubble01(arr);
        bubble02(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });
        System.out.println("排序后的情况");
        System.out.println(Arrays.toString(arr));
    }

    public static void bubble01(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }

        }
    }
    public static void bubble02(int []arr, Comparator c){
        int temp=0;
        for (int i = 0; i <arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(c.compare(arr[j],arr[j+1])>0){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
            
        }
    }
}
