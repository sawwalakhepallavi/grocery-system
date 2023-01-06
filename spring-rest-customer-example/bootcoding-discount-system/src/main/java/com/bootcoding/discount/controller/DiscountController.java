package com.bootcoding.discount.controller;

import com.bootcoding.discount.model.Customer;
import com.bootcoding.discount.model.Discount;
import com.bootcoding.discount.service.CustomerService;
import com.bootcoding.discount.service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DiscountController {
        @Autowired
        DiscountService discountService;

        @GetMapping("/customer/discount")
        public List<Discount> getAllCustomerDiscount(){
            return discountService.getAllCustomerDiscount();
        }


}
