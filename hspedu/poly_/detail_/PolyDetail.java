package hspedu.poly_.detail_;

import javax.lang.model.util.SimpleElementVisitor7;

public class PolyDetail {
    public static void main(String[] args) {
        //向上转型
        Animal animal = new Cat();
        Object obj = new Cat();

        System.out.println("ok^^^^");
        animal.eat();
        animal.run();
        animal.show();
        animal.sleep();
        Cat cat= (Cat)animal;
        cat.catchMouse();
        System.out.println("   ");
        Dog dog=(Dog) animal;
    }
}
