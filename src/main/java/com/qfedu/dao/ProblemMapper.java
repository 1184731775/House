package com.qfedu.dao;

import com.qfedu.pojo.Problem;

import java.util.List;

public interface ProblemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Problem record);

    int insertSelective(Problem record);

    Problem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Problem record);

    int updateByPrimaryKey(Problem record);

    List<Problem> selectByNotMark();

    Problem selectByMark(int mark);
}