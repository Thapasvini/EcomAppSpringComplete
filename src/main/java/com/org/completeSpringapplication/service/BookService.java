package com.org.completeSpringapplication.service;

import com.org.completeSpringapplication.Entity.Book;
import com.org.completeSpringapplication.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;
import java.util.Optional;

@Service
public class BookService
{

    static boolean flag;
    static {
        flag = true;
    }

    @Autowired
    BookRepository bookRepository;

    @Transactional(transactionManager="transactionManager")
    public Book addBook(Book book)
    {
        return bookRepository.save(book);
    }
    public Optional<Book> getBookByName(String name)
    {
        if (flag) {
            System.out.println("print logger");
            flag = false;
        }
        return bookRepository.findBookByTitle(name);
    }
    public Book updateBook(Book book)
    {
        return bookRepository.save(book);
    }

    public void deleteBook(Integer id)
    {
        bookRepository.deleteById(id);
    }

    public Optional<Book> findById(Integer id)
    {
        Optional<Book> optionalBook = bookRepository.findById(id);
        return optionalBook;
    }

    public Optional<Book> patchBook(Integer bookId, Map<String,Object> updates)
    {
        Optional<Book> optionalBook = bookRepository.findById(bookId);

        if (optionalBook.isPresent())
        {
            Book b=optionalBook.get();

            updates.forEach((key,value)->
            {
                switch(key)
                {
                    case"title": b.setTitle((String)value); break;
                    case"author": b.setAuthor((String)value); break;
                }
            });
            return Optional.of(bookRepository.save(b));
        }
        return null;

    }
    public ResponseEntity<Void> getBookHeaders()
    {
    // Returning empty headers for demonstration purposes
        return ResponseEntity.ok().build();
    }
}
