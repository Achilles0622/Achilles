package CodeSchool;

public class Store03 {
    String productType;

    public Store03(String product) {
        productType = product;
    }

    public void advertise() {
        System.out.println("Selling " + productType + "!");
        System.out.println("Come spend some money!");
    }

    public static void main(String[] args) {
        Store03 lemonadeStand = new Store03("Lemonade");
        lemonadeStand.advertise();
        lemonadeStand.advertise();
        lemonadeStand.advertise();
    }
}
