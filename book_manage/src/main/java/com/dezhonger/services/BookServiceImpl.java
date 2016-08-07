package com.dezhonger.services;

import com.dezhonger.entity.Book;
import com.dezhonger.mapper.BookDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dezhonger on 2016/8/2.
 */
@Service
public class BookServiceImpl implements BookService {
    @Resource
    BookDao bookDao;
    public List<Book> getAllBooks() {
        return bookDao.getAllBooks();
    }

    public int getCountBooks() {
        return bookDao.getCountBooks();
    }

    public Book getBookById(int id) {
        return bookDao.getBookById(id);
    }

    public int delete(int id) {
        return bookDao.delete(id);
    }

    public int insert(Book book) {
        return bookDao.insert(book);
    }
}
