package service;

import impl.BookDao;
import impl.BookDaoImpl;
import service.BookService;

public class BookServicelmpl implements BookService{
    //删除勇new方式产生dao对象
    private BookDao bookDao;
public void save(){
    System.out.println("book service save...");
    bookDao.save();
}
//提供对应set方法
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
