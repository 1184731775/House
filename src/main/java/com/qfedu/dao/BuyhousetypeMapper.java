package com.qfedu.dao;

import com.qfedu.pojo.Buyhousetype;

public interface BuyhousetypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Buyhousetype record);

    int insertSelective(Buyhousetype record);

    Buyhousetype selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Buyhousetype record);

    int updateByPrimaryKey(Buyhousetype record);

//    Buyhousetype selectAllById(Integer id);


}