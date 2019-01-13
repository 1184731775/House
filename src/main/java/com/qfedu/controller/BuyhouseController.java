package com.qfedu.controller;

import com.qfedu.service.BuyhouseService;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: lay
 * @Date: 2019/1/11 16:47
 * @Description:
 */
@Api(produces = "这是Java编写的接口文档" ,value = "接口文档")
@RestController
@CrossOrigin
public class BuyhouseController {

    @Autowired
    private BuyhouseService buyhouseService;

    @ApiOperation(notes = "",value = "买卖首页推荐楼盘接口")
    @GetMapping("showBuyHouseRecommend.do")
    public ResultVo showrecommend(){
        return buyhouseService.showrecommend();
    }


    @ApiOperation(notes = "name为楼盘名字,返回count是楼盘数量",value = "国内房产和海外房产首页楼盘名字查询接口")
    @GetMapping("showBuyHouseByName.do")
    public ResultVo showByName(String name){
        return buyhouseService.showByname(name);
    }

    @ApiOperation(notes = "price1是价格区间最低价，price2价格区间最高价，返回count是楼盘数量",value = "国内房产和海外房产根据单价查询接口")
    @GetMapping("showBuyHouseByPrice.do")
    public ResultVo showByPrice(int price1, int price2){
        return buyhouseService.showByPrice(price1,price2);
    }

    @ApiOperation(notes = "房间面积区间最低和最高：area1，area2，返回count是楼盘数量",value = "国内房产和海外房产根据面积查询接口")
    @GetMapping("showBuyHouseByArea.do")
    public ResultVo showByArea(int area1, int area2){
        return buyhouseService.showByArea(area1,area2);
    }

    @ApiOperation(notes = "city是区域值，返回count是楼盘数量",value = "国内房产和海外房产根据区域查询接口")
    @GetMapping("showBuyHouseByCity.do")
    public ResultVo showByCity(String city){
        return buyhouseService.showByCity(city);
    }

    @ApiOperation(notes = "hid是房源的id",value = "国内房产和海外房产房源详情接口")
    @GetMapping("showBuyHouseAll.do")
    public ResultVo showAll(int hid){
        return buyhouseService.showAll(hid);
    }

}
