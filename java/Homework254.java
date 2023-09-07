public class Homework254{
	public static void main (String[]args) {
		Book book=new Book("三国演义",300);
		book.info();
		
	}
}
class Book{
	String name;
	double price ;
	public Book(String name ,double price ) {
		this.name=name;
		this.price=price;
	}
	public void updatePrice() {
		if(this.price>150) {
			this.price=150;
		}else if (this.price>100){
			this.price=100;
		}else{
		}
		}
	public void info () {
		System.out.println("book name ="+this.name+"mach"+this.price);
	}
	}
