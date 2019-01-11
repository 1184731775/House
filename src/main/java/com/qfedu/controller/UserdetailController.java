package com.qfedu.controller;

import com.qfedu.pojo.Userdetail;
import com.qfedu.service.UserdetailService;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lay
 * @data 2019/1/9 16:42
 * @description
 */
@Api(produces = "这是Java编写的接口文档" ,value = "接口文档")
@RestController
@CrossOrigin
public class UserdetailController {

    @Autowired
    private UserdetailService userdetailService;

    @PostMapping("userdetailupdate.do")
    @ApiOperation(notes = "传入的值为'id=用户Id'和'要修改的内容的键值对'",value = "个人设置接口")
    public ResultVo update(Userdetail userdetail){
        return userdetailService.update(userdetail);
    }
}
