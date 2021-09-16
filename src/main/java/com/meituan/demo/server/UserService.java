package com.meituan.demo.server;

import com.meituan.demo.bean.MeiTuan_ShopCar_Bean;
import com.meituan.demo.bean.User;

import java.util.List;

public interface UserService {


    public  User findByUsername(User user);
//    public int inserlist(List<MeiTuan_ShopCar_Bean> departments);
}

