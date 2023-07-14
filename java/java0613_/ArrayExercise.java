package java0613_;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayExercise {
    public static void main(String[] args) {
        Books[]books=new Books[4];
        books[0]=new Books("红楼梦",100);
        books[1]=new Books("金瓶梅",90);
        books[2]=new Books("青年文摘",5);
        books[3]=new Books("java入门到放弃" ,300);
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Books books1=(Books)o1;
                Books books2=(Books)o2;
                double priceVal=books2.getPrice()-books1.getPrice();
                if(priceVal>0){
                    return -1;
                }else if(priceVal<0){
                    return 1;
                }else{
                    return 0;

                }
            }
        });
        System.out.println(Arrays.toString(books));
    }
}
class Books{
    private String name;
    private double price;

    public Books(String name, double price) {
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
        return super.toString();
    }
}

