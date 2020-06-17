package com.example.demo.redis.serviceImpl;

import com.example.demo.model.Book;
import com.example.demo.mapper.BookMapper;
import com.example.demo.redis.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService{
    @Autowired
    BookMapper bookMapper;
    @Override
    public boolean add(Book book) {
        return bookMapper.add(book);
    }

    @Override
    public boolean delete(long id) {
        return bookMapper.delete(id);
    }

    @Override
    public boolean update(Book book) {
        return bookMapper.update(book);
    }

    @Override
    public List<Book> query(String author) {
        return bookMapper.query(author);
    }

    @Override
    public Book getOne(long id) {
        return bookMapper.getOne(id);
    }
}
