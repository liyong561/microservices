package com.example.msv.form;

import lombok.Data;

/**
 * 前端的实体对象，在对象多了之后，就能感受到@Data带来的便利了
 */
@Data
public class RegistryForm {
    /**
     * 其他字段不需要用户填写。
     * 在这里也可以简单的进行一下表单数据验证，一般后端做更可靠。
     */
    String userName;
    String mobile;
    String password;

}
