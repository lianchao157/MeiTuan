package com.meituan.demo.controller;

import com.meituan.demo.bean.VideoListEntity;
import com.meituan.demo.server.VideoListService;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class VideoListController {
    @Autowired
    private VideoListService videoListService;

    @ApiOperation(value = "获取视频l列表")
    @RequestMapping(path = "/getVideoList", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    @ApiImplicitParams({
    })
    public List<VideoListEntity> getVideoList() {
        List<VideoListEntity> videoListEntityList = videoListService.getVideoList();
        System.out.println("" + videoListEntityList.get(0).getVideolistimageurl());
        return videoListEntityList;
    }

}
