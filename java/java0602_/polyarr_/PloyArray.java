package java0602_.polyarr_;

public class PloyArray {
    public static void main(String[] args) {

        Person[] persons = new Person[5];
        persons[0] = new Person("jack", 20);
        persons[1] = new Student("jack", 18, 100);
        persons[2] = new Student("smith", 19, 31.1);
        persons[3] = new Teacher("scott", 30, 20000);
        persons[4] = new Teacher("king", 50, 25000);
//循环遍历多态数组
        for (int i = 0; i < persons.length; i++) {
            //老师提示：
            System.out.println(persons[i].say());
            if (persons[i] instanceof Student) {//判断persons的运行类型是不是Student
                Student studetn = (Student) persons[i];
                studetn.study();
                //小伙伴也可以使用第一条语句
            } else if (persons[i] instanceof Teacher) {
              Teacher teacher=(Teacher) persons[i];
              teacher.teach();
            } else {

                System.out.println("你的类型有误");
            }
        }
    }
}
