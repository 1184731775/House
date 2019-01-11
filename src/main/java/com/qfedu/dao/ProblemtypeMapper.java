package com.qfedu.dao;

import com.qfedu.pojo.Problemtype;

import java.util.List;

public interface ProblemtypeMapper {
    int insert(Problemtype record);

    int insertSelective(Problemtype record);

    List<Problemtype> selectproblem();
}