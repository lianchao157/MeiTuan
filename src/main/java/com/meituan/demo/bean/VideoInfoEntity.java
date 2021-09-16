package com.meituan.demo.bean;

import java.io.Serializable;

/***
 * 实体类
 */
public class VideoInfoEntity implements Serializable {

    public VideoInfoEntity() {
    }

    public String getVideoNo() {
        return videoNo;
    }

    @Override
    public String toString() {
        return "VideoInfoEntity{" +
                "videoNo='" + videoNo + '\'' +
                ", VideoId='" + VideoId + '\'' +
                ", VideOName='" + VideOName + '\'' +
                ", VideoURl='" + VideoURl + '\'' +
                ", Videoinfo='" + Videoinfo + '\'' +
                ", Videotest='" + Videotest + '\'' +
                '}';
    }

    public VideoInfoEntity(String videoNo, String videoId, String videOName, String videoURl, String videoinfo, String videotest) {
        this.videoNo = videoNo;
        VideoId = videoId;
        VideOName = videOName;
        VideoURl = videoURl;
        Videoinfo = videoinfo;
        Videotest = videotest;
    }

    public void setVideoNo(String videoNo) {
        this.videoNo = videoNo;
    }

    public String getVideoId() {
        return VideoId;
    }

    public void setVideoId(String videoId) {
        VideoId = videoId;
    }

    public String getVideOName() {
        return VideOName;
    }

    public void setVideOName(String videOName) {
        VideOName = videOName;
    }

    public String getVideoURl() {
        return VideoURl;
    }

    public void setVideoURl(String videoURl) {
        VideoURl = videoURl;
    }

    public String getVideoinfo() {
        return Videoinfo;
    }

    public void setVideoinfo(String videoinfo) {
        Videoinfo = videoinfo;
    }

    public String getVideotest() {
        return Videotest;
    }

    public void setVideotest(String videotest) {
        Videotest = videotest;
    }

    private String videoNo;
    private String VideoId;
    private String VideOName;
    private String VideoURl;
    private String Videoinfo;
    private String Videotest;
}
