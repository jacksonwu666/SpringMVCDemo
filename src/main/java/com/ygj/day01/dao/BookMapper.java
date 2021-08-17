package com.ygj.day01.dao;

import com.ygj.day01.dto.Books;

import java.util.List;

/**
 * @version 1.0
 * @description: TODO
 * @author: WuXiang
 * @create: 2021-08-17 18:46
 **/
public interface BookMapper {
    //添加一本书
    int addBook(Books books);
    //根据id删除一本书
    int deleteBookById(int id);
    //更新书籍
    int updateBooks(Books books);

    //根据id查询一本书
    Books queryBookById(int id);

    //查询所有书籍
    List<Books> queryAllBooks();
}
