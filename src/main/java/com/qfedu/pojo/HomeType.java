package com.qfedu.pojo;

public class HomeType {
    private Integer id;

    private String tyoeName;

    private String typeDes1;

    private String typeDes2;

    private String typeDes3;

    private String typeDes4;

    private String typeDes5;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTyoeName() {
        return tyoeName;
    }

    public void setTyoeName(String tyoeName) {
        this.tyoeName = tyoeName == null ? null : tyoeName.trim();
    }

    public String getTypeDes1() {
        return typeDes1;
    }

    public void setTypeDes1(String typeDes1) {
        this.typeDes1 = typeDes1 == null ? null : typeDes1.trim();
    }

    public String getTypeDes2() {
        return typeDes2;
    }

    public void setTypeDes2(String typeDes2) {
        this.typeDes2 = typeDes2 == null ? null : typeDes2.trim();
    }

    public String getTypeDes3() {
        return typeDes3;
    }

    public void setTypeDes3(String typeDes3) {
        this.typeDes3 = typeDes3 == null ? null : typeDes3.trim();
    }

    public String getTypeDes4() {
        return typeDes4;
    }

    public void setTypeDes4(String typeDes4) {
        this.typeDes4 = typeDes4 == null ? null : typeDes4.trim();
    }

    public String getTypeDes5() {
        return typeDes5;
    }

    public void setTypeDes5(String typeDes5) {
        this.typeDes5 = typeDes5 == null ? null : typeDes5.trim();
    }
}