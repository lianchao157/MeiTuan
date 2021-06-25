package com.meituan.demo.server.impl;

import com.meituan.demo.bean.Meituan_Menum_TitleBean;
import com.meituan.demo.mapper.MeiTuan_mapper;
import com.meituan.demo.server.MenumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MeNumServiceImpl implements MenumService {
    @Autowired
    private MeiTuan_mapper titlemenummapper;

    @Override
    public List<Meituan_Menum_TitleBean> selectAll() {
        List<Meituan_Menum_TitleBean> listselect = new ArrayList<>();
        listselect = titlemenummapper.selectall();
        return listselect;
    }
}
