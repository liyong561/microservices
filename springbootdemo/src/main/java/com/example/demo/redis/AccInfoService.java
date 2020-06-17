package com.example.demo.redis;

import com.example.demo.model.AccInfo;

/**
 * 对AccInfo对象进行的crud操作接口。比较固定，就是对象的类型变了。
 * 先实现简单的，再进行扩充。
 * 然后spring的项目很多都是依赖于annotation,在Spring boot中使用mybatis的原理就是生成一个能够解析mybatis文件的bean，并且交给context
 */
public interface AccInfoService {
    boolean create(AccInfo accInfo);
    //查询和删除都使用对象的id
    AccInfo retrieve(Integer accId);
    boolean delete(Integer accId);
    boolean update(AccInfo accInfo);


}
