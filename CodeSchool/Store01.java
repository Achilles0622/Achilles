package CodeSchool;

public class Store01 {
   Store01() {
        System.out.println("I am inside the constructor method.");
    }

    public static void main(String[] args) {
        System.out.println("Start of the main method.");

        Store01 lemonadeStand = new Store01();

        System.out.println(lemonadeStand);
    }
}
