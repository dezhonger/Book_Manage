package com.dezhonger.services;

import com.dezhonger.entity.Book;

import java.util.List;

/**
 * Created by dezhonger on 2016/8/2.
 */
public interface BookService {
    List<Book> getAllBooks();
    int getCountBooks();
    Book getBookById(int id);
    int delete(int id);
    int insert(Book book);
}
