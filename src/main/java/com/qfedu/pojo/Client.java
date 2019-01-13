package com.qfedu.pojo;

public class Client {
    private Integer id;

    private String name;

    private String idcard;

    private String info;

    private Integer intention;

    private Integer sex;

    private byte[] phone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    public Integer getIntention() {
        return intention;
    }

    public void setIntention(Integer intention) {
        this.intention = intention;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public byte[] getPhone() {
        return phone;
    }

    public void setPhone(byte[] phone) {
        this.phone = phone;
    }
}