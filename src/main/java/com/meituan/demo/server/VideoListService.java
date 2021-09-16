package com.meituan.demo.server;

import com.meituan.demo.bean.VideoListEntity;

import java.util.List;

public interface VideoListService {
    // 获取列表
    List<VideoListEntity> getVideoList();
}
