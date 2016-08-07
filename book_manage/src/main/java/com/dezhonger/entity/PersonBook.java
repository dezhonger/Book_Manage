package com.dezhonger.entity;

import java.io.Serializable;

/**
 * Created by dezhonger on 2016/8/3.
 */
public class PersonBook implements Serializable{
    private static final long serialVersionUID = 6403492238128236362L;
    private int id;
    private String username;
    private String bookname;
    private String beizhu;

    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }

    @Override
    public String toString() {
        return "PersonBook{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", bookname='" + bookname + '\'' +
                '}';
    }
}
