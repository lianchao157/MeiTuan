package com.meituan.demo.server;

import com.meituan.demo.bean.Meituan_Menum_TitleBean;

import java.util.List;

public interface MenumService {
    /***
     * 查询所有的
     * @return
     */
    List<Meituan_Menum_TitleBean> selectAll();
}
