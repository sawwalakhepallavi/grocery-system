package com.bootcoding.discount;


import com.bootcoding.discount.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiscountApplication implements ApplicationRunner {

    @Autowired
    Cycle cycle;
    @Autowired
    Marker marker;
    @Autowired
    Student student;


    public static void main(String[] args) {
        SpringApplication.run(DiscountApplication.class,args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Welcome to spring boot");




//        cycle.setBrand("....BTS.....");
//        cycle.setType("gear");
//        cycle.setPrice(10000);
//        System.out.println(cycle.getBrand());
//        System.out.println(cycle.getType());
//        System.out.println(cycle.getPrice());
//
//
//        marker.setColor("black");
//        marker.setBrand("BOARED");
//        marker.setPrice(50);
//        System.out.println(marker.getBrand());
//        System.out.println(marker.getColor());
//        System.out.println(marker.getPrice());

    }
}
