package java0609_;

public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season12.AUTUMN);
    }
}

class Season12 {
    private String name;
    private String desc;
    public static Season SPRING=new Season("春天","温暖");
    public static Season WINTER=new Season("冬天","寒冷");
    public static Season AUTUMN=new Season("秋天","凉爽");
    public static Season SUMMER =new Season("夏天","炎热" );


    private Season12(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

   // @Override
    public String toString() {
        return super.toString();
    }
}

