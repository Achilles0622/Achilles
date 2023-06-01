package hspedu.extend;

public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son();//内存的布局
        System.out.println(son.name);
        //System.out.println(son.age);//孙子类没有就往上层开始找父类爷类祖宗类
        System.out.println(son.getage());
        System.out.println(son.hobby);
    }
}
class GrandPa {//爷类
    String name = "大头爷爷";
    int age=80;
    String hobby = "旅游";
}
    class Father extends GrandPa {//父类
        String name = "大头爸爸";

        private int age = 39;

        public int  getage() {
            return age;
        }
    }
        class Son extends Father{
            String name="大头儿子";
        }
