package com.example.chengduservice.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * 为返回前端的数据提供统一接口，Restful规范，Facade模式
 * 关键是要想向前端传输哪些数据，所有从数据库中取出的数据都放在Result对象中。
 */
public class CommonResult {
    Boolean status; // 是否有返回结果，二值可以杜绝在传播过程中的不一致性,true就可以去取结果，false则报错
    String errorMessage;
    /**
     * 怎么让data容纳不同类型的数据。使用Object类，是所有类的父类，
     * 可以实现toString的多态
     * List<Object> data; // 糟糕的设计
     */
    Object result;


    public static CommonResult success(Object result){
        CommonResult commonResult = new CommonResult();
        commonResult.status =true;
        commonResult.result = result;
        return commonResult;
    }

    public static CommonResult failure(String errorMessage){
        CommonResult commonResult = new CommonResult();
        commonResult.status =true;
        commonResult.errorMessage = errorMessage;
        return commonResult;
    }

    // 不需要get，set方法吗？是的，时候用new构造的
    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

    // Jackson默认会使用反射，所以要有这些方法
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
