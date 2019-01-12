package com.qfedu.pojo;

public class Orders {
    private Integer id;

    private Integer orederStatus;

    private Integer goodscarId;

    private Integer addressId;

    private Integer userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrederStatus() {
        return orederStatus;
    }

    public void setOrederStatus(Integer orederStatus) {
        this.orederStatus = orederStatus;
    }

    public Integer getGoodscarId() {
        return goodscarId;
    }

    public void setGoodscarId(Integer goodscarId) {
        this.goodscarId = goodscarId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}