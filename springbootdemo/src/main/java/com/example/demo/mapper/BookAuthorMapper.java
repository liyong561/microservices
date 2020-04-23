package com.example.demo.mapper;


import com.example.demo.model.BookAuthor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookAuthorMapper {
    // boolean是标识操作是否成功。，
    boolean add(BookAuthor bookAuthor);
    boolean delete(String name);
    boolean update(BookAuthor bookAuthor);
    // 一般应用提供给用户更多的选择
    BookAuthor selectByName(String name);
    List<BookAuthor> selectByCountry(String country);
    List<BookAuthor> selectByCountryAndJob(String country,String job);

}
