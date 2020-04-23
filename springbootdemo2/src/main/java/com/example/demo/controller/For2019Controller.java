package com.example.demo.controller;

import com.example.demo.util.JsonString;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * 在spring中不启动server和browser测试。
 */
@Controller
public class For2019Controller {

    @RequestMapping("2019/home")
    public String home(){
        // 返回的视图和请求视图一样。
        return "2019/home";

    }
    @PostMapping(value = "2019/upload")
    @ResponseBody
    public String upload(@RequestParam("f1") MultipartFile file)
    {
        String name = file.getOriginalFilename(); //去掉文件的路径，换成工程下面的文件。
        // 这个路径还是要注意
        String path ="";
        try{
            File temp =new File(path);
            File file1= new File(temp.getCanonicalPath()+"/"+name);
            file.transferTo(file1);
            System.out.println(file1.getCanonicalPath());
        }catch (IOException e){
            return JsonString.getJsonString(0,"上传文件失败"); //
        }
        return JsonString.getJsonString(1,"上传文件成功");
        // 关键在这里file对象自带一些有用的方法，spring都为我们准备好了。

    }
    @GetMapping("2019/upload")
    // 用户先发出一个请求
    public String upload(){
        return "2019/uploadFile";
    }
}
