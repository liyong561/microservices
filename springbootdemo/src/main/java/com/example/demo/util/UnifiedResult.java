package com.example.demo.util;

/**
 * 暂时只封装了一个标志符信息，其他的信息等以后在封装。
 */
public class UnifiedResult<T> {
    Boolean  state;
    T data;

    public UnifiedResult(Boolean state, T data) {
        this.state = state;
        this.data = data;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
