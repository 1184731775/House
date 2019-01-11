package com.qfedu.controller;

import com.qfedu.service.ProblemtypeService;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: lay
 * @Date: 2019/1/10 19:57
 * @Description:
 */
@Api(produces = "这是Java编写的接口文档" ,value = "接口文档")
@RestController
@CrossOrigin
public class ProblemtypeController {

    @Autowired
    private ProblemtypeService problemtypeService;

    @ApiOperation(notes = "无需参数",value = "客服咨询之常用问题接口")
    @GetMapping("showproblem.do")
    public ResultVo show(){
        return problemtypeService.show();
    }
}
