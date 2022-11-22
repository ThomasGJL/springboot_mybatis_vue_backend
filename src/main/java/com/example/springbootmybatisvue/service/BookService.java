package com.example.springbootmybatisvue.service;

import com.example.springbootmybatisvue.entity.Book;
import com.example.springbootmybatisvue.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookMapper bookMapper;

    public List<Book> getBooks(){

        return bookMapper.getBooks();

    }
}
