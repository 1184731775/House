package com.qfedu.service.impl;

import com.qfedu.dao.GoodstypeMapper;
import com.qfedu.pojo.Goodstype;
import com.qfedu.service.TypeService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {
    @Autowired
    private GoodstypeMapper goodstypeDao;

    @Override
    public ResultVo selectType() {
        List<Goodstype> list = goodstypeDao.selectAll();
        return ResultVo.setOK(list);
    }
}
