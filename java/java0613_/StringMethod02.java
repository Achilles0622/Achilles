package java0613_;

public class StringMethod02 {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        String s1 = "宝玉";
        s1 = s1.concat("林黛玉").concat(" 薛宝钗").concat("together");
        System.out.println(s1);
        s1 = "宝玉and 薛宝钗 薛宝钗 薛宝钗";
        s1 = s1.replace("林黛玉", "薛宝钗");
        System.out.println(s1);
        //6.toCharArray
        s = "happy";
        char[] chs = s.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            System.out.println(chs[i]);
        //7.compareTO
        String a="jchn";
        String  b="jack";
            System.out.println(a.compareTo(b));
        }

    }
}
