package com.example.demo.service.serviceImpl;

import com.example.demo.model.BookAuthor;
import com.example.demo.mapper.BookAuthorMapper;
import com.example.demo.service.BookAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookAuthorServiceImpl implements BookAuthorService {
    @Autowired
    BookAuthorMapper bookAuthorMapper;
    @Override
    public boolean add(BookAuthor bookAuthor) {
        return bookAuthorMapper.add(bookAuthor);
    }

    @Override
    public boolean delete(String name) {
        return bookAuthorMapper.delete(name);
    }

    @Override
    public boolean update(BookAuthor bookAuthor) {
        return bookAuthorMapper.update(bookAuthor);
    }

    @Override
    public BookAuthor selectByName(String name) {
        return bookAuthorMapper.selectByName(name);
    }

    @Override
    public List<BookAuthor> selectByCountry(String country) {
        return bookAuthorMapper.selectByCountry(country);
    }

    @Override
    public List<BookAuthor> selectByCountryAndJob(String country, String job) {
        return bookAuthorMapper.selectByCountryAndJob(country, job);
    }
}
