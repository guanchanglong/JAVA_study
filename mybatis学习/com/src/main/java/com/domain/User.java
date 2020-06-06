package com.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private String product_name;
    private String product_type;
    private Integer product_price;
    private Date regist_date;

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_type() {
        return product_type;
    }

    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }

    public Integer getProduct_price() {
        return product_price;
    }

    public void setProduct_price(Integer product_price) {
        this.product_price = product_price;
    }

    public Date getRegist_date() {
        return regist_date;
    }

    public void setRegist_date(Date regist_date) {
        this.regist_date = regist_date;
    }

    @Override
    public String toString() {
        return "User{" +
                "product_name='" + product_name + '\'' +
                ", product_type='" + product_type + '\'' +
                ", product_price=" + product_price +
                ", regist_date=" + regist_date +
                '}';
    }
}
