package com.bootcoding.discount.model;

import org.springframework.stereotype.Component;

@Component
public class Customer {
    private String name;
    private int orderCount;
    private int visiterCount;

    public int getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(int orderCount) {
        this.orderCount = orderCount;
    }

    public int getVisiterCount() {
        return visiterCount;
    }

    public void setVisiterCount(int visiterCount) {
        this.visiterCount = visiterCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private String city;


}
