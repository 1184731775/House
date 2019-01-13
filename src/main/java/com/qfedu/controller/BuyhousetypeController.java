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
 * @Date: 2019/1/11 16:13
 * @Description:
 */
@Api(produces = "这是Java编写的接口文档" ,value = "接口文档")
@RestController
@CrossOrigin
public class BuyhousetypeController {

    @Autowired
    private BuyhouseService buyhouseService;


    @ApiOperation(notes = "",value = "国内房产和海外房产首页接口")
    @GetMapping("buyhouseshow.do")
    public ResultVo showall(int id){
        return buyhouseService.showAllin(id);
    }

}
