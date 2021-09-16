package com.meituan.demo.mapper;

import com.meituan.demo.bean.MeiTuan_ShopCar_Bean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MeiTuan_ShopCarMapepr {
    @Select("select * from shop_car ")
    List<MeiTuan_ShopCar_Bean> selectallshopcar();//  查询所有

    @Select("select * from shop_car where shopcar_id = #{shopcar_id}")
    List<MeiTuan_ShopCar_Bean> selectbyid(@Param("shopcar_id") int shopcar_id);// 查询单个

    boolean Insertshopcar(@Param("shopcar_id") int shopcar_id, @Param("user_carid") int user_carid, @Param("shopcardingdan") String shopcardingdan,
                          @Param("shopcarname") String shopcarname, @Param("shopcarcounts") int shopcarcounts, @Param("shopcarprice") double shopcarprice
            , @Param("shopcarimage") String shopcarimage, @Param("shopcaryuliu") String shopcaryuliu, @Param("shopcar_money") double shopcar_money
            , @Param("shopcaryuliu0") Integer shopcaryuliu0, @Param("column_11") Integer column_11);// 插入数据

    //批量查库
    int insershopcarlist(List<MeiTuan_ShopCar_Bean> list);

    int deleteUserAllById(List<String> deletelist);

    // 批量删除 删除的是 list<String> 的item  list.get(i)
    int deleteMeituanshopcarAll(@Param("list") List<String> list);
}
