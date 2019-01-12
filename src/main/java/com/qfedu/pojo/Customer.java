package com.qfedu.pojo;

public class Customer {
    private Integer id;

    private String cname;

    private String cgender;

    private Integer cphone;

    private Integer cidcard;

    private String cinfo;

    private Integer intention;

    private Integer divide;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getCgender() {
        return cgender;
    }

    public void setCgender(String cgender) {
        this.cgender = cgender == null ? null : cgender.trim();
    }

    public Integer getCphone() {
        return cphone;
    }

    public void setCphone(Integer cphone) {
        this.cphone = cphone;
    }

    public Integer getCidcard() {
        return cidcard;
    }

    public void setCidcard(Integer cidcard) {
        this.cidcard = cidcard;
    }

    public String getCinfo() {
        return cinfo;
    }

    public void setCinfo(String cinfo) {
        this.cinfo = cinfo == null ? null : cinfo.trim();
    }

    public Integer getIntention() {
        return intention;
    }

    public void setIntention(Integer intention) {
        this.intention = intention;
    }

    public Integer getDivide() {
        return divide;
    }

    public void setDivide(Integer divide) {
        this.divide = divide;
    }
}