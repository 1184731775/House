package com.qfedu.controller;


import com.qfedu.pojo.User;
import com.qfedu.service.UserService;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
@Api(produces = "这是Java编写的接口文档" ,value = "接口文档")
@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 登录
     * @param user
     * @return
     */
    @ApiOperation(notes = "name/email/phone中的一个键和值和密码键值对",tags = "登录",value = "用户登录接口")
    @PostMapping("login.do")
    public ResultVo login(@ApiParam(value = "name/email/phone中的一个") User user){
        return userService.login(user);
    }

    /**
     * 注册
     * @param user
     * @return
     */
    @ApiOperation(notes = "name/email/phone中的一个键和值和密码键值对",tags = "注册",value = "用户注册接口")
    @PostMapping("save.do")
    public ResultVo save(User user){
        return userService.save(user);
    }

    /**
     * 修改密码
     */
    @ApiOperation(notes = "phone和密码",tags = "找回密码",value = "用户找回密码接口")
    @PostMapping("updatePassword.do")
    public ResultVo update(User user){
        return userService.update(user);
    }

}
