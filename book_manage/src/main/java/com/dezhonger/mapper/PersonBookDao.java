package com.dezhonger.mapper;

import com.dezhonger.entity.Book;
import com.dezhonger.entity.PersonBook;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by dezhonger on 2016/8/3.
 */
@Repository
public interface PersonBookDao {
    List<PersonBook> getPersonBookById(String id);
    int insertPersonBook(String username, String bookname);
    int delete(int id);
}
