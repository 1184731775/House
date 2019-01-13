package com.qfedu.controller;

import com.qfedu.pojo.Client;
import com.qfedu.pojo.Clienthouse;
import com.qfedu.service.BuyhouseService;
import com.qfedu.service.ClientService;
import com.qfedu.service.ClienthouseService;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: lay
 * @Date: 2019/1/11 20:49
 * @Description:
 */
@Api(produces = "这是Java编写的接口文档" ,value = "接口文档")
@RestController
@CrossOrigin
public class ClientController {
    @Autowired
    private ClientService clientService ;

    @Autowired
    private BuyhouseService buyhouseService;

    @Autowired
    private ClienthouseService clienthouseService;

    @ApiOperation(notes = "性别和购房意向用int表示",value = "买卖之海外房产之新增客户接口")
    @GetMapping("saveClient.do")
    public ResultVo saveClient(Client client){
        return clientService.save(client);
    }

    @ApiOperation(notes = "",value = "买卖之海外房产之快速报备之楼盘报备接口")
    @GetMapping("showbuyhouse.do")
    public ResultVo showbuyhouse(){
        return buyhouseService.showNameAndId();
    }



    @ApiOperation(notes = "返回值是客户列表 ",value = "买卖之海外房产之快速报备客户列表添加接口")
    @GetMapping("showclient.do")
    public ResultVo showclient(){
        return clientService.showList();
    }

    @ApiOperation(notes = "必填( clientid：客户id,houseid：楼盘ID) ",value = "买卖之海外房产之快速报备之报备接口")
    @GetMapping("clientadd.do")
    public ResultVo clientadd(Clienthouse clienthouse){
        return clienthouseService.add(clienthouse);
    }

}
