package java0617_;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework02 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        Car car = new Car("宝马", 400000);
        Car car2 = new Car("宾利", 500000);
        arrayList.add(car);
        arrayList.add(car2);
        System.out.println("Car="+ arrayList);
        arrayList.remove(car);
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        System.out.println(arrayList);
        arrayList.addAll(arrayList);
        System.out.println("---------------------");
        System.out.println(arrayList);
        System.out.println("---------------------");
        arrayList.containsAll(arrayList);
        for(Object o:arrayList){
            System.out.println(o);
        }



    }
}
class Car{
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
