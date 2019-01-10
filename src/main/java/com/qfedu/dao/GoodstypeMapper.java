package com.qfedu.dao;

import com.qfedu.pojo.Goodstype;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.lang.reflect.Type;
import java.util.List;

public interface GoodstypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Goodstype record);

    int insertSelective(Goodstype record);

    Goodstype selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goodstype record);

    int updateByPrimaryKey(Goodstype record);

    @Select("select * from t_goodstype")
    @ResultType(Type.class)
    List<Goodstype>  selectAll();
}