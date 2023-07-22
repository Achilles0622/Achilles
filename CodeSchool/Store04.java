package CodeSchool;

public class Store04 {
    String productType;

    public Store04(String product) {
        productType = product;
    }

    public void advertise() {
        String message = "Selling " +  productType  + "!";
        System.out.println(message);
    }

    public static void main(String[] args) {
        String cookie = "Cookies";
        Store04 cookieShop = new Store04(cookie);

        cookieShop.advertise();
    }
}
