package hspedu.poly_.objectpoly_;

public class PolyObject {
    public static void main(String[] args) {
        //体验对象多态的特点
        //animal 编译类型就是Animal ,运行类型就是Dog
        Animal animal=new Dog();
        animal.cry();
        animal=new Cat();
        animal.cry();//小猫叫
    }
}
