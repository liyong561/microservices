package com.example.rpcdemo.entity;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * create by yongli on 2019-06-08 19:57
 */
@Data
public class MapDataFrame {
    public MapDataFrame() {
    }

    public MapDataFrame(Map<String, String> map, List<String> ls) {
        this.map = map;
        this.ls = ls;
    }

    Map<String, String> map;
    List<String> ls;
}
