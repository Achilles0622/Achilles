package java0705_;

import java.lang.reflect.Field;

public class Class02 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        String classAllPath = "java0705_.Car";
        //1获取到car这额类对应Class对象
        //?表示不确定的java类型
        Class cls = Class.forName(classAllPath);
        //2演示其他 输出cls
        System.out.println(cls);
        System.out.println(cls.getClass());
        //3得到包名
        System.out.println(cls.getPackage().getName());
        //4得到类名称
        System.out.println(cls.getName());
        //5通过cls创建对象实例
        Car car = (Car) cls.newInstance();
        System.out.println(car);
        //6 通过反射获取属性brand
        Field brand = cls.getField("brand");
        System.out.println(brand.get(car));//宝马
        //7 通过反射给属性赋值
        brand.set(car, "奔驰");
        System.out.println(brand.get(car));
        //8希望大家可以遍历所有属性字段
        Field[] field = cls.getFields();
        for (Field f : field) {
            System.out.println(f.getName());
        }
    }
}
