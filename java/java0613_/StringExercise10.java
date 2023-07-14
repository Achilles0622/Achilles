package java0613_;

public class StringExercise10 {
    public static void main(String[] args) {

    }
}

class Test1{
    String str=new String("hps");
    final char[]ch={'j','a','v','a'};
    public void change(String str,char ch[]){
        str ="java";
        ch[0]='h';
    }

    public static void main(String[] args) {
        Test1 ex=new Test1();
        ex.change(ex.str,ex.ch);
        System.out.println(ex.str+"and");
        System.out.println(ex.ch);
    }}