package com.meituan.demo.bean;

import org.springframework.stereotype.Service;

import java.io.Serializable;

public class Meituan_Menum_TitleBean implements Serializable {


    public String getMenumtitile() {
        return menumtitile;
    }

    public void setMenumtitile(String menumtitile) {
        this.menumtitile = menumtitile;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMenumimage() {
        return menumimage;
    }

    public void setMenumimage(String menumimage) {
        this.menumimage = menumimage;
    }

    public Meituan_Menum_TitleBean(String menumtitile, String id, String menumimage) {
        this.menumtitile = menumtitile;
        this.id = id;

        this.menumimage = menumimage;
    }

    public Meituan_Menum_TitleBean() {
    }

    private  String menumtitile;
    private  String id;
    private  String menumimage;
}
