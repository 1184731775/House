package com.qfedu.dao;

import com.qfedu.pojo.goodsDetailColor;

public interface goodsDetailColorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(goodsDetailColor record);

    int insertSelective(goodsDetailColor record);

    goodsDetailColor selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(goodsDetailColor record);

    int updateByPrimaryKey(goodsDetailColor record);
}