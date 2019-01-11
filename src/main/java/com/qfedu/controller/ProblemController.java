package com.qfedu.controller;

import com.qfedu.service.ProblemService;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: lay
 * @Date: 2019/1/10 20:55
 * @Description:
 */
@Api(produces = "这是Java编写的接口文档" ,value = "接口文档")
@RestController
@CrossOrigin
public class ProblemController {
    @Autowired
    private ProblemService problemService;

    @ApiOperation(notes = "无需参数",value = "客服服务之猜你想问问题接口")
    @GetMapping("showProblem.do")
    public ResultVo showProblem(){
        return problemService.selectByNotMark();
    }

    @ApiOperation(notes = "数字参数",value = "客服服务之数字接口")
    @GetMapping("showAnswer.do")
    public ResultVo showAnswer(int mark){
        return problemService.selectByMark(mark);
    }



}
