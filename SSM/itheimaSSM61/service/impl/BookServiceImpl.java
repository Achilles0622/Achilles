package com.itheimaSSM61.service.impl;

import com.itheimaSSM61.dao.BookDao;
import com.itheimaSSM61.domain.Book;
import com.itheimaSSM61.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;
    public boolean save(Book book) {
        bookDao.save(book);
        return true;
    }

    public boolean update(Book book) {
        bookDao.update(book);

        return true;
    }

    public boolean delete(Integer id) {
        bookDao.delete(id);

        return true;
    }

    public Book getById(Integer id) {

        return bookDao.getById(id);
    }

    public List<Book> getAll() {


        return bookDao.getAll();
        }
        }
