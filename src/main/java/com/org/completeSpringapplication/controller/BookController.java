package com.org.completeSpringapplication.controller;

import com.org.completeSpringapplication.Entity.Book;
import com.org.completeSpringapplication.service.BookService;
import com.org.completeSpringapplication.service.FirstProgrammaticApproach;
import com.org.completeSpringapplication.service.SecondProgrammaticApproach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RestController
@RequestMapping("/book")
public class BookController
{
    BookService bookService;
    FirstProgrammaticApproach firstProgrammaticApproach;
    SecondProgrammaticApproach secondProgrammaticApproach;

    @Autowired
    public BookController(BookService bookService,FirstProgrammaticApproach firstProgrammaticApproach,
                          SecondProgrammaticApproach secondProgrammaticApproach)
    {
        this.bookService = bookService;
        this.firstProgrammaticApproach=firstProgrammaticApproach;
        this.secondProgrammaticApproach=secondProgrammaticApproach;
    }

    @GetMapping("/getBook/{bookId}")
    public ResponseEntity<Optional<Book>> getBookById(@PathVariable("bookId") Integer bookId)
    {
        //firstProgrammaticApproach.updateUser();
        secondProgrammaticApproach.updateUser();
        final Optional<Book> bookById = bookService.findById(bookId);
        return ResponseEntity.ok(bookById);
    }

    @PostMapping("/addBook")
    public ResponseEntity<Book> addBook(@RequestBody Book book)
    {
        Book savedBook = bookService.addBook(book);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedBook);
    }

    @DeleteMapping("/deleteBook")
    public ResponseEntity<String> deleteBook(@RequestBody Integer bookId)
    {
        bookService.deleteBook(bookId);
        return ResponseEntity.status(HttpStatus.OK).body("Book with "+bookId+" deleted");
    }
}
