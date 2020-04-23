package com.example.chengduservice.service;

import com.example.chengduservice.entity.Comment;

import java.util.List;

/**
 * 规范：add,get+condition,update,delete,batch
 */
public interface CommentService {
    List<Comment> getServiceById(int serviceId);

    /**
     * 用户添加评论
     * @param comment
     *
     */
    void add(Comment comment);
    Comment getByUserId(Integer userId);


}
