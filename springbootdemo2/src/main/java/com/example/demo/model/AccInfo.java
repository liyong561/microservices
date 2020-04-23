package com.example.demo.model;

public class AccInfo {
    Integer id;
    Integer acc_id;
    String start;
    String introDuction;

    public AccInfo() {
    }

    public AccInfo(Integer id, Integer acc_id, String start, String introDuction, String policy) {
        this.id = id;
        this.acc_id = acc_id;
        this.start = start;
        this.introDuction = introDuction;
        this.policy = policy;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAcc_id() {
        return acc_id;
    }

    public void setAcc_id(Integer acc_id) {
        this.acc_id = acc_id;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getIntroDuction() {
        return introDuction;
    }

    public void setIntroDuction(String introDuction) {
        this.introDuction = introDuction;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    String policy;
}
