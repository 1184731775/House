package com.qfedu.dao;

import com.qfedu.pojo.Goodscar;

public interface GoodscarMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Goodscar record);

    int insertSelective(Goodscar record);

    Goodscar selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goodscar record);

    int updateByPrimaryKey(Goodscar record);
}