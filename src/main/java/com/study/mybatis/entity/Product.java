package com.study.mybatis.entity;

public class Product {
    private Integer id;

    private String productname;

    public Product(Integer id, String productname) {
        this.id = id;
        this.productname = productname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }
}