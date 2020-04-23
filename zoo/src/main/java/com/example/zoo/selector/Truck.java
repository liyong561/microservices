package com.example.zoo.selector;

/**
 * create by yongli on 2020-04-02 19:22
 */

public class Truck {

    private int status;

    // 创建对象是必须初始化转态
    public Truck(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    /**
     *
     * @param selector 选择器
     * @param status 监听事件
     *               这个很好重要的方法，只有向选择器注册，才能响应这些事情
     */
    public void registry(Selector selector, int status){
        selector.add(this,status); // 这两个对象相互持有应用，有点奇怪，但这是正常的。
    }
}
