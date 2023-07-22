package CodeSchool;
import java.util.ArrayList;
public class MostExpensive {
    public static void main(String[] args) {

        ArrayList<Double> expenses = new ArrayList<Double>();
        expenses.add(74.46);
        expenses.add(63.99);
        expenses.add(10.57);
        expenses.add(81.37);

        double mostExpensive = 0;

        for (double expense : expenses) {

            if (expense > mostExpensive) {
                mostExpensive = expense;
            }

        }

        System.out.println(mostExpensive);

    }

}

