package java0613_;


import java.util.Arrays;

public class Systems {
    public static void main(String[] args) {
        java.lang.System.out.println("ok1");
        java.lang.System.exit(0);
        java.lang.System.out.println("ok2");

        int[]src={1,2,3};
        int []dest=new int[3];
        System.arraycopy(src,1,dest,1,2);
        System.out.println("dest="+ Arrays.toString(dest));
    }
}

