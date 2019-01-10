package com.qfedu.dao;

import com.qfedu.pojo.Goods;
import com.qfedu.vo.GoodsVo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
    
  //主页面展示商品
    @Select("SELECT MIN(goods_price) as goods_price,gdc.goods_detail_id,gd.goods_id,tg.goodsname,tg.goods_imgs\n" +
            "from t_goods_detail_color gdc\n" +
            "INNER JOIN t_goods_detail gd\n" +
            "on gd.id=gdc.goods_detail_id\n" +
            "INNER JOIN t_goods tg\n" +
            "on gd.goods_id=tg.id \n" +
           "INNER JOIN t_goodstype gt\n" +
            "ON gt.id = tg.type_id\n" +
            "WHERE gt.id = #{typeId}\n" +
            "GROUP BY goods_detail_id\n ")
    //连表查商品和最小价格根据商品类型
    @ResultType(GoodsVo.class)
    List<GoodsVo> selectAll(Integer typeId);

    //根据价格和商品id查询商品详情
    @Select("SELECT gd.goods_id,g.goodsname as goodsName,g.goods_status,gd.goods_freight,gd.goods_sales,gd.imgs1,gd.imgs2,gd.imgs3,gd.imgs4,gdc.goods_price,c.color as goodsColor FROM \n" +
            "t_goods_detail_color gdc\n" +
            "INNER JOIN t_color c\n" +
            "ON gdc.color_id = c.id\n" +
            "INNER JOIN t_goods_detail gd\n" +
            "ON gdc.goods_detail_id = gd.id\n" +
            "INNER JOIN t_goods g\n" +
            "ON g.id =gd.goods_id\n" +
            "WHERE gdc.goods_price = #{goodsPrice}\n" +
            "AND gd.goods_id = #{goodsId}")
    @ResultType(GoodsVo.class)
    GoodsVo selectGoodsDet(@Param("goodsId") Integer goodsId,@Param("goodsPrice") Double goodsPrice);

//根据商品id和颜色查询
    @Select("SELECT g.id as goodsId,g.goodsname,g.goods_status,gd.goods_freight,gd.goods_sales,gd.imgs1,gd.imgs2,gd.imgs3,gd.imgs4,gdc.goods_price,c.color as goodsColor\n" +
            "FROM t_goods_detail gd\n" +
            "INNER JOIN t_goods_detail_color gdc ON gdc.goods_detail_id = gd.id\n" +
            "INNER JOIN t_goods g ON gd.goods_id = g.id \n" +
            "INNER JOIN t_color c ON gdc.color_id  = c.id\n" +
            "WHERE gd.goods_id=#{goodsId}\n" +
            "and color =#{color}")
    @ResultType(GoodsVo.class)
    GoodsVo selectByGoodsColor(@Param("goodsId") Integer goodsId, @Param("color") String color);
}