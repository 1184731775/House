package com.qfedu.dao;

import com.qfedu.pojo.Address;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AddressMapper {
    //删除方法
    int deleteByPrimaryKey(Integer id);

    int insert(Address record);

    //添加方法
    int insertSelective(Address record);

    Address selectByPrimaryKey(Integer id);

    //修改方法
    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);

    @Select("select * from t_address")
    @ResultType(Address.class)
    List<Address> select(Integer userId);
}