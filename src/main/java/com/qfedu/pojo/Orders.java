package com.qfedu.pojo;

public class Orders {
    private Integer id;

    private Integer goodsCount;

    private String goodsPrice;

    private Integer orederStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
    }

    public String getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice == null ? null : goodsPrice.trim();
    }

    public Integer getOrederStatus() {
        return orederStatus;
    }

    public void setOrederStatus(Integer orederStatus) {
        this.orederStatus = orederStatus;
    }
}