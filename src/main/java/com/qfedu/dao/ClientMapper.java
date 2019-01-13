package com.qfedu.dao;

import com.qfedu.pojo.Client;

import java.util.List;

public interface ClientMapper {
    int insert(Client record);

    int insertSelective(Client record);

    List<Client> selectByName(String name);
}