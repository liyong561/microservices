package com.example.demo.redis;


import com.example.demo.util.Redis;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * template for the redis,it provide sub-api,like opsForValue,opsForList,opsForSet.
 * this is suitable for the redis
 */
@Component
public class RedisService {
    private static final Logger logger= LoggerFactory.getLogger(RedisService.class);


    public static void main2(String[] args) {
        RedisService redisService = new RedisService();
        // name是一个hold key
        redisService.setListValue("mylist","liyong83381","liyong123");
        List<String> ret= redisService.getListValue("mylist","10");
        System.out.println(ret);
    }

    // not use <String,String>
    // redis直接中配置文件中读取参数

    public  String setValue(String key,Object value){

        try{
            Socket socket = new Socket("127.0.0.1",6379);
            Redis redis = new Redis(socket);
            return redis.call("set",key,value);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    // return object,then can change the type;
    public String getValue(String key){
        try {
            Socket socket = new Socket("127.0.0.1", 6379);
            Redis redis = new Redis(socket);
            // 原始方法返回的都是byte[],字节数组，需要手动转换为字符
            byte[] bytes = redis.call("get",key);
            return new String(bytes);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public  Long setListValue(String mylist,String... args){

        try{
            Socket socket = new Socket("127.0.0.1",6379);
            Redis redis = new Redis(socket);
            // 这样...参数有问题
            // return redis.call("lpush",mylist,args);
            int len = args.length;
            String[] cmds= new String[len+2];
            cmds[0] = "lpush";
            cmds[1] = mylist;
            int i= 2;
            for(String arg:args){
                cmds[i++]= arg;
            }
            return redis.call(cmds);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    // return object,then can change the type;
    public List<String> getListValue(String list,String idx){
        try {
            Socket socket = new Socket("127.0.0.1", 6379);
            Redis redis = new Redis(socket);
            // 原始方法返回的都是byte[],字节数组，需要手动转换为字符
            List<Object> ret = redis.call("lrange",list,"0",idx);
            List<String> retS =new ArrayList<>();
            for(Object o:ret){
                byte[] bytes = (byte[])o;
                String ele = new String(bytes);
                retS.add(ele);
            }
            return retS;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
