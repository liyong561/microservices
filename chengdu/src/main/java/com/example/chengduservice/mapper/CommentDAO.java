package com.example.chengduservice.mapper;

import com.example.chengduservice.entity.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/***
 * Sqlsession是自动生成的。
 */
@Mapper
@Repository
public interface CommentDAO {
    void insert(Comment comment);
    List<Comment> getByServiceId(int serviceId);
}
