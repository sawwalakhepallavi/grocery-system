package com.bootcoding.discount.utils;

import java.util.Random;
import java.util.Stack;

public class VisitCountGenerator {
    final static int MAX=9999;
    final static int MIN=10;
    static Random random=new Random();

    public static int  getVisitCount(){
        int number= random.nextInt(MAX-MIN);
        return MIN + number;
    }
}
