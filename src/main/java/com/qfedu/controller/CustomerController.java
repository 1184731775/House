package com.qfedu.controller;


import com.qfedu.pojo.Customer;
import com.qfedu.service.CustomerService;
import com.qfedu.vo.PageBeanVo;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@Api(produces = "这是Java编写的接口文档" ,value = "客户文档")
@RestController
@CrossOrigin
public class CustomerController {

    @Autowired
    private CustomerService service;

    @PostMapping("addCustomer.do")
    @ApiOperation(notes = "客户对象",value = "添加客户")
    public ResultVo addCustomer(Customer customer) {
        return  service.addCustomer(customer);
    }

    @GetMapping("deleteCustomer.do")
    @ApiOperation(notes = "客户id", value = "根据ID删除客户")
    public ResultVo deleteCustomer(int id) {
        return  service.deleteCustomerById(id);
    }

    @PostMapping("updataCustomer.do")
    @ApiOperation(notes = "客户对象", value = "根据ID修改客户信息")
    public ResultVo updataCustomer(Customer customer) {
        return service.updataCustomer(customer);
    }


    @GetMapping("selectAllCusomer.do")
    @ApiOperation(notes = "不需要参数", value = "查询所有客户信息")
    public ResultVo selectAllCustomer() {
        return service.selectAllCustomer();
    }

    @GetMapping("selectCustomerById.do")
    @ApiOperation(notes = "客户ID", value = "根据客户Id查询客户信息")
    public ResultVo selectCustomerById(int id) {
        return  service.selectCustomerById(id);
    }

    @GetMapping("selectBypage.do")
    @ApiOperation(notes = "page当前页码数， 每页多少条数据", value = "客户信息的分页查询")
    public PageBeanVo<Customer> selectByPage(int page, int limit) {
        return service.queryCustomerByPage(page, limit);
    }


}
