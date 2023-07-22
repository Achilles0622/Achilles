package CodeSchool;

public class Store06 {
    String productType;
    double price;
    public Store06(String product, double initialPrice) {
        productType = product;
        price = initialPrice;
    }

    public void increasePrice(double priceToAdd){
        double newPrice = price + priceToAdd;
        price = newPrice;
    }

    public static void main(String[] args) {
        Store06 lemonadeStand = new Store06("Lemonade", 3.75);
        lemonadeStand.increasePrice(1.5);
        System.out.println(lemonadeStand.price);
    }
}
