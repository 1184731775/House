package com.qfedu.dao;

import com.qfedu.pojo.HomeType;

public interface HomeTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HomeType record);

    int insertSelective(HomeType record);

    HomeType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HomeType record);

    int updateByPrimaryKey(HomeType record);
}