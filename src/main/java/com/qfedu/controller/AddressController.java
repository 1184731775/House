package com.qfedu.controller;

import com.qfedu.pojo.Address;
import com.qfedu.service.AddressService;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    @ApiOperation(notes = "根据用户id来查找用户所拥有的所有地址。", value = "展示所有地址接口")
    @GetMapping("addressAll.do")
    public ResultVo selectAllAdd(Integer userId) {
        return addressService.selectAll(userId);
    }

    @ApiOperation(notes = "添加新的地址，userId不变", value = "新增地址接口")
    @GetMapping("addAddress.do")
    public ResultVo addAddress(Address address) {
        return addressService.addAddress(address);
    }

    @ApiOperation(notes = "根据id删除地址", value = "删除地址接口")
    @GetMapping("deleteAddress.do")
    public ResultVo deleteAddress(Integer id) {
        return addressService.deleteAddress(id);
    }

    @ApiOperation(notes = "修改地址信息，id不变，userId不变", value = "修改地址信息")
    @GetMapping("modifyAddress.do")
    public ResultVo modifyAddress(Address address) {
        return addressService.modifyAddress(address);
    }
}
