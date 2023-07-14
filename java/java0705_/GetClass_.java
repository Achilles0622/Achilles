package java0705_;

public class GetClass_ {
    public static void main(String[] args) throws ClassNotFoundException {

        //1.Class.forName
        String classAllPath="java0705_.Car";
        Class<?> cls1 = Class.forName(classAllPath);
        System.out.println(cls1);
        //2.类名.class，应用场景:用于参数传递
        Class cls2=Car.class;
        System.out.println(cls2);
        //3.对象geiClass()应用场景，有对象实例
        Car car = new Car();
        Class cls3 = car.getClass();
        System.out.println(cls3);
        //4.通过类加载器来获取CLass对象共有4种
        //（１）先得到类加载器car
        ClassLoader classLoader = car.getClass().getClassLoader();
        //(2)通过类的加载器来或得Class对象
        Class<?> cls4 = classLoader.loadClass(classAllPath);
        System.out.println(cls4);
        System.out.println(cls1.hashCode());
        System.out.println(cls2.hashCode());
        System.out.println(cls3.hashCode());
        System.out.println(cls4.hashCode());
        //5基本数据例如下方方式得到Class类对象
        Class<Integer>integerClass=int.class;
        Class<Character>characterClass=char.class;
        Class<Boolean>booleanClass=boolean.class;
        System.out.println(integerClass);//int
        //6基本对应包装类通过type获取Class类
        Class<Integer>type1=Integer.TYPE;
        Class<Character>type2=Character.TYPE;
        System.out.println(type1);
        


    }
}
