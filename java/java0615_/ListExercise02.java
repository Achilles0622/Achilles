package java0615_;

import java.util.ArrayList;
import java.util.List;

public class ListExercise02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("红楼梦", "曹雪芹", 100));
        list.add(new Book("西游记", "吴承恩", 10));
        list.add(new Book("水浒传", "施耐庵", 900));
        list.add(new Book("三国演义", "罗贯中", 80));
//        list.add(new Book("红楼梦","曹雪芹",100));
        for (Object o : list) {
            System.out.println(o);
        }
        sort(list);
        System.out.println("-----------------------");
        for (Object o:list){
            System.out.println(o);
        }
    }

    public static void sort(List list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                Book book1 = (Book) list.get(j);
                Book book2 = (Book) list.get(j + 1);
                if (book1.getPrice() > book2.getPrice()) {
                    list.set(j, book2);
                    list.set(j + 1, book1);
                }

            }
        }
    }
}
