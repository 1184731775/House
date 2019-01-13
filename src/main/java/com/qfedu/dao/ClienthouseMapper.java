package com.qfedu.dao;

import com.qfedu.pojo.Clienthouse;

public interface ClienthouseMapper {
    int insert(Clienthouse record);

    int insertSelective(Clienthouse record);
}