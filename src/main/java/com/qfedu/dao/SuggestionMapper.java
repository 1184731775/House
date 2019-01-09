package com.qfedu.dao;

import com.qfedu.pojo.Suggestion;

import java.util.List;

public interface SuggestionMapper {
    int insert(Suggestion record);

    int insertSelective(Suggestion record);

    List<Suggestion> selectById(int id);
    List<Suggestion> selectNotMy(int id);
}