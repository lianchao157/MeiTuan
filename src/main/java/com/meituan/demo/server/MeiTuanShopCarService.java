package com.meituan.demo.server;

import com.meituan.demo.bean.MeiTuan_ShopCar_Bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface MeiTuanShopCarService {
    //    查询购物车
    public List<MeiTuan_ShopCar_Bean> shopCar_beanList();
    //    查询购物车单个id
    public List<MeiTuan_ShopCar_Bean> shopCar_beanListbyid(String userid);

    //     插入购物车  这里插入的数据应为集合
    boolean insertshopcar(int shopcar_id, int user_carid, String shopcardingdan,
                          String shopcarname, int shopcarcounts, double shopcarprice
            , String shopcarimage, String shopcaryuliu, double shopcar_money, int shopcaryuliu0, int column_11);

    //批量插入数据
    public int inserlist(List<MeiTuan_ShopCar_Bean> departments);





    /**
     * 根据id删除
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 根据id实现批量删除
     * @param maps
     * @return
     */
    int deleteUserAllById(Map<String,List<String>> maps);

    /**
     * 添加用户
     * @param userBo
     * @return
     */
//    int insert(UserBo userBo);

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
//    UserPo selectByPrimaryKey(Integer id);

    /**
     * 根据id修改用户
     * @param id
     * @return
     */
    int updateByPrimaryKey(Integer id);

//    int updateByPrimaryKeySelective(UserPo userPo);

    /**
     * 批量添加用户
     * @param userListPo
     * @return
     */
    int insertUserListPo(ArrayList<MeiTuan_ShopCar_Bean> userListPo);

    int deleteUserAllByIdjjjj(String s);
}
