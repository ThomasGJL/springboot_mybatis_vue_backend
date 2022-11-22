package com.example.springbootmybatisvue.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.springbootmybatisvue.entity.Book;
import com.example.springbootmybatisvue.entity.BookTag;
import com.example.springbootmybatisvue.service.BookService;
import com.example.springbootmybatisvue.service.BookTagService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
@CrossOrigin
@Slf4j
public class BookController {

    @Autowired
    BookService bookService;

    @Autowired
    BookTagService bookTagService;

    @GetMapping("/getBooks")
    public JSONObject getBooks(){

        List<Book> books = bookService.getBooks();

        JSONObject jsonObject = new JSONObject();

        JSONArray jsonArray = JSONArray.parseArray(JSON.toJSONString(books));
        jsonObject.put("result", jsonArray);

        return jsonObject;

    }

    @GetMapping("/getAllTags")
    public List<BookTag> getAllTags(){

        return bookTagService.getAllBookTags();

    }

    @GetMapping("/getAllBooks")
    public List<BookTag> getAllBooks(){

        return bookTagService.getAllBooks();

    }

}
