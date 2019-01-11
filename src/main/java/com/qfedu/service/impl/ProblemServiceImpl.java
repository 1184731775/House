package com.qfedu.service.impl;

import com.qfedu.dao.ProblemMapper;
import com.qfedu.pojo.Problem;
import com.qfedu.service.ProblemService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: lay
 * @Date: 2019/1/10 20:51
 * @Description:
 */
@Service
public class ProblemServiceImpl implements ProblemService {

    @Autowired
    private ProblemMapper problemMapper;
    @Override
    public ResultVo selectByNotMark() {
        List<Problem> list = problemMapper.selectByNotMark();
        if (list!=null){
            return ResultVo.setOK(list);
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo selectByMark(int mark) {
        Problem problem = problemMapper.selectByMark(mark);
        if (problem!=null){
            return ResultVo.setOK(problem);
        }
        return ResultVo.setERROR();
    }
}
