package com.qfedu.dao;

import com.qfedu.pojo.HomeDetail;

public interface HomeDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HomeDetail record);

    int insertSelective(HomeDetail record);

    HomeDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HomeDetail record);

    int updateByPrimaryKey(HomeDetail record);
}