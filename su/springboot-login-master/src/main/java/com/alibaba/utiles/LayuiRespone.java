package com.alibaba.utiles;

public class LayuiRespone {
    private int code;
    private String msg;
    private Object data;
    private Long count;

    public LayuiRespone(){

    }

    public LayuiRespone(int code, String msg, Object data, Long count) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.count = count;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public LayuiRespone(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public LayuiRespone(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

