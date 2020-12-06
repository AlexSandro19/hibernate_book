package com.example.demo.service;

import com.example.demo.model.Book;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class BookServiceTest {

    @Autowired
    private BookService bookService;


    @Test
    public void whenApplicationStarts_thenHibernateCreatesInitialRecords(){
        List<Book> books = bookService.findAll();

        assertEquals(books.size(), 3);
    }
}