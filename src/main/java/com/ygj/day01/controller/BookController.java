package com.ygj.day01.controller;

import com.ygj.day01.dto.Books;
import com.ygj.day01.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @description: TODO
 * @author: WuXiang
 * @create: 2021-08-18 11:25
 **/
@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> list = bookService.queryAll();
        model.addAttribute("list",list);
        return "allBook";
    }

    @RequestMapping("/toAddBook")
    public String toAddBook(){
        return "addBook";
    }

    @RequestMapping("/addBook")
    public String addBook(Books books){
        System.out.println(books);
        bookService.addBook(books);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(Model model,int id){
        Books books = bookService.queryBookById(id);
        System.out.println(books);
        model.addAttribute("book",books);
        return "updateBook";
    }

    @RequestMapping("/updateBook")
    public String updateBook(Books books,Model model){
        System.out.println(books);
        bookService.updateBook(books);
        Books book = bookService.queryBookById(Integer.parseInt(books.getBookID()));
        model.addAttribute("book",book);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/del/{bookId}")
    public String delete(@PathVariable("bookId") int id){
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/queryBook")
    public String queryBook( String queryBookName,Model model){
        Books book = bookService.queryBookByName(queryBookName);
        System.out.println("查询的书籍:"+book);
        List<Books> list = new ArrayList<>();
        list.add(book);
        if (book == null){
            list = bookService.queryAll();
            model.addAttribute("error","查询的书籍为空！");
        }
        model.addAttribute("list",list);
        return "allBook";
    }

}
