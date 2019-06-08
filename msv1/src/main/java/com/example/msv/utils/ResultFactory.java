package com.example.msv.utils;


import lombok.Data;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 叫这个名字更加合适，更加要求生成结果对象，并返回前端
 */
@Data
public class ResultFactory {
    /**
     * 统一的返回前端接口，不需要复用太多的方法，宜使用has，
     * 并且把返回前端的key设定好
     * status:true,false;
     * content
     * 完成一次请求之后，这map对象应该没用了，应该回收其存储空间。
      */
    Boolean status ;
    Map<String,Object> map;
    static ResultFactory r;
    public ResultFactory(){

    }

    public synchronized static ResultFactory ok(){
        /**
         * 返回了该类的对象，看起来有点奇怪，见多了就习惯了。
         * 静态方发不能引用非静态方发
         */
        r = new ResultFactory();
        r.setStatus(true);
        r.map = new LinkedHashMap<>();
        return r;
    }
    public synchronized static ResultFactory erorr(){
        /**
         * 返回的是map对象，如果能够对其包装一下就好了
         */
        r = new ResultFactory();
        r.setStatus(true);
        r.map = new LinkedHashMap<>();
        return r;
    }


    public ResultFactory put(String str,Object object) {
        // 放入object子类还是不合适。
         r.map.put(str,object);
         // put("content",Object)返回还是不合适。
         // 还得返回这个对象
         return r;
    }

}
