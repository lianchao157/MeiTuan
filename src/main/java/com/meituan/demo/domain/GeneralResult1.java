package com.meituan.demo.domain;

import com.alibaba.fastjson.JSON;

/**
 * 一般的响应结果封装
 */
public class    GeneralResult1 implements Result{
    private int code;
    private String msg;
    private String data;

    public GeneralResult1 setCode(ResultCode resultCode) {
        this.code = resultCode.code;
        return this;
    }

    public int getCode() {
        return code;
    }

    public GeneralResult1 setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public GeneralResult1 setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getData() {
        return data;
    }

    public GeneralResult1 setData( String data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {

        return JSON.toJSONString(this);
    }
}
