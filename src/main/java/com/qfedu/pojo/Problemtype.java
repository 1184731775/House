package com.qfedu.pojo;

import java.util.List;

public class Problemtype {
    private Integer id;

    private String problemtype;

    private String imgurl;

    public List<Problem> getProblems() {
        return problems;
    }

    public void setProblems(List<Problem> problems) {
        this.problems = problems;
    }

    private List<Problem> problems;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProblemtype() {
        return problemtype;
    }

    public void setProblemtype(String problemtype) {
        this.problemtype = problemtype == null ? null : problemtype.trim();
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }
}