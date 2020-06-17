package com.example.demo.redis;

import com.example.demo.model.Book;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

/**
 * 这个类做一些业务处理
 */
public interface BookService {
    boolean add(Book book);
    boolean delete(long id);
    boolean update(Book  book);





























































    @Cacheable("booksCache")
    List<Book> query(String author);
    Book getOne(long id);

}
