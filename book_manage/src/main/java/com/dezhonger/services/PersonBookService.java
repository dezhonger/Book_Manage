package com.dezhonger.services;

import com.dezhonger.entity.Book;
import com.dezhonger.entity.PersonBook;

import java.util.List;

/**
 * Created by dezhonger on 2016/8/3.
 */
public interface PersonBookService {
    List<PersonBook> getPersonBookById(String id);
    int insertPersonBook(String username, String bookname);
    int delete(int id);
}
