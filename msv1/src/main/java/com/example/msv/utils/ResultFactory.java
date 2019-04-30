package com.example.msv.utils;


import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 叫这个名字更加合适，更加要求生成结果对象，并返回前端
 */
public class ResultFactory {
    /**
     * 统一的返回前端接口，不需要复用太多的方法，宜使用has，
     * 并且把返回前端的key设定好
     * status:true,false;
     * content
     * 完成一次请求之后，这map对象应该没用了，应该回收其存储空间。
      */
    Boolean status ;

    LinkedHashMap<String, Object> map = new LinkedHashMap<>();
    static ResultFactory r;
    public synchronized static ResultFactory ok(){
        /**
         * 返回了该类的对象，看起来有点奇怪，见多了就习惯了。
         */
        r = new ResultFactory();
        r.map.put("status", true);
        return r;
    }
    public synchronized static ResultFactory erorr(){
        /**
         * 返回的是map对象，如果能够对其包装一下就好了
         */
        r = new ResultFactory();
        r.map.put("status", true);
        return r;
    }


    public LinkedHashMap<String, Object> put(Object object) {

         r.map.put("content",object);
         return map;
    }

}
