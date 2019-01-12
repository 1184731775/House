package com.qfedu.service;

import com.qfedu.vo.GoodsVo;
import com.qfedu.vo.PageBeanVo;
import com.qfedu.vo.ResultVo;

public interface GoodsService {

    PageBeanVo<GoodsVo> selectAllGoods(Integer page, Integer size,Integer typeId);

    ResultVo selectGoods(String goodsnaame);

    ResultVo selectGoodsDet(Integer goodsId,Double goodsPrice);

    ResultVo selectGoodsDetByColor(Integer goodsId,String color);

    ResultVo selectColorById(Integer id);

    ResultVo selectGoodsByDate();
}
