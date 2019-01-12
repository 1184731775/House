package com.qfedu.service;

import com.qfedu.pojo.Customer;
import com.qfedu.vo.PageBeanVo;
import com.qfedu.vo.ResultVo;

public interface CustomerService {

    ResultVo addCustomer(Customer customer);

    ResultVo deleteCustomerById(Integer id);

    ResultVo updataCustomer(Customer customer);

    ResultVo selectAllCustomer();

    ResultVo selectCustomerById(Integer id);

    PageBeanVo<Customer> queryCustomerByPage(int page, int limit);

}
