package com.meituan.demo.mapper;

import com.meituan.demo.bean.Meituan_Menum_TitleBean;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MeiTuan_mapper {

    @Select("select * from meituan_menumtop")
    List<Meituan_Menum_TitleBean> selectall();//  查询所有
}
