package com.qfedu.service;

import com.qfedu.pojo.Orders;
import com.qfedu.vo.PageBeanVo;
import com.qfedu.vo.ResultVo;

public interface OrdersService {

    PageBeanVo<Orders> selectOrders(Integer userId,Integer page,Integer size);

    ResultVo addOrder(Orders orders);

    ResultVo deleteOrder(Integer id);
}
