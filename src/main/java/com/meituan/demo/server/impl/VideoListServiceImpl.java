package com.meituan.demo.server.impl;

import com.meituan.demo.bean.VideoListEntity;
import com.meituan.demo.mapper.Video_List_Mapper;
import com.meituan.demo.server.VideoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class VideoListServiceImpl implements VideoListService {
    @Autowired
    private Video_List_Mapper vlm;
    @Override
    public List<VideoListEntity> getVideoList() {
        List<VideoListEntity>   result=   vlm.findByUsernametest();
        return result;
    }
}
