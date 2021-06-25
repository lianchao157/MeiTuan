package com.meituan.demo.controller;

import com.meituan.demo.bean.Meituan_Menum_TitleBean;
import com.meituan.demo.domain.GeneralResult;
import com.meituan.demo.server.MenumService;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
git remote add origin https://github.com/lianchaolc/MeiTuanService.git

        git remote add origin git@github.com:alexnest/mmall.git
@RestController
public class MeiTuan_TitleController {
    @Autowired(required = true)
    private MenumService menumService;

    /***
     * 查询所有
     */
    @ApiOperation(value = "获取用户列表")
    @RequestMapping(value = "/selectall", method = RequestMethod.GET)
    @ResponseBody
    @ApiImplicitParams({
    })
    public GeneralResult selectAll() {
        GeneralResult GeneralResult = new GeneralResult();
        List<Meituan_Menum_TitleBean> userlistall = new ArrayList<>();
        userlistall=   menumService.selectAll();
        if (null != userlistall) {

            GeneralResult.setMsg("成功");
            GeneralResult.setData(userlistall);
            return GeneralResult;
        } else {
            GeneralResult.setMsg("失败");
            GeneralResult.setData(null);
            return GeneralResult;
        }
    }
}
