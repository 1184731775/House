package com.qfedu.service;

import com.qfedu.vo.ResultVo;

/**
 * @Auther: lay
 * @Date: 2019/1/10 20:51
 * @Description:
 */
public interface ProblemService {

    ResultVo selectByNotMark();

    ResultVo selectByMark(int mark);
}
