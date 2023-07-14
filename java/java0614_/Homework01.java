package java0614_;

public class Homework01 {
    public static void main(String[] args) {
  String str="abcdef";
        System.out.println(str);
        str= reverse(str, 1, 4);
        System.out.println("-------------------");
        System.out.println(str);
    }
    public static String reverse(String str,int start ,int end){
        char[] chars = str.toCharArray();
        char temp=' ';
        for (int i=start,j=end;i<j;i++,j--){
            temp=chars[i];
            chars[i]=chars[j];
            chars[j]=temp;

        }
        return new String(chars);
    }
} 
