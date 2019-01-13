package com.qfedu.service.impl;

import com.qfedu.dao.BuyhouseMapper;
import com.qfedu.pojo.Buyhouse;
import com.qfedu.service.BuyhouseService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: lay
 * @Date: 2019/1/11 16:37
 * @Description:
 */
@Service
public class BuyhouseServiceImpl implements BuyhouseService {
    @Autowired
    private BuyhouseMapper buyhouseMapper;

    @Override
    public ResultVo showByname(String name) {
        int i = buyhouseMapper.selectCountByName(name);
        List<Buyhouse> list = buyhouseMapper.selectByName(name);
        ResultVo vo = new ResultVo();
        if (list!=null){
            vo.setCode(0);
            vo.setCount(i);
            vo.setData(list);
            return vo;
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo showByPrice(int price1, int price2) {

        List<Buyhouse> list = buyhouseMapper.selectByPrice(price1,price2);
        int i = list.size();
        ResultVo vo = new ResultVo();
        if (list!=null){
            vo.setCode(0);
            vo.setCount(i);
            vo.setData(list);
            return vo;
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo showByArea(int area1, int area2) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("area1",area1);
        map.put("area2",area2);
        List<Buyhouse> list = buyhouseMapper.selectByArea(map);
        int i = list.size();
        ResultVo vo = new ResultVo();
        if (list!=null){
            vo.setCode(0);
            vo.setCount(i);
            vo.setData(list);
            return vo;
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo showByCity(String city) {
        List<Buyhouse> list = buyhouseMapper.selectByCity(city);
        int i = list.size();
        ResultVo vo = new ResultVo();
        if (list!=null){
            vo.setCode(0);
            vo.setCount(i);
            vo.setData(list);
            return vo;
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo showAll(int hid) {
        Buyhouse buyhouse = buyhouseMapper.selectAll(hid);
        if (buyhouse!=null){
            return ResultVo.setOK(buyhouse);
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo showNameAndId() {
        List<Buyhouse> list = buyhouseMapper.selectById();
        if (list!=null){
            return ResultVo.setOK(list);
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo showrecommend() {
        List<Buyhouse> list = buyhouseMapper.selectqwe();

        return ResultVo.setOK(list);
    }

    @Override
    public ResultVo showAllin(int id) {

        List<Buyhouse> list = buyhouseMapper.selectAllId(id);

        int i =buyhouseMapper.selectBytypeId(id);
        ResultVo vo = new ResultVo();
        if (list!=null){
            vo.setCode(0);
            vo.setCount(i);
            vo.setData(list);
            return vo;
        }
        return ResultVo.setERROR();
    }


}
