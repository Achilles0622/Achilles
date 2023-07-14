package java0608_;

public class AbsractExercis01 {
    public static void main(String[] args) {
        Manager jack = new Manager("jack", 999, 50000);
        jack.setBonus(8999);
        jack.work();

        common tom = new common("tom", 888, 50000);
        tom.work();

    }
}
