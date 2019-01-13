package com.qfedu.service.impl;

import com.qfedu.dao.ClientMapper;
import com.qfedu.pojo.Client;
import com.qfedu.service.ClientService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: lay
 * @Date: 2019/1/11 20:47
 * @Description:
 */
@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientMapper clientMapper;
    @Override
    public ResultVo save(Client client) {
        int i = clientMapper.insertSelective(client);
        if (i>0){
            return ResultVo.setOK(i);
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo showList() {
        List<Client> list = clientMapper.selectByName(null);
        if (list!=null){
            return ResultVo.setOK(list);
        }
        return ResultVo.setERROR();
    }
}
