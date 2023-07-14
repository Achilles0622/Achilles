package java0602_.Object_;



public class Equals01 {
    public static void main(String[] args) {
        A a=new A();
        A b =a;
        A c=b;
        System.out.println(a==c);
        System.out.println(b==c);
        B bObj=a;
        System.out.println(bObj==c);
        int num1=10; double num2=10.0;
        System.out.println(num1==num2);
        "hello".equals("abc");
        String str1=new String("hsp");
        String str2=new String("hsp");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
    }
}
    class A extends B{

}

class B{

}