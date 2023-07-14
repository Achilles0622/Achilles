package java0608_;

public class CodeBlockDetail04 {
}
        class Personn{
            public static  int total;
            static {
                total=100;
                System.out.println("in static block!");
            }
        }
         class T{
            public static void main(String[] args) {
                System.out.println("total="+Personn.total);
                System.out.println("total="+Personn.total);



    }

}
