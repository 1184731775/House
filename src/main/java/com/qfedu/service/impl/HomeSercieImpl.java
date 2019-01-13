package com.qfedu.service.impl;

import com.qfedu.dao.HomeMapper;
import com.qfedu.pojo.Home;
import com.qfedu.service.HomeService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeSercieImpl implements HomeService {
    @Autowired
    private HomeMapper dao;


    @Override
    public ResultVo selectHomeByTypeId(Integer id) {
        List<Home> homes = dao.selectHomeinfoByTypeId(id);
        if (homes != null) {
            return  ResultVo.setOK(homes);
        }
        return ResultVo.setERROR();
    }
}
