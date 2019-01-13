package com.qfedu.controller;

import com.qfedu.service.GoodsService;
import com.qfedu.service.TypeService;
import com.qfedu.vo.GoodsVo;
import com.qfedu.vo.PageBeanVo;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.ApiOperation;
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
    @ApiOperation(notes = "在商城首页展示所有的商品的一级分类", value = "商品类型展示接口")
    @GetMapping("goodstypeall.do")
    public ResultVo select() {
        return typeService.selectType();
    }


    @ApiOperation(notes = "首页根据商品类型分页查询所有商品和他的最小价格", value = "商品展示接口")
    @GetMapping("pagegoodsall.do")
    public PageBeanVo<GoodsVo> selectGoods(Integer page, Integer size, Integer typeId) {

        return goodsService.selectAllGoods(page, size, typeId);
    }


    @ApiOperation(notes = "根据商品价格和id查询商品详情，用于商城首页跳转到详情页", value = "商品详情跳转接口")
    @GetMapping("selectGoodsDet.do")
    public ResultVo selectGoodsDet(Integer goodsId, Double goodsPrice) {

        return goodsService.selectGoodsDet(goodsId, goodsPrice);
    }

    @ApiOperation(notes = "根据颜色和id查找商品详情，用于挑选商品类型", value = "挑选商品颜色接口")
    @PostMapping("selectDetByColor.do")
    public ResultVo selectByColor(Integer goodsId, String color) {
        return goodsService.selectGoodsDetByColor(goodsId, color);
    }

    @ApiOperation(notes = "根据商品id查询对应所有颜色", value = "颜色展示接口")
    @GetMapping("selectcolor.do")
    public ResultVo selectAllColor(Integer id) {

        return goodsService.selectColorById(id);
    }

    @ApiOperation(notes = "根据上架时间最新排列，容量为2",value = "最新商品接口")
    @GetMapping("goodsByDate.do")
    public ResultVo selectByDate(){
        return goodsService.selectGoodsByDate();
    }

    @ApiOperation(notes = "用模糊查询查单个商品",value = "商品查询")
    @GetMapping("selectOneGoods.do")
    public  ResultVo selectGoods(String goodsname){
        return goodsService.selectGoods(goodsname);
    }
}