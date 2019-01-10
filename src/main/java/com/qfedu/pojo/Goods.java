package com.qfedu.pojo;

import java.util.Date;

public class Goods {
    private Integer id;

    private String goodsname;

    private String goodsImgs;

    private Integer goodsStatus;

    private Date goodsCreatdate;

    private Integer typeId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public String getGoodsImgs() {
        return goodsImgs;
    }

    public void setGoodsImgs(String goodsImgs) {
        this.goodsImgs = goodsImgs == null ? null : goodsImgs.trim();
    }

    public Integer getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(Integer goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public Date getGoodsCreatdate() {
        return goodsCreatdate;
    }

    public void setGoodsCreatdate(Date goodsCreatdate) {
        this.goodsCreatdate = goodsCreatdate;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }
}