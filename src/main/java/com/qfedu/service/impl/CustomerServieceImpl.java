package com.qfedu.service.impl;

import com.qfedu.dao.CustomerMapper;
import com.qfedu.pojo.Customer;
import com.qfedu.service.CustomerService;
import com.qfedu.vo.PageBeanVo;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;


@Service
public class CustomerServieceImpl implements CustomerService {

    @Autowired
    private CustomerMapper dao;

    @Override
    public ResultVo addCustomer(Customer customer) {
        if (dao.addCustomer(customer) > 0) {
            return ResultVo.setOK(customer);
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo deleteCustomerById(Integer id) {
        if (dao.deleteByPrimaryKey(id) > 0) {
            return  ResultVo.setOK(null);
        }

        return ResultVo.setERROR();
    }

    @Override
    public ResultVo updataCustomer(Customer customer) {
        if (dao.updateByPrimaryKeySelective(customer) > 0){
            return ResultVo.setOK(customer);
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo selectAllCustomer() {
        List<Customer> list = dao.selectAllCustomer();
        if (list != null) {
            return ResultVo.setOK(list);
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo selectCustomerById(Integer id) {
       if (dao.deleteByPrimaryKey(id) > 0) {
           return ResultVo.setOK(null);
       }
       return  ResultVo.setERROR();
    }

    @Override
    public PageBeanVo<Customer> queryCustomerByPage(int page, int limit) {
        HashMap<String, Object> map = new HashMap();
        map.put("index",(page-1)*limit);
        map.put("limit", limit);
        return PageBeanVo.setPage(dao.selectCount(),dao.selectByPage(map));
    }
}
