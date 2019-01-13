package com.qfedu.service;

import com.qfedu.pojo.Goodscar;
import com.qfedu.vo.ResultVo;

public interface GoodsCarService {

    ResultVo selectAllGoodsCar(Integer userId);

    ResultVo deleteGoodsCar(int[] carIds);

    ResultVo addGoodsCar(Goodscar goodscar);
}
