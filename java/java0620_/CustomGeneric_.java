package java0620_;

public class CustomGeneric_ {
    public static void main(String[] args) {

    }
}
//1.Tiger 后面泛型，自定义泛型类
//2.TRM泛型的表示符号，大写
//3.可以使用多个
//4.普通成员也可以使用
//5.在使用时候不能初始化
class Tiger<T,R,M>{
    String name;
    R r;
    M m;
    T t;
    T[]ts;
    //T[]ts=new T[8];类型不能确定 所以不能初始化，

    public Tiger(String name, R r, M m, T t) {
        this.name = name;
        this.r = r;
        this.m = m;
        this.t = t;

    }
    //静态是和类相关的 ，类的加载是在前面 对象还没创建；
    //静态方式和类型使用了泛型，无法初始化
//    R r2;
//    public  static void m1(M m){
//
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}