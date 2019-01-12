package com.qfedu.service.impl;

import com.qfedu.dao.AddressMapper;
import com.qfedu.pojo.Address;
import com.qfedu.service.AddressService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressMapper addressDao;
    @Override
    public ResultVo selectAll(Integer userId) {
        List<Address>  list = addressDao.select(userId);
        return ResultVo.setOK(list);
    }

    @Override
    public ResultVo deleteAddress(Integer id) {
        addressDao.deleteByPrimaryKey(id);

        return ResultVo.setOK(null);
    }

    @Override
    public ResultVo modifyAddress(Address address) {
        if (addressDao.updateByPrimaryKeySelective(address)>0) {
            return  ResultVo.setOK(null);
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo addAddress(Address address) {
    if (addressDao.insertSelective(address)>0) {
        return ResultVo.setOK(null);
    }
    return  ResultVo.setERROR();
    }
}
