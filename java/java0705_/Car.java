package java0705_;

public class Car {
    public int price=500000;
    public String brand="宝马";

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public String color=" 白色";

}
