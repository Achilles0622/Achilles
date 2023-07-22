package CodeSchool;

public class Store02 {
    String productType;

    public Store02(String product) {
        productType = product;
    }

    public void advertise(){
        System.out.println("Come spend some money!");
        System.out.println("Selling " + productType + "!");
    }
    public static void main(String[] args) {

    }
}
