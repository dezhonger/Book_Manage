package com.dezhonger.mapper;

import com.dezhonger.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by dezhonger on 2016/8/2.
 */
@Repository
public interface BookDao {
    List<Book> getAllBooks();
    int getCountBooks();
    Book getBookById(int id);
    int insert(Book book);
    int delete(int id);
//    int update(Book book);
}
