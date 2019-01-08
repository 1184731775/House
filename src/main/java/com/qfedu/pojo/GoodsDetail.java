package com.qfedu.pojo;

public class GoodsDetail {
    private Integer id;

    private String goodsPrice;

    private String goodsSales;

    private String goodsFreight;

    private String goodsColor;

    private String imgs1;

    private String imgs2;

    private String msgs3;

    private String imgs4;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice == null ? null : goodsPrice.trim();
    }

    public String getGoodsSales() {
        return goodsSales;
    }

    public void setGoodsSales(String goodsSales) {
        this.goodsSales = goodsSales == null ? null : goodsSales.trim();
    }

    public String getGoodsFreight() {
        return goodsFreight;
    }

    public void setGoodsFreight(String goodsFreight) {
        this.goodsFreight = goodsFreight == null ? null : goodsFreight.trim();
    }

    public String getGoodsColor() {
        return goodsColor;
    }

    public void setGoodsColor(String goodsColor) {
        this.goodsColor = goodsColor == null ? null : goodsColor.trim();
    }

    public String getImgs1() {
        return imgs1;
    }

    public void setImgs1(String imgs1) {
        this.imgs1 = imgs1 == null ? null : imgs1.trim();
    }

    public String getImgs2() {
        return imgs2;
    }

    public void setImgs2(String imgs2) {
        this.imgs2 = imgs2 == null ? null : imgs2.trim();
    }

    public String getMsgs3() {
        return msgs3;
    }

    public void setMsgs3(String msgs3) {
        this.msgs3 = msgs3 == null ? null : msgs3.trim();
    }

    public String getImgs4() {
        return imgs4;
    }

    public void setImgs4(String imgs4) {
        this.imgs4 = imgs4 == null ? null : imgs4.trim();
    }
}