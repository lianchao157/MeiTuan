package com.meituan.demo.controller;

import com.meituan.demo.bean.VideoListEntity;
import com.meituan.demo.domain.GeneralResult;
import com.meituan.demo.domain.PatrolplaceListQuery;
import com.meituan.demo.domain.Result;
import com.meituan.demo.domain.bo.PageBO;
import com.meituan.demo.server.VideoListService;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VideoListController {
    @Autowired
    private VideoListService videoListService;

    @ApiOperation(value = "获取视频l列表")
    @RequestMapping(path = "/getVideoList", method = RequestMethod.GET)
    @ResponseBody
    @ApiImplicitParams({
    })
    public Result getVideoList(PatrolplaceListQuery patrolplaceListQuery) {

        GeneralResult generalResult = new GeneralResult();
        PageBO<VideoListEntity> systemUserList = videoListService.getVideoList(patrolplaceListQuery);
        generalResult.setData(systemUserList);
        generalResult.setCode(00);
        return generalResult;
//        List<VideoListEntity> videoListEntityList = videoListService.getVideoList();
//        System.out.println("" + videoListEntityList.get(0).getVideolistimageurl());
//        return videoListEntityList;
    }

}
