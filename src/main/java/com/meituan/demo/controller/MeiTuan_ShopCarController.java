package com.meituan.demo.controller;

import com.google.common.base.Strings;
import com.meituan.demo.bean.MeiTuan_ShopCar_Bean;
import com.meituan.demo.domain.GeneralResult;
import com.meituan.demo.server.MeiTuanShopCarService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/***
 * 购物车返回数据
 * https://www.cnblogs.com/mjbenkyo/p/12067982.html
 */
@RestController
public class MeiTuan_ShopCarController {


    @Autowired(required = true)
    private MeiTuanShopCarService meiTuanShopCarService;//  接口实现类不导入server包 此处报红


    @ApiOperation(value = "获取购物车列表")
    @RequestMapping(value = "/selecshopcar", method = RequestMethod.POST)
    @ResponseBody
    @ApiImplicitParams({
    })
    public GeneralResult selectAll() {
        GeneralResult GeneralResult = new GeneralResult();
        List<MeiTuan_ShopCar_Bean> shopcarlist = new ArrayList<MeiTuan_ShopCar_Bean>();
        shopcarlist = meiTuanShopCarService.shopCar_beanList();
        if (null != shopcarlist) {

            GeneralResult.setMsg("成功");
            GeneralResult.setData(shopcarlist);
            return GeneralResult;
        } else {
            GeneralResult.setMsg("失败");
            GeneralResult.setData(null);
            return GeneralResult;
        }
    }

    @ApiOperation(value = "获取登陆人购物车")
    @RequestMapping(value = "/selectshopcarbyid", method = RequestMethod.POST)
    @ResponseBody
    @ApiImplicitParams({
    })
    public GeneralResult selectshopcarbyid(String shopcar_id) {
        GeneralResult GeneralResult = new GeneralResult();
        List<MeiTuan_ShopCar_Bean> shopcarlist = new ArrayList<MeiTuan_ShopCar_Bean>();
        System.out.println("shopcar_id" + shopcar_id);
        shopcarlist = meiTuanShopCarService.shopCar_beanListbyid(shopcar_id);
        if (null != shopcarlist) {

            GeneralResult.setMsg("成功");
            GeneralResult.setData(shopcarlist);
            return GeneralResult;
        } else {
            GeneralResult.setMsg("失败");
            GeneralResult.setData(null);
            return GeneralResult;
        }
    }


