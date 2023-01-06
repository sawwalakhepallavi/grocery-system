package com.bootcoding.discount.utils;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class DiscountValidityGenerator {
    public static Date getValidity(int days){
        Calendar calendar= Calendar.getInstance();
        calendar.add(Calendar.DATE,days);
        return calendar.getTime();
    }
    final static int MAX=16;
    final static int MIN=1;
    static Random random=new Random();

    public static int  getValidityCount(){
        int number= random.nextInt(MAX-MIN);
        return MIN + number;
    }
}
