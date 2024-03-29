package com.syj.springboot.entity;

/**
 * @author SYJ
 * @description: 书籍实体类
 * @date 2019/9/30
 */
public class Book {
    private Integer id;

    private String name;

    private String author;

    private Double price;

    public Book() {
    }

    public Book(Integer id, String name, String author, Double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
