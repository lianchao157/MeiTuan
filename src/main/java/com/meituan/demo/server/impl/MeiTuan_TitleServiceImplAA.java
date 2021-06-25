package com.meituan.demo.server.impl;

import com.meituan.demo.bean.Meituan_Menum_TitleBean;
import com.meituan.demo.mapper.MeiTuan_mapper;
import com.meituan.demo.server.MeiTuan_TitleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class MeiTuan_TitleServiceImplAA implements MeiTuan_TitleService {
    @Autowired
    private MeiTuan_mapper titlemenummapper;

    @Override
    public List<Meituan_Menum_TitleBean> selectAll() {
        List<Meituan_Menum_TitleBean> listselect = new ArrayList<>();
        listselect = titlemenummapper.selectall();
        return listselect;
    }
}
