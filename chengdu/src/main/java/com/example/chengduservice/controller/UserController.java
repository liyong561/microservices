package com.example.chengduservice.controller;

import com.example.chengduservice.controller.apiModel.UserIn;
import com.example.chengduservice.entity.User;
import com.example.chengduservice.service.UserService;
import com.example.chengduservice.util.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * create by yongli on 2019-09-22 16:23
 * 增量开发，你发现不合适了，你自然会想办法改进，然后功能就越来越完善
 */

@RestController
@RequestMapping("/user")
@Api(value = "this is doc for user service")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    /**
     * UserController和UserService的bean的关系网。
     * 这个service的访问权限是什么样的呢？
     */
    @Autowired
    UserService userService;

    @PostMapping("/addOne")
    //Required User parameter 'user' is not present，为什么会报这种错？
    public CommonResult add(UserIn userIn) {

        logger.info(userIn.toString());
        // 为什么不报空指针异常呢？
        userService.insert(userIn.toUser());
        return CommonResult.success(true);
    }

    @PostMapping("/addMany")
    // 用reponseBody好
    public CommonResult batchAdd(List<User> users) {
        userService.batchInsert(users);
        return CommonResult.success(true);
    }

    @GetMapping("/{userId}")
    public CommonResult getOne(@PathVariable("userId") String userId) {

        User user = userService.selectUserById(userId);
        if (user != null) {

            logger.info(user.toString());
        }
        return CommonResult.success(user);
    }

    @GetMapping("/getMany")
    @ApiOperation("分页查询")
    public List<User> getMany(@RequestParam("from") Integer from, @RequestParam("limit") Integer limit) {
        return userService.selectUsers(from, limit);
    }


    @GetMapping("getTotal")
    @ApiOperation("获取总的数量")
    public CommonResult getTotal(){
        return CommonResult.success(userService.selectCount());
    }
}
