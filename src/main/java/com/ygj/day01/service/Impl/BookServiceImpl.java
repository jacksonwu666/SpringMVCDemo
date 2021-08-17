package com.ygj.day01.service.Impl;

import com.ygj.day01.dao.BookMapper;
import com.ygj.day01.dto.Books;
import com.ygj.day01.service.BookService;

import java.util.List;

/**
 * @version 1.0
 * @description: TODO
 * @author: WuXiang
 * @create: 2021-08-17 19:23
 **/
public class BookServiceImpl implements BookService {
    private BookMapper bookMapper;

    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBooks(books);
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAll() {
        return bookMapper.queryAllBooks();
    }
}
