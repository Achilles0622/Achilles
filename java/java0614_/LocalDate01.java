package java0614_;

import java.time.LocalDateTime;

public class LocalDate01 {
    public static void main(String[] args) {
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);
        System.out.println("yeah="+ldt.getYear());
        ldt.getYear();
        ldt.getMonthValue();
        ldt.getMonth();
        ldt.getDayOfMonth();
        ldt.getHour();
        ldt.getMinute();
        ldt.getSecond();
    }
}
