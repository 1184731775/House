package com.qfedu.dao;

import com.qfedu.pojo.Home;

import java.util.List;

public interface HomeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Home record);

    int insertSelective(Home record);

    Home selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Home record);

    int updateByPrimaryKey(Home record);

    List<Home> selectHomeinfoByTypeId(Integer id);
}