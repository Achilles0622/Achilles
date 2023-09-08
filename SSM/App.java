import impl.BookDao;
import service.BookServicelmpl;

public class App {
    public static void main(String[] args) {
        BookServicelmpl bookService = new BookServicelmpl();
        bookService.save();
    }
}
