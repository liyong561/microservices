package com.example.chengduservice.test;

/**
 * create by yongli on 2019-10-06 22:26
 */

public class Nuts {
    public int[] getList(int a1) {
        int[] a = new int[4];
        a[0] = 44;
        // 没有c++中的局部变量，非要使用static修饰
        if (a1 > 4)
            System.out.println(a1);
        return a;
    }
}
