package com.qfedu.service;

import com.qfedu.pojo.Suggestion;
import com.qfedu.vo.ResultVo;

/**
 * @author lay
 * @data 2019/1/9 20:47
 * @description
 */
public interface SuggestionService {

    ResultVo selectNotMy(int id);

    ResultVo selectById(int id);

    ResultVo saveSuggestion(Suggestion suggestion);
}
