package com.qfedu.service.impl;

import com.qfedu.dao.GoodscarMapper;
import com.qfedu.dao.OrdersMapper;
import com.qfedu.pojo.Goodscar;
import com.qfedu.pojo.Orders;
import com.qfedu.service.GoodsCarService;
import com.qfedu.vo.GoodsCarVo;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsCarServiceImpl implements GoodsCarService {
    @Autowired
    private GoodscarMapper goodscarDao;
    @Autowired
    private OrdersMapper ordersDao;
    @Override
    public ResultVo selectAllGoodsCar(Integer userId) {

        List<GoodsCarVo> list = goodscarDao.selectAll(userId);
        return ResultVo.setOK(list);
    }

    @Override
    public ResultVo deleteGoodsCarAddOrders(int[] carIds) {

        for (int id: carIds) {
            goodscarDao.deleteByPrimaryKey(id);
            Orders od = new Orders();
            od.setGoodscarId(id);
            ordersDao.insertSelective(od);
        }

        return ResultVo.setOK(null);
    }

    @Override
    public ResultVo addGoodsCar(Goodscar goodscar) {
        if (goodscarDao.insertSelective(goodscar) > 0) {
            return ResultVo.setOK(null);
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo deleteGoodsCar(int[] carIds) {
        for (int id: carIds) {
            goodscarDao.deleteByPrimaryKey(id);
            Orders od = new Orders();
        }

        return ResultVo.setOK(null);
    }
}
