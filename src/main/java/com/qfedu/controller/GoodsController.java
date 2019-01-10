package com.qfedu.controller;

import com.qfedu.service.GoodsService;
import com.qfedu.service.TypeService;
import com.qfedu.vo.GoodsVo;
import com.qfedu.vo.PageBeanVo;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class GoodsController {

    @Autowired
    private TypeService typeService;
    @Autowired
    private GoodsService goodsService;

    //查询所有商品类型
    @GetMapping("goodstypeall.do")
    public ResultVo select() {
        return typeService.selectType();
    }

    //分页查询所有商品和他的最小价格
    @GetMapping("pagegoodsall.do")
    public PageBeanVo<GoodsVo> selectGoods(Integer page, Integer size,Integer typeId) {

        return goodsService.selectAllGoods(page, size,typeId);
    }

    //根据商品价格和id查询商品详情，用于商城首页跳转到详情页
    @GetMapping("selectGoodsDet.do")
    public ResultVo selectGoodsDet(Integer goodsId,Double goodsPrice) {

        return goodsService.selectGoodsDet(goodsId,goodsPrice);
    }

    //根据颜色和id查找商品详情，用于挑选商品类型
    @PostMapping("selectDetByColor.do")
    public  ResultVo selectByColor(Integer goodsId,String color){
        return  goodsService.selectGoodsDetByColor(goodsId,color);
    }

    @GetMapping("selectcolor.do")
    public  ResultVo selectAllColor(Integer id){
        return goodsService.selectColorById(id);
    }
}