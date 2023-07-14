package java0702_;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectionQuestion {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //传统的方法
        Cat cat = new Cat();
        cat.hi();
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/main/java/re.properties"));
        String classpath = properties.get("classpath").toString();
        String methodName = properties.get("method").toString();
        System.out.println(1);
        System.out.println(methodName);
        Class cls = Class.forName(classpath);
        Object o = cls.newInstance();
        System.out.println(o.getClass());
        Method method1 = cls.getMethod(methodName);
        System.out.println("----------");
        method1.invoke(o);
    }

}
