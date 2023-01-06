package com.bootcoding.discount.model;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Discount {
    private String Name;
    private int discount;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }



    private Date validity;

    public Date getValidity() {
        return validity;
    }

    public void setValidity(Date validity) {
        this.validity = validity;
    }
}
