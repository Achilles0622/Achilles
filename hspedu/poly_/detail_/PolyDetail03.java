package hspedu.poly_.detail_;

public class PolyDetail03 {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb instanceof BB);
        System.out.println(bb instanceof AA);
        AA aa = new BB();
        System.out.println(aa instanceof AA);
        System.out.println(aa instanceof BB);
        Object obj = new Object();
        System.out.println(obj instanceof AA);
        String str="hello";
        System.out.println(str instanceof  Object );
    }
}

class AA {
}

class BB extends AA {
}