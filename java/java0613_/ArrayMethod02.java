package java0613_;

import java.util.Arrays;

public class ArrayMethod02 {
    public static void main(String[] args) {
        Integer[]arr={1,20,90,123,567};
        int index= Arrays.binarySearch(arr,123);
        System.out.println("index="+index);
        //如果不存在返回-1
        Integer[]newArr=Arrays.copyOf(arr,arr.length);
        System.out.println("拷贝好了");
        System.out.println(Arrays.toString(newArr));
        //ill数组填充
        Integer[]num=new Integer[]{9,3,2};
        Arrays.fill(num,99);
        System.out.println("-------数组填充-------");
        System.out.println(Arrays.toString(num));
        Integer[]arr2={1,2,90,123,457};
        boolean equals=Arrays.equals(arr,arr2);
        System.out.println("equals="+equals);
    }
}
