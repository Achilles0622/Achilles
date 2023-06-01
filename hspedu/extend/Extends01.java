package hspedu.extend;

public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name="小明";
        pupil.age=10;
        pupil.testing();
        pupil.setScore(60);
        pupil.showInfo();
        System.out.println("----------------");
        Graduate graduate = new Graduate();
        graduate.name="韩顺片";
        graduate.age=20;
        graduate.testing();
        graduate.setScore(100);
        graduate.showInfo();

    }
}
