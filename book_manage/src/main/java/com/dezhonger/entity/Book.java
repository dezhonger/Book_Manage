package com.dezhonger.entity;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by dezhonger on 2016/8/2.
 */
public class Book implements Serializable{

    private static final long serialVersionUID = 766130617420986906L;
    @NotNull(message = "password mustn't be null")
    private int id;
    private String name;
    private double price;
    private String info;

    public Book() {
    }

    public Book(int id, String name, double price, String info) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.info = info;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
