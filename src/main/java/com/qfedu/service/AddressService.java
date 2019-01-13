package com.qfedu.service;

import com.qfedu.pojo.Address;
import com.qfedu.vo.ResultVo;

public interface AddressService {

    ResultVo selectAll(Integer userId);

    ResultVo deleteAddress(Integer id);

    ResultVo modifyAddress(Address address);

    ResultVo addAddress(Address address);
}
