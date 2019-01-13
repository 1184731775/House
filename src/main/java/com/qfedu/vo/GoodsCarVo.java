package com.qfedu.vo;

public class GoodsCarVo {
    private  Integer id;
    private Integer goodsId;
    private  Integer userId;
    private String goodsName;
    private  Double goodsPrice;
    private Double AllPrice;
    private Double goodsFreight;
    private Double AllFreight;
    private String goodsImgs;
    private Integer goodsConut;
    private String color;
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Double getAllPrice() {
        return AllPrice;
    }

    public void setAllPrice(Double allPrice) {
        AllPrice = allPrice;
    }

    public Double getGoodsFreight() {
        return goodsFreight;
    }

    public void setGoodsFreight(Double goodsFreight) {
        this.goodsFreight = goodsFreight;
    }

    public Double getAllFreight() {
        return AllFreight;
    }

    public void setAllFreight(Double allFreight) {
        AllFreight = allFreight;
    }

    public String getGoodsImgs() {
        return goodsImgs;
    }

    public void setGoodsImgs(String goodsImgs) {
        this.goodsImgs = goodsImgs;
    }

    public Integer getGoodsConut() {
        return goodsConut;
    }

    public void setGoodsConut(Integer goodsConut) {
        this.goodsConut = goodsConut;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public GoodsCarVo() { }
}
