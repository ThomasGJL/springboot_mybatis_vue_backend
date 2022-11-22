package com.example.springbootmybatisvue.mapper;

import com.example.springbootmybatisvue.entity.Book;

import java.util.List;

//@Mapper
public interface BookMapper {

    //@Select("select * from book")
    List<Book> getBooks();


}
