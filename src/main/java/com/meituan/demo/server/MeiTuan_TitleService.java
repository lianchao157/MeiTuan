package com.meituan.demo.server;

import com.meituan.demo.bean.Meituan_Menum_TitleBean;

import java.util.List;

public interface MeiTuan_TitleService {
    List<Meituan_Menum_TitleBean> selectAll();
}
