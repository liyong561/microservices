package com.example.demo.mapper;

import com.example.demo.model.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Book对象和数据库中Book表的映射，
 * 这些方法都要和对应的mapper文件相关联，最后生成对数据库操作的语句。
 * springboot相比于spring mvc就是为我们自动配置了SqlSession Bean,
 * 当我们去调用使用@ Mapper注释的对象，Context就会使用SqlSession去执行它。
 */

@Mapper
public interface BookMapper {
    boolean add(Book book);
    boolean delete(long id);
    boolean update(Book  book);
    List<Book> query(String name);
    Book getOne(long id);
}
