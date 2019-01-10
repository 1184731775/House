package com.qfedu.dao;

import com.qfedu.pojo.GoodsColor;
import com.qfedu.vo.GoodsVo;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GoodsColorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsColor record);

    int insertSelective(GoodsColor record);

    GoodsColor selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsColor record);

    int updateByPrimaryKey(GoodsColor record);

    @Select("SELECT g.goodsname,g.id,c.color as goodsColor FROM t_color c\n" +
            "INNER JOIN t_goods_detail_color gdc\n" +
            "on c.id = gdc.color_id\n" +
            "INNER JOIN t_goods_detail gd\n" +
            "ON gdc.goods_detail_id = gd.id\n" +
            "INNER JOIN t_goods g\n" +
            "ON gd.goods_id = g.id\n" +
            "WHERE g.id = #{id}")
    @ResultType(GoodsVo.class)
    List<GoodsVo> selectColor(Integer id);
}