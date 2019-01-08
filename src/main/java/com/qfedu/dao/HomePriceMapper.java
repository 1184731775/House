package com.qfedu.dao;

import com.qfedu.pojo.HomePrice;

public interface HomePriceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HomePrice record);

    int insertSelective(HomePrice record);

    HomePrice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HomePrice record);

    int updateByPrimaryKey(HomePrice record);
}