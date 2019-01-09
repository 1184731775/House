package com.qfedu.pojo;

public class Suggestion {
    private Integer id;

    private String suggest;

    private Integer typeSug;

    private String complaint;

    private Integer typeCom;

    private String solution;

    private Integer flag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSuggest() {
        return suggest;
    }

    public void setSuggest(String suggest) {
        this.suggest = suggest == null ? null : suggest.trim();
    }

    public Integer getTypeSug() {
        return typeSug;
    }

    public void setTypeSug(Integer typeSug) {
        this.typeSug = typeSug;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint == null ? null : complaint.trim();
    }

    public Integer getTypeCom() {
        return typeCom;
    }

    public void setTypeCom(Integer typeCom) {
        this.typeCom = typeCom;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution == null ? null : solution.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}