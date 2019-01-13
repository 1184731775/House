package com.qfedu.pojo;

public class Buyhouse {
    private Integer id;

    private Integer typeid;

    private String houseimgurl;

    private String name;

    private Integer price;

    private String area;

    private String city;

    public Buyhousedetil getBuyhousedetil() {
        return buyhousedetil;
    }

    public void setBuyhousedetil(Buyhousedetil buyhousedetil) {
        this.buyhousedetil = buyhousedetil;
    }

    private Buyhousedetil buyhousedetil;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getHouseimgurl() {
        return houseimgurl;
    }

    public void setHouseimgurl(String houseimgurl) {
        this.houseimgurl = houseimgurl == null ? null : houseimgurl.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }
}