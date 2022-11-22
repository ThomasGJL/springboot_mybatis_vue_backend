package com.example.springbootmybatisvue.service;

import com.example.springbootmybatisvue.entity.BookTag;
import com.example.springbootmybatisvue.mapper.BookTagMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BookTagService {

    @Autowired
    BookTagMapper bookTagMapper;

    @Cacheable(cacheNames = {"bookTags"})
    public List<BookTag> getAllBookTags(){

        log.info("get all book tags");

        return bookTagMapper.getAllTags();
    }

    public List<BookTag> getAllBooks(){

        return bookTagMapper.getAllBooks();
    }


}
