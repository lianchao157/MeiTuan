package com.meituan.demo.server.impl;

import com.meituan.demo.bean.VideoInfoEntity;
import com.meituan.demo.mapper.Video_Mapper;
import com.meituan.demo.server.VideoInfoService;
import jdk.nashorn.internal.runtime.regexp.JoniRegExp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/***
 * 视频详情页面
 * ————————————————
 版权声明：本文为CSDN博主「MonkeyKing-Sun」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 原文链接：https://blog.csdn.net/sunhuansheng/article/details/83376250 private Logger=JoniRegExp.Factory

 */
@Service
public class VideoInfoImpl implements VideoInfoService {
    Logger logger = LoggerFactory.getLogger(VideoInfoImpl.class);
    @Autowired
    public Video_Mapper videoMapper;

    @Override
    public VideoInfoEntity GetVideo(String videoId) {
        logger.info("videoId=" + videoId);
        VideoInfoEntity VideoInfoEntity = new VideoInfoEntity();
        if (videoId == null || videoId.equals("")) {
            logger.info("参数空" + videoId);
            return null;
        } else {
            VideoInfoEntity = videoMapper.findByUsernametest(videoId);
            if (VideoInfoEntity == null || VideoInfoEntity.equals("")) {
                logger.info("查询结果空" + videoId);
                return null;
            } else {
                logger.info("返回数据" );
                logger.info("VideoInfoEntity=" + VideoInfoEntity.getVideoId());
                return VideoInfoEntity;
            }


        }
    }
}
