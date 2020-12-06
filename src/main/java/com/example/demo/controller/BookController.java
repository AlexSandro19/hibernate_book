package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/books")
    List<Book> books() {
        List<Book> books = new ArrayList<>();
        books = bookService.findAll();
        System.out.println(books.size());
        for(int i = 0; i < books.size(); i++){
            System.out.println(books.toString());
        }
        return books;
    }

}
