package com.qfedu.dao;

import com.qfedu.pojo.Customer;

import java.util.List;
import java.util.Map;

public interface CustomerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

    int addCustomer(Customer customer);

    List<Customer> selectAllCustomer();

    List<Customer> selectByPage(Map<String, Object>param);

    int selectCount();
}