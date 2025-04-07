package com.org.completeSpringapplication.service;

import com.org.completeSpringapplication.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.awt.print.Book;

public class BookService
{

    static boolean flag;
    static {
        flag = true;
    }

    @Autowired
    BookRepository bookRepository;
    public Book addBook(Book book)
    {
        bookRepository. findBookByTitle("book");
        return bookRepository.save(book);
    }
    public Book getBookByName(String name) {
        if (flag) {
            System.out.println("print logger");
            flag = false;
        }
        return bookRepository.findBookByTitle(name);
    }
    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }
}
