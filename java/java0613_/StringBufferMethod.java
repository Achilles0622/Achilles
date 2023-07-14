package java0613_;

public class StringBufferMethod {
    public static void main(String[] args) {
        //添加方法
        StringBuffer s = new StringBuffer("Hello ");
        s.append(',');
        s.append("张三丰");
        s.append("赵敏").append(100).append(true).append(10.5);
        System.out.println(s);
        //删除方法
        s.delete(11,14);
        System.out.println(s);
        //插入
        s.insert(9,"赵敏");
        System.out.println(s);
        //长度
        System.out.println(s.length());
        System.out.println(s);
    }
}
