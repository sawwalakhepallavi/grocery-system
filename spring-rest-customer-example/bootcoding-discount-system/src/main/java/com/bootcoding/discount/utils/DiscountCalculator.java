package com.bootcoding.discount.utils;

import com.bootcoding.discount.model.Customer;

public class DiscountCalculator {
    private static final int MIN_COUNT=100;
    public static int getDiscount(Customer customer){
        int ordersCount=customer.getOrderCount();
        int visitsCount=customer.getVisiterCount();
        int discount=calcdiscount(ordersCount + visitsCount);
        return discount;
    }
    private static int calcdiscount(int totalCount){


        return(totalCount/MIN_COUNT);
    }
}
