package com.qfedu.pojo;

import java.util.List;

public class Buyhousetype {
    private Integer id;


    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    private Integer typeid;

    private String imgurl;

    public List<Buyhouse> getBuyhouses() {
        return buyhouses;
    }

    public void setBuyhouses(List<Buyhouse> buyhouses) {
        this.buyhouses = buyhouses;
    }

    private List<Buyhouse> buyhouses;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }
}