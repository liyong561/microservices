package com.example.msv.service;


import com.alibaba.fastjson.JSONObject;
import com.example.msv.entity.Airplane;
import org.springframework.stereotype.Service;

@Service
public class JsonObjectService {
    Airplane airplane = new Airplane(null,128.43f,45.903f,"red",4,240.94f);
    public Airplane getAirplane(){
        return airplane;

    }
    public String getAirplaneJsonObject(){
        /**
         * JsonObject就可以转型为相应的类型了。
         */
        return JSONObject.toJSONString(airplane);
    }

}
