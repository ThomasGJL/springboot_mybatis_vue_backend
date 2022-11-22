package com.example.springbootmybatisvue.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookTag implements Serializable {

    private Integer id;
    private String tag_name;
    private List<Book> books;

}
