package com.ygj.day01.service;

import com.ygj.day01.dto.Books;

import java.util.List;

/**
 * @version 1.0
 * @description: TODO
 * @author: WuXiang
 * @create: 2021-08-17 19:26
 **/
public interface BookService {
    //添加一本书
    int addBook(Books books);
    //删除一本书
    int deleteBookById(int id);
    //更新Book
    int updateBook(Books books);
    //根据id查询一本书
    Books queryBookById(int id);
    //根据书名查询书籍
    Books queryBookByName(String bookName);
    //查询所有Book
    List<Books> queryAll();
}
