package com.meituan.demo.server.impl;

import com.meituan.demo.bean.VideoInfoEntity;
import com.meituan.demo.mapper.Video_Mapper;
import com.meituan.demo.server.VideoInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/***
 * 视频详情页面
 */
@Service
public class VideoInfoImpl implements VideoInfoService {
    @Autowired
    public Video_Mapper videoMapper;

    @Override
    public VideoInfoEntity GetVideo(String videoId) {
        VideoInfoEntity  VideoInfoEntity   =new VideoInfoEntity();
        VideoInfoEntity=  videoMapper.findByUsernametest(videoId);
        return VideoInfoEntity;
    }
}