    @ApiOperation(value = "插入数据库信息")
    @RequestMapping(value = "/MeituanInserCarInfo", method = RequestMethod.POST) //  url 坚决不能重复
    @ResponseBody
    @ApiImplicitParams({
            @ApiImplicitParam(name = "shopcar_id", value = "手机号码", dataType = "int", paramType = "query", example = "13802780104", required = true),
            @ApiImplicitParam(name = "user_carid", value = "登录账号", dataType = "int", paramType = "query", example = "lihailin9073", required = true),
            @ApiImplicitParam(name = "shopcardingdan", value = "登录密码", dataType = "string", paramType = "query", example = "123456", required = true),
            @ApiImplicitParam(name = "shopcarname", value = "商品名称", dataType = "string", paramType = "query", example = "3679", required = true),
            @ApiImplicitParam(name = "shopcarcounts", value = "钱数1", dataType = "int", paramType = "query", example = "3679", required = true),
            @ApiImplicitParam(name = "shopcarprice", value = "单价", dataType = "double", paramType = "query", example = "3679", required = true),
            @ApiImplicitParam(name = "shopcarimage", value = "图片", dataType = "string", paramType = "query", example = "3679", required = true),
            @ApiImplicitParam(name = "shopcaryuliu", value = "测试预留", dataType = "int", paramType = "query", example = "3679", required = true),
            @ApiImplicitParam(name = "shopcar_money", value = "钱数", dataType = "double", paramType = "query", example = "3679", required = true),
            @ApiImplicitParam(name = "shopcaryuliu0", value = "测试预留", dataType = "int", paramType = "query", example = "3679", required = true),
            @ApiImplicitParam(name = "column_11", value = "测试预留", dataType = "int", paramType = "query", example = "3679", required = true),


//            ————————————————
//            版权声明：本文为CSDN博主「巅峰键盘侠」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
//            原文链接：https://blog.csdn.net/lihailin9073/article/details/97897376
    })
    public GeneralResult MeituanInserCarInfo(int shopcar_id, int user_carid, String shopcardingdan,
                                             String shopcarname, int shopcarcounts, double shopcarprice
            , String shopcarimage, String shopcaryuliu, double shopcar_money, int shopcaryuliu0, int column_11) {
        GeneralResult GeneralResult = new GeneralResult();
        List<MeiTuan_ShopCar_Bean> shopcarlist = new ArrayList<MeiTuan_ShopCar_Bean>();
        boolean flagreslt = meiTuanShopCarService.insertshopcar(shopcar_id, user_carid
                , shopcardingdan, shopcarname, shopcarcounts, shopcarprice, shopcarimage, shopcaryuliu, shopcar_money, shopcaryuliu0, column_11);
        if (flagreslt) {
            GeneralResult.setMsg("成功");
            GeneralResult.setData(shopcarlist);
            return GeneralResult;
        } else {
            GeneralResult.setMsg("失败");
            GeneralResult.setData(null);
            return GeneralResult;
        }
    }


//    /***
//     * 删除购物车
//     * @param
//     * @return
//     */
//    @ApiOperation(value = "删除购物车通过id")
//    @RequestMapping(value = "/DeleteShopCarById", method = RequestMethod.POST) //  url 坚决不能重复
//    @ResponseBody
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "shopcar_id", value = "商品id", dataType = "int", paramType = "query", example = "13802780104", required = true),
//            @ApiImplicitParam(name = "user_carid", value = "用户id", dataType = "int", paramType = "query", example = "13802780104", required = true),
//    })
//    public GeneralResult DeleteShopCarById(Integer GoodNo, String userid) {
//
//        return null;
//    }

    /***
     *shan
     * @param
     * @return
     */
    public GeneralResult DeleteShopCarById(String GoodsNo, String user_carid) {
        GeneralResult generalResult = new GeneralResult();
        if (!Strings.isNullOrEmpty(GoodsNo)) {
            String[] srcInfomationViedoIdArr = GoodsNo.split(",");
            for (int i = 0; i < srcInfomationViedoIdArr.length; i++) {
                MeiTuan_ShopCar_Bean srcInfomationViedo = new MeiTuan_ShopCar_Bean();
                Long srcInfomationViedoId = Long.valueOf(srcInfomationViedoIdArr[i]);
//                srcInfomationViedo.setSrcInfomationViedoId(srcInfomationViedoId);
//                srcInfomationViedo.setUpdatedBy(userId);
//                srcInfomationViedo.setUpdatedTm(new Date());
//                srcInfomationViedo.setIsDeleted(CmnConstants.IS_DELETED_YES);
//                int num = srcInfomationViedoMapper.updateByPrimaryKeySelective(srcInfomationViedo);
                int num = 0;
                if (num <= 0) {
//                    logger.error(Strings.lenientFormat("【SRC-INFORMATION-MNG-%s】：%s:%s", "batchDeleteSrcInfomationViedo", ErrorCodeMsg.SERVER_ERROR.getMessage(), "批量删除资讯视频错误"));
//                    throw new AttemptException(ErrorCodeMsg.SERVER_ERROR,"批量删除资讯视频错误");
                } else {
                    generalResult.setData("");
                    generalResult.setMsg("返回成功");
                    generalResult.setCode(00);
                }
            }
        }
        return null;
    }

    /****
     * 批量插入   传入多个对象并放入集合
     * @param departments
     * @return
     */

    @ApiOperation(value = "新增多个部门")
    @PostMapping("insertDepartments")
    public GeneralResult newDepartment(@RequestBody List<MeiTuan_ShopCar_Bean> departments) {
        List<MeiTuan_ShopCar_Bean> departments1 = new ArrayList<>();
        departments1=departments;
//        MeiTuan_ShopCar_Bean ms2 = new MeiTuan_ShopCar_Bean();
//        ms2.setColumn_11(33);
//        ms2.setShopcar_id(33);
//        ms2.setUser_carid(33);
//        ms2.setShopcarcounts(33);
//        ms2.setShopcarimage("3");
//        ms2.setShopcardingdan("33");
//        ms2.setShopcarname("33");
//        ms2.setShopcarprice(33.0);
//        ms2.setShopcaryuliu("33");
//        ms2.setShopcaryuliu0("33");
//        ms2.setShopcar_money("33");
//        MeiTuan_ShopCar_Bean ms1 = new MeiTuan_ShopCar_Bean();
//        ms1.setColumn_11(22);
//        ms1.setShopcar_id(22);
//        ms2.setUser_carid(33);
//        ms1.setShopcarcounts(22);
//        ms1.setShopcarimage("22");
//        ms1.setShopcardingdan("22");
//        ms1.setShopcarname("22");
//        ms1.setShopcarprice(22.0);
//        ms1.setShopcaryuliu("22");
//        ms1.setShopcaryuliu0("22");
//        ms1.setShopcar_money("22");
//        departments1.add(ms1);
//        departments1.add(ms2);
        System.out.println("controller" + ":departments1" + departments1.size());
        int result = meiTuanShopCarService.inserlist(departments1);
//        return GeneralResult(result > 0 ? "SUCCESS" : "FAILED");
        System.out.println("controller" + result);
        return null;
    }
//————————————————
//    版权声明：本文为CSDN博主「独钓寒江雪～」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
//    原文链接：https://blog.csdn.net/bdqx_007/article/details/94851913


    @ApiOperation(value = "删除购物车进行批量删除")
    @RequestMapping(value = "/DeleteShopCarall", method = RequestMethod.POST) //  url 坚决不能重复
    @ResponseBody
    @ApiImplicitParams({
            @ApiImplicitParam(name = "shopcar_id", value = "商品id", dataType = "String", paramType = "query", example = "13802780104", required = true),
    })
    public GeneralResult DeleteShopCarall(String shopcar_id) {
        System.out.println("我是结果" + shopcar_id);

//            return userService.deleteUserAllById(idList);

        int scounts = meiTuanShopCarService.deleteUserAllByIdjjjj(shopcar_id);
        if (scounts != 1) {
            return null;
        }
        return null;
    }


}
