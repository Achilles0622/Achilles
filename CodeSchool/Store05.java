package CodeSchool;

public class Store05 {
    String productType;

    public Store05(String product) {
        productType = product;
    }

    public void advertise() {
        String message = "Selling " + productType + "!";
        System.out.println(message);
    }
    public void greetCustomer(String customer){
        System.out.println("Welcome to the store, " + customer + "!");
    }
    public static void main(String[] args) {
        Store05 lemonadeStand = new Store05("Lemonade");
        lemonadeStand.greetCustomer("Laura");
    }
}
