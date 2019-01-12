package com.qfedu.controller;

import com.qfedu.pojo.Goodscar;
import com.qfedu.service.GoodsCarService;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class GoodsCarController {
    @Autowired
    private GoodsCarService goodsCarService;

    @ApiOperation(notes = "根据用户的id查找所有的购物车信息，总价是单价*数量", value = "购物车展示接口")
    @GetMapping("goodscarAll.do")
    public ResultVo select(Integer userId) {
        return goodsCarService.selectAllGoodsCar(userId);
    }

    @ApiOperation(notes = "根据id删除购物车",value = "购物车删除接口")
    @GetMapping("deleteGoodscar.do")
    public ResultVo deleteById(int[] arrIds){
        goodsCarService.deleteGoodsCar(arrIds);
        return ResultVo.setOK(null);
    }

    @ApiOperation(notes = "添加购物车，将商品价格表的id传过来",value = "添加购物车接口")
    @GetMapping("addGoodscar.do")
    public ResultVo addGoodscar(Goodscar goodscar){
        goodsCarService.addGoodsCar(goodscar);
        return  ResultVo.setOK(null);
    }
}
