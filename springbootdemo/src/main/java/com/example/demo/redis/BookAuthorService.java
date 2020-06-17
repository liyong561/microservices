package com.example.demo.redis;

import com.example.demo.model.BookAuthor;

import java.util.List;
/**
 * the service is most import for  a service
 **/
public interface BookAuthorService {
    boolean add(BookAuthor bookAuthor);
    boolean delete(String name);
    boolean update(BookAuthor bookAuthor);
    // 从数据库返回的数据已经封装成对象了。
    BookAuthor selectByName(String name);
    List<BookAuthor> selectByCountry(String country);
    List<BookAuthor> selectByCountryAndJob(String country,String job);

}
