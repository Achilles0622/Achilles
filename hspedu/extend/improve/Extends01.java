package hspedu.extend.improve;

import com.hspedu.extend.Graduate;
import com.hspedu.extend.Pupil;

public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name="小明---";
        pupil.age=11;
        pupil.testing();
        pupil.setScore(20);
        pupil.showInfo();
        System.out.println("----------------");
        Graduate graduate = new Graduate();
        graduate.name="韩顺片---";
        graduate.age=21;
        graduate.setScore(200);
        graduate.testing();
        graduate.showInfo();
    }
}
