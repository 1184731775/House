package com.qfedu.service.impl;

import com.qfedu.dao.ClienthouseMapper;
import com.qfedu.pojo.Clienthouse;
import com.qfedu.service.ClienthouseService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: lay
 * @Date: 2019/1/11 21:41
 * @Description:
 */
@Service
public class ClienthouseServiceImpl implements ClienthouseService {
    @Autowired
    private ClienthouseMapper clienthouseMapper;
    @Override
    public ResultVo add(Clienthouse clienthouse) {
        int i = clienthouseMapper.insertSelective(clienthouse);
        if (i>0){
            return ResultVo.setOK(i);
        }
        return ResultVo.setERROR();
    }
}
