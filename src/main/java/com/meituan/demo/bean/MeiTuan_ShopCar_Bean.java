package com.meituan.demo.bean;

import java.io.Serializable;

/***
 * 购物车
 */
public class MeiTuan_ShopCar_Bean implements Serializable {
    public MeiTuan_ShopCar_Bean(String shopcar_id, String user_carid, String shopcardingdan, String shopcarname, int shopcarcounts, Double shopcarprice, String shopcarimage, String shopcaryuliu, String shopcar_money, String shopcaryuliu0) {
        this.shopcardingdan = shopcardingdan;
        this.shopcarname = shopcarname;
        this.shopcarcounts = shopcarcounts;
        this.shopcarprice = shopcarprice;
        this.shopcarimage = shopcarimage;
        this.shopcaryuliu = shopcaryuliu;
        this.shopcar_money = shopcar_money;
        this.shopcaryuliu0 = shopcaryuliu0;
    }


    public String getShopcardingdan() {
        return shopcardingdan;
    }

    public void setShopcardingdan(String shopcardingdan) {
        this.shopcardingdan = shopcardingdan;
    }

    public String getShopcarname() {
        return shopcarname;
    }

    public void setShopcarname(String shopcarname) {
        this.shopcarname = shopcarname;
    }

    public int getShopcarcounts() {
        return shopcarcounts;
    }

    public void setShopcarcounts(int shopcarcounts) {
        this.shopcarcounts = shopcarcounts;
    }

    public Double getShopcarprice() {
        return shopcarprice;
    }

    public void setShopcarprice(Double shopcarprice) {
        this.shopcarprice = shopcarprice;
    }

    public String getShopcarimage() {
        return shopcarimage;
    }

    public void setShopcarimage(String shopcarimage) {
        this.shopcarimage = shopcarimage;
    }

    public String getShopcaryuliu() {
        return shopcaryuliu;
    }

    public void setShopcaryuliu(String shopcaryuliu) {
        this.shopcaryuliu = shopcaryuliu;
    }

    public String getShopcar_money() {
        return shopcar_money;
    }

    public void setShopcar_money(String shopcar_money) {
        this.shopcar_money = shopcar_money;
    }

    public String getShopcaryuliu0() {
        return shopcaryuliu0;
    }

    public void setShopcaryuliu0(String shopcaryuliu0) {
        this.shopcaryuliu0 = shopcaryuliu0;
    }

    public Integer getShopcar_id() {
        return shopcar_id;
    }

    public void setShopcar_id(Integer shopcar_id) {
        this.shopcar_id = shopcar_id;
    }

    public Integer getUser_carid() {
        return user_carid;
    }

    public void setUser_carid(Integer user_carid) {
        this.user_carid = user_carid;
    }

    public Integer getColumn_11() {
        return column_11;
    }

    public void setColumn_11(Integer column_11) {
        this.column_11 = column_11;
    }

    public MeiTuan_ShopCar_Bean() {
    }

    public MeiTuan_ShopCar_Bean(Integer shopcar_id, Integer user_carid, Integer column_11, String shopcardingdan, String shopcarname, int shopcarcounts, Double shopcarprice, String shopcarimage, String shopcaryuliu, String shopcar_money, String shopcaryuliu0) {
        this.shopcar_id = shopcar_id;
        this.user_carid = user_carid;
        this.column_11 = column_11;
        this.shopcardingdan = shopcardingdan;
        this.shopcarname = shopcarname;
        this.shopcarcounts = shopcarcounts;
        this.shopcarprice = shopcarprice;
        this.shopcarimage = shopcarimage;

        this.shopcaryuliu = shopcaryuliu;
        this.shopcar_money = shopcar_money;
        this.shopcaryuliu0 = shopcaryuliu0;
    }

    private Integer shopcar_id;
    private Integer user_carid;
    private Integer column_11;
    private String shopcardingdan;
    private String shopcarname;
    private int shopcarcounts;//商品几件
    private Double shopcarprice; //  商品 价格
    private String shopcarimage;//商品 图片
    private String shopcaryuliu;
    private String shopcar_money;
    private String shopcaryuliu0;//

}
