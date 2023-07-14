package java0609_;

public class Enumeration03 {
    public static void main(String[] args) {
        Gender2 boy1 = Gender2.BOY;
        Gender2 boy2 = Gender2.BOY;
        System.out.println(boy1);
//        public String toString(){
//            return name;
//        }
        System.out.println(boy2==boy1);
    }
}

enum Gender2 {
    BOY, GIRL;
}



