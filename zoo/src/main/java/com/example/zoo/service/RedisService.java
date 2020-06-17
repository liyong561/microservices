package com.example.zoo.service;

import com.example.zoo.util.Redis;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.net.Socket;

/**
 * create by yongli on 2020-05-04 11:47
 */

@Service
public class RedisService {
    Logger logger= LoggerFactory.getLogger(RedisService.class);
    // not use <String,String>
    // redis直接中配置文件中读取参数

    public  Object setValue(String key,Object value){

        try{
            Socket socket = new Socket("127.0.0.1",6379);
            Redis redis = new Redis(socket);
            return redis.call("set",key,value);
        }catch (Exception e){

        }
        return false;
    }

    // return object,then can change the type;
    public Object getValue(String key){
        try {
            Socket socket = new Socket("127.0.0.1", 6379);
            Redis redis = new Redis(socket);
            return redis.call("get",key);
        }catch (Exception e){

        }
        return null;
    }
}

