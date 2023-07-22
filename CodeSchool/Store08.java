package CodeSchool;

public class Store08 {// instance fields
    String productType;
    double price;

    public Store08(String product, double initialPrice) {
        productType = product;
        price = initialPrice;
    }

    public void increasePrice(double priceToAdd){
        double newPrice = price + priceToAdd;
        price = newPrice;
    }

    public double getPriceWithTax(){
        double tax = 0.08;
        double totalPrice = price + price*tax;
        return totalPrice;
    }
    public String toString(){
        return "This store sells " + productType + " at a price of " + price + ".";
    }

    public static void main(String[] args) {
        Store08 lemonadeStand = new Store08("Lemonade", 3.75);
        Store08 cookieShop = new Store08("Cookies", 5);

        System.out.println(lemonadeStand);
        System.out.println(cookieShop);

    }
}
