package com.itheima32Aop.dao.impl;

import com.itheima32Aop.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    public void save(){
        System.out.println(System.currentTimeMillis()  );
        System.out.println("book dao save....");
    }
    public void update(){System.out.println("book dao update....");}

}
