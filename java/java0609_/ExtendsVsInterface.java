package java0609_;

public class ExtendsVsInterface {
    public static void main(String[] args) {
        LittleMonkey WuKong = new LittleMonkey("悟空");
        WuKong.climbing();
        WuKong.swimming();
        WuKong.fly();
    }
}

class monkey {
    private String name;

    public monkey(String name) {
        this.name = name;
    }

    public void climbing() {
        System.out.println(name + "猴子会爬树");
    }

    public String getName() {
        return name;
    }
}

interface Fish {
    void swimming();

}

interface Bird {
    void fly();
}

class LittleMonkey extends monkey implements Fish, Bird {
    public LittleMonkey(String name) {
        super(name);
    }


    public void swimming() {
        System.out.println(getName() + "通过学习可以游泳了");
    }



    public void fly() {
        System.out.println(getName() + "通过学习可以游泳了");
    }
}
