package com.itheima.pojo;


import java.sql.Date;

public class KaoHe {

    private Integer keid;
    private String name;
    private java.sql.Date month;
    private Integer score;
    private String wenben;
    private Integer kid;


    public String getWenben() {
        return wenben;
    }

    public void setWenben(String wenben) {
        this.wenben = wenben;
    }
    public Integer getKeid() {
        return keid;
    }

    public void setKeid(Integer keid) {
        this.keid = keid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getMonth() {
        return month;
    }

    public void setMonth(Date month) {
        this.month = month;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getKid() {
        return kid;
    }

    public void setKid(Integer kid) {
        this.kid = kid;
    }
}
