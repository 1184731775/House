package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.OrdersMapper;
import com.qfedu.pojo.Orders;
import com.qfedu.service.OrdersService;
import com.qfedu.vo.OrdersVo;
import com.qfedu.vo.PageBeanVo;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    private OrdersMapper ordersDao;
    @Override
    public PageBeanVo<Orders> selectOrders(Integer userId, Integer page, Integer size) {
        Page<Object> startPage = PageHelper.startPage(page,size);
        List<OrdersVo> list =ordersDao.selectAll(userId);

        Integer count = Integer.parseInt(String.valueOf(startPage.getTotal()));
        return PageBeanVo.setPage(count, list);
    }

    @Override
    public ResultVo addOrder(Orders orders) {
        if (ordersDao.insertSelective(orders)>0){
            return ResultVo.setOK(orders);
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo deleteOrder(Integer id) {
        if (ordersDao.deleteByPrimaryKey(id)>0){
            return  ResultVo.setOK(null);
        }
        return ResultVo.setERROR();
    }
}
