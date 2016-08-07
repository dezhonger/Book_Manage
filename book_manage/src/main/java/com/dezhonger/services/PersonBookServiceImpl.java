package com.dezhonger.services;

import com.dezhonger.entity.Book;
import com.dezhonger.entity.PersonBook;
import com.dezhonger.mapper.PersonBookDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dezhonger on 2016/8/3.
 */
@Service
public class PersonBookServiceImpl implements PersonBookService {
    @Resource
    PersonBookDao personBookDao;
    public List<PersonBook> getPersonBookById(String id) {
//        System.out.println(personBookDao.getPersonBookById(id));
        return personBookDao.getPersonBookById(id);
    }

    public int insertPersonBook(String username, String bookname) {
        return personBookDao.insertPersonBook(username, bookname);
    }

    public int delete(int id) {
        return personBookDao.delete(id);
    }
}
