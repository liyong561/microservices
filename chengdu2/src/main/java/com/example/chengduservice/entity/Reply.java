package com.example.chengduservice.entity;

import lombok.Data;

@Data
public class Reply {
    Integer id;
    Integer commentId;
    String content;
}
