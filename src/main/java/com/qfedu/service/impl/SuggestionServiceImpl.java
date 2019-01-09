package com.qfedu.service.impl;

import com.qfedu.dao.SuggestionMapper;
import com.qfedu.pojo.Suggestion;
import com.qfedu.service.SuggestionService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lay
 * @data 2019/1/9 20:48
 * @description
 */
@Service
public class SuggestionServiceImpl implements SuggestionService {
    @Autowired
    private SuggestionMapper suggestionMapper;

    @Override
    public ResultVo selectNotMy(int id) {
        List<Suggestion> list = suggestionMapper.selectNotMy(id);
        if (list!=null){
            return ResultVo.setOK(list);
        }
        return ResultVo.setERROR();
    }
    @Override
    public ResultVo selectById(int id) {

        List<Suggestion> list = suggestionMapper.selectById(id);
        if (list!=null){
            return ResultVo.setOK(list);
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo saveSuggestion(Suggestion suggestion) {
        int i = suggestionMapper.insertSelective(suggestion);
        if (i>0){
            return ResultVo.setOK(i);
        }
        return ResultVo.setERROR();
    }
}
