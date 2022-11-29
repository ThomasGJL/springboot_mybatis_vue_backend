package com.example.springbootmybatisvue.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.springbootmybatisvue.entity.Book;
import com.example.springbootmybatisvue.entity.BookTag;
import com.example.springbootmybatisvue.service.BookService;
import com.example.springbootmybatisvue.service.BookTagService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
@CrossOrigin
@Slf4j
@Api(value = "Book Controller")
public class BookController {

    @Autowired
    BookService bookService;

    @Autowired
    BookTagService bookTagService;

    @GetMapping("/getBooks")
    @ApiOperation(value = "get all books")
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

    @GetMapping("getBook")
    @ApiOperation(value = "get book ById")
    public Book getBookById(@ApiParam(name = "id", value = "ID", required = true) @RequestParam("id") String id) {

        return bookService.getBookById(id);
    }

}
