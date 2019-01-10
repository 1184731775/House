package com.qfedu.dao;

import com.qfedu.pojo.GoodsDetailColor;

public interface GoodsDetailColorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsDetailColor record);

    int insertSelective(GoodsDetailColor record);

    GoodsDetailColor selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsDetailColor record);

    int updateByPrimaryKey(GoodsDetailColor record);
}