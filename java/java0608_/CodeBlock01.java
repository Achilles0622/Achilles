package java0608_;

public class CodeBlock01 {
    public static void main(String[] args) {
        Movie movie = new Movie("你好啊");
        Movie movie1 = new Movie("lala", 100, "jack");
    }
}

class Movie {
    private String name;
    private double price;
    private String director;

    {
        System.out.println(" 屏幕打开了");
        System.out.println("广告开始");
        System.out.println("电影开始");
    }

    public Movie(String name) {
        System.out.println("name被调用了");
        this.name = name;
    }

    public Movie(double price, String director) {
        this.price = price;
        this.director = director;
    }

    public Movie(String name, double price, String director) {
        System.out.println("beidiaoyongle ");
        this.name = name;
        this.price = price;
        this.director = director;
    }
}




