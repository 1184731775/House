package com.qfedu.service.impl;

import com.qfedu.dao.UserdetailMapper;
import com.qfedu.pojo.Userdetail;
import com.qfedu.service.UserdetailService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lay
 * @data 2019/1/9 16:39
 * @description
 */
@Service
public class UserdetailServiceImpl implements UserdetailService {

    @Autowired
    private UserdetailMapper userdetailMapper;


    public ResultVo update(Userdetail userdetail) {
        int i = userdetailMapper.updateByPrimaryKeySelective(userdetail);
        if (i>0){
            return ResultVo.setOK(i);
        }
        return ResultVo.setERROR();
    }
}
