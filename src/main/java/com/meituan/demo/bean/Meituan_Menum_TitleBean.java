package com.meituan.demo.bean;

import org.springframework.stereotype.Service;

import java.io.Serializable;

public class Meituan_Menum_TitleBean implements Serializable {

    public Meituan_Menum_TitleBean(String id, String meiTuan_Name, String meiTuan_ImageruUrl) {
        this.id = id;
        MeiTuan_Name = meiTuan_Name;
        MeiTuan_ImageruUrl = meiTuan_ImageruUrl;
    }

    public Meituan_Menum_TitleBean() {
    }

    private  String id;
    private  String MeiTuan_Name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMeiTuan_Name() {
        return MeiTuan_Name;
    }

    public void setMeiTuan_Name(String meiTuan_Name) {
        MeiTuan_Name = meiTuan_Name;
    }

    public String getMeiTuan_ImageruUrl() {
        return MeiTuan_ImageruUrl;
    }

    public void setMeiTuan_ImageruUrl(String meiTuan_ImageruUrl) {
        MeiTuan_ImageruUrl = meiTuan_ImageruUrl;
    }

    private  String MeiTuan_ImageruUrl;
}
