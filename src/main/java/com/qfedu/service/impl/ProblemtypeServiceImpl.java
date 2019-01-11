package com.qfedu.service.impl;

import com.qfedu.dao.ProblemtypeMapper;
import com.qfedu.pojo.Problemtype;
import com.qfedu.service.ProblemtypeService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: lay
 * @Date: 2019/1/10 19:54
 * @Description:
 */
@Service
public class ProblemtypeServiceImpl implements ProblemtypeService {
    @Autowired
    private ProblemtypeMapper problemtypeMapper;

    @Override
    public ResultVo show() {
        List<Problemtype> list = problemtypeMapper.selectproblem();
        return ResultVo.setOK(list);
    }
}
