package com.study.mybatis.entity;

import java.io.Serializable;

public class Company implements Serializable {

    private Integer id;

    private String companyname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }
}