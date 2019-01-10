package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.GoodsColorMapper;
import com.qfedu.dao.GoodsMapper;
import com.qfedu.service.GoodsService;
import com.qfedu.vo.GoodsVo;
import com.qfedu.vo.PageBeanVo;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsDao;
    @Autowired
    private GoodsColorMapper goodsColorDao;

    @Override
    public PageBeanVo<GoodsVo> selectAllGoods(Integer page, Integer size,Integer typeId) {

        Page<Object> startPage = PageHelper.startPage(page,size);
        List<GoodsVo> list =goodsDao.selectAll(typeId);

        Integer count = Integer.parseInt(String.valueOf(startPage.getTotal()));
        return PageBeanVo.setPage(count, list);

    }

    @Override
    public ResultVo selectGoodsDet(Integer goodsId,Double goodsPrice) {
        GoodsVo go = goodsDao.selectGoodsDet(goodsId,goodsPrice);

        return ResultVo.setOK(go);
    }

    @Override
    public ResultVo selectGoodsDetByColor(Integer goodsId, String color) {
        GoodsVo go2 = goodsDao.selectByGoodsColor(goodsId,color);
        return ResultVo.setOK(go2);
    }

    @Override
    public ResultVo selectColorById(Integer id) {
        List<GoodsVo> list = goodsColorDao.selectColor(id);
        return ResultVo.setOK(list);
    }
}
