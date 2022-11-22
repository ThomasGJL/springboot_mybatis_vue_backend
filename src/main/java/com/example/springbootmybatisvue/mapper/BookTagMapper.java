package com.example.springbootmybatisvue.mapper;

import com.example.springbootmybatisvue.entity.BookTag;

import java.util.List;

public interface BookTagMapper {

    List<BookTag> getAllTags();

    List<BookTag> getAllBooks();

}


