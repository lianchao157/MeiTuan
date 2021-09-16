package com.meituan.demo.mapper;

import com.meituan.demo.bean.VideoInfoEntity;
import com.meituan.demo.bean.VideoListEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Video_List_Mapper {
    @Select("select * from video_list")
    List<VideoListEntity> findByUsernametest();//  查询所有

}
