package com.qfedu.dao;

import com.qfedu.pojo.Goodscar;
import com.qfedu.vo.GoodsCarVo;
import com.qfedu.vo.GoodsVo;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GoodscarMapper {
    //删除方法
    int deleteByPrimaryKey(Integer id);

    int insert(Goodscar record);

    //添加方法
    int insertSelective(Goodscar record);

    Goodscar selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goodscar record);

    int updateByPrimaryKey(Goodscar record);

    //查看所有购物车信息
    @Select("SELECT gc.id ,gc.user_id,gd.goods_freight,gd.goods_id ,g.goodsname,g.goods_imgs,gdc.goods_price,gc.goods_count,c.color ,gc.goods_car_status as status\n" +
            "FROM t_goodscar gc \n" +
            "INNER JOIN t_goods_detail_color gdc\n" +
            "ON gc.goods_detail_color_id = gdc.id\n" +
            "INNER JOIN t_goods_detail gd\n" +
            "ON gdc.goods_detail_id = gd.id\n" +
            "INNER JOIN t_goods g\n" +
            "ON gd.goods_id = g.id \n" +
            "INNER JOIN t_color c\n" +
            "ON c.id = gdc.color_id\n" +
            "WHERE gc.user_id =#{userId}")
    @ResultType(GoodsVo.class)
    List<GoodsCarVo> selectAll(Integer userId);




}