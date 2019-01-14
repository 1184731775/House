package com.qfedu.controller;

import com.qfedu.pojo.Orders;
import com.qfedu.service.GoodsCarService;
import com.qfedu.service.OrdersService;
import com.qfedu.vo.PageBeanVo;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class OrdersController {
    @Autowired
    private OrdersService ordersService;
    @Autowired
    private GoodsCarService goodsCarService;

    @ApiOperation(notes = "展示所有订单,可用于多个状态",value = "订单展示接口")
    @GetMapping("ordersall.do")
    public PageBeanVo<Orders> select(Integer userId, Integer page, Integer size){
        return ordersService.selectOrders(userId,page,size);
    }

    @ApiOperation(notes = "删除订单，一次只能删一个",value = "删除订单接口")
    @GetMapping("deleteOrders.do")
    public ResultVo delete(Integer id){
        return ordersService.deleteOrder(id);
    }


}
