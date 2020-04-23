package com.example.chengduservice.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * create by yongli on 2020-02-28 22:38
 * 虚拟几个微服务，增加复杂度
 */


public class DpeServiceClient {

    private static final Logger logger = LoggerFactory.getLogger(DpeServiceClient.class);
    private static final String dpeUrl = "http://128.232.23.23:8080/dpe_service";


    public static String getBoardName(String boardId) {
        String url = dpeUrl + "/board?boradId=" + boardId;
        String ret = RestClient.get(url);
        JSONObject retJson = JSON.parseObject(ret);
        if (retJson == null) {
            return null;
        }
        if (retJson.getString("status").equals("success")) {
            return retJson.getString("result");
        } else {
            logger.error("the request for board name is wrong, url:{},response:{}", url, ret);
            return null;
        }
    }


}
