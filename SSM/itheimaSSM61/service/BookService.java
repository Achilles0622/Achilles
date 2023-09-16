package com.itheimaSSM61.service;

import com.itheimaSSM61.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface BookService {


    public boolean  save(Book book);
    public boolean update(Book book);
    public boolean  delete(Integer id);

    /**
     * 喊删除
     * @param id
     * @return
     */
    public Book getById(Integer id);

    public List<Book> getAll();
}
