package com.example.demo.util;

import java.util.ArrayList;
import java.util.List;

/**
 * 将请求数据统一使用Result封装，为前端访问提供统一接口，该封装提供统一的可迭代集合
 * 因为封装的数据类型不确定，应该是一个泛型接口，
 * 这个接口添加的内容，1.返回状态，Boolean.
 */
public class UnifiedResultSet<T> {
    Boolean state;
    List<T> data =new ArrayList<>();

    public UnifiedResultSet(Boolean state, List<T> data) {
        this.state = state;
        this.data = data;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
