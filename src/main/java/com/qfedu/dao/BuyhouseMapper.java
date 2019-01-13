package com.qfedu.dao;

import com.qfedu.pojo.Buyhouse;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BuyhouseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Buyhouse record);

    int insertSelective(Buyhouse record);

    Buyhouse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Buyhouse record);

    int updateByPrimaryKey(Buyhouse record);

    List<Buyhouse> selectByName(String name);

    int selectCountByName(String name);

    int selectBytypeId(int id);

    List<Buyhouse> selectByPrice(@Param("price1")Integer price1,@Param("price2")Integer price2);

    List<Buyhouse> selectByArea(Map<String,Object>map);

    List<Buyhouse> selectByCity(String city);

    Buyhouse selectAll(int hid);

    List<Buyhouse> selectById();

    List<Buyhouse> selectqwe();

    List<Buyhouse> selectAllId(int id);


}