package com.qfedu.controller;

import com.qfedu.pojo.Suggestion;
import com.qfedu.service.SuggestionService;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lay
 * @data 2019/1/9 20:52
 * @description
 */
@Api(produces = "这是Java编写的接口文档" ,value = "建议文档")
@RestController
@CrossOrigin
public class SuggestionController {

    @Autowired
    private SuggestionService suggestionService;

    @GetMapping("suggestionShowOther.do")
    @ApiOperation(notes = "用户Id",value = "展示其他投诉信息")
    public ResultVo ShowOther(int id){
        return suggestionService.selectNotMy(id);
    }

    @GetMapping("suggestionShowMy.do")
    @ApiOperation(notes = "用户Id",value = "我的历史投诉建议")
    public ResultVo ShowMy(int id){
        return suggestionService.selectById(id);
    }

    @PostMapping("suggestionadd.do")
    @ApiOperation(notes = "(用户Id)和(投诉/建议)和(投诉/建议类型)",value = "建议/投诉提交接口")
    public ResultVo save(Suggestion suggestion){
        return suggestionService.saveSuggestion(suggestion);
    }
}
