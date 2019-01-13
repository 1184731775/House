package com.qfedu.controller;

import com.qfedu.service.HomeService;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Api(produces = "这是Java编写的接口文档" ,value = "租房信息界面接口文档")
@RestController
@CrossOrigin
public class HomeController {
    @Autowired
    private HomeService service;

    @GetMapping("selectHomeInfoByTypeId.do")
    @ApiOperation(notes = "传入租房类型id，例如合租的id为1，整租的id为2 豪宅的id为3",value = "展示相关分类房型信息对象")
    public ResultVo selecetHomeInfoByTypeId(int id){
       return service.selectHomeByTypeId(id);
    }

}
