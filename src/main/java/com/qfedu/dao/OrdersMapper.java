package com.qfedu.dao;

import com.qfedu.pojo.Orders;
import com.qfedu.vo.OrdersVo;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrdersMapper {

    //删除
    int deleteByPrimaryKey(Integer id);

    int insert(Orders record);

    //添加
    int insertSelective(Orders record);

    Orders selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);

    //查询所有订单
    @Select("SELECT o.id,g.goodsname,c.color,gc.goods_count,gdc.goods_price,\n" +
            "g.goods_imgs,o.oreder_status,a.recipient,a.phone,a.downtown,a.address\n" +
            "FROM t_orders o \n" +
            "INNER JOIN t_goodscar gc\n" +
            "ON o.goodscar_id = gc.id\n" +
            "INNER JOIN t_goods_detail_color gdc\n" +
            "ON gc.goods_detail_color_id = gdc.id\n" +
            "INNER JOIN t_goods_detail gd \n" +
            "ON gdc.goods_detail_id = gd.id\n" +
            "INNER JOIN t_goods g\n" +
            "ON gd.goods_id = g.id\n" +
            "INNER JOIN t_color c\n" +
            "ON gdc.color_id = c.id\n" +
            "INNER JOIN t_address a\n" +
            "ON o.address_id = a.id\n" +
            "WHERE o.user_id = #{userId}")
    @ResultType(OrdersVo.class)
    List<OrdersVo> selectAll(Integer userId);
}