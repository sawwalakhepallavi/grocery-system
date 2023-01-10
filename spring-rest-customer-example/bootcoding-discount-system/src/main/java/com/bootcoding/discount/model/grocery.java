package com.bootcoding.discount.model;

import org.springframework.stereotype.Component;

@Component

public class grocery {
    private String Name;
    private String grocery;
    private int price;

    public String getGrocery() {
        return grocery;
    }

    public void setGrocery(String grocery) {
        this.grocery = grocery;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }


}
