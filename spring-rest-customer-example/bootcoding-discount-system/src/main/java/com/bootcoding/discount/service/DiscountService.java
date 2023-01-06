package com.bootcoding.discount.service;

import com.bootcoding.discount.model.Customer;
import com.bootcoding.discount.model.Discount;
import com.bootcoding.discount.utils.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DiscountService {
    private static final int MAX_LIMIT=100;
    private static int VALILITY_DAYS;
    @Autowired
    CustomerService customerService;

    public List<Discount> getAllCustomerDiscount(){
        List<Discount> discounts=new ArrayList<>();
        List<Customer> customers=customerService.getAllCustomer();
        for(int i=0;i<customers.size();i++){
            Customer customer=customers.get(i);
            Discount discount=calculateDiscount(customer);
            discounts.add(discount);
        }
        return discounts;
    }

    private Discount calculateDiscount(Customer customer) {
        Discount discount=new Discount();
        discount.setName(customer.getName());
        discount.setDiscount(DiscountCalculator.getDiscount(customer));
        discount.setValidity(DiscountValidityGenerator.getValidity(DiscountValidityGenerator.getValidityCount()));
        return discount;


    }
}
