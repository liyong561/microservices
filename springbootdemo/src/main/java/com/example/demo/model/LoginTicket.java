package com.example.demo.model;

import java.util.Date;

/**
 * 用于用户状态的标识
 */
public class LoginTicket {
    int  id;
    int user_name;
    String ticket;
    Date expired;
    // 标识用户的身份。
    int status;

}
