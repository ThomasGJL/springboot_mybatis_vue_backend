package com.example.springbootmybatisvue.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "Book entity")
public class Book {

    @ApiModelProperty(value = "id")
    private Integer id;

    @ApiModelProperty(value = "book name")
    private String name;

    @ApiModelProperty(value = "book author")
    private String author;

}
