package com.qfedu.service;

import com.qfedu.vo.ResultVo;

/**
 * @Auther: lay
 * @Date: 2019/1/11 16:33
 * @Description:
 */
public interface BuyhouseService {

    ResultVo showByname(String name);

    ResultVo showByPrice(int price1,int price2);

    ResultVo showByArea(int area1,int area2);

    ResultVo showByCity(String city);

    ResultVo showAll(int hid);

    ResultVo showNameAndId();

    ResultVo showrecommend();

    ResultVo showAllin(int id);

}
