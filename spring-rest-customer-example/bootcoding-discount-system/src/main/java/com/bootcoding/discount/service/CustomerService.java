package com.bootcoding.discount.service;

import com.bootcoding.discount.model.Customer;
import com.bootcoding.discount.utils.NameGenerator;
import com.bootcoding.discount.utils.OrderCountGenerator;
import com.bootcoding.discount.utils.VisitCountGenerator;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    public List<Customer> getAllCustomer(){
        List<Customer> customers=new ArrayList<>();
        for(int i=0;i<10;i++){
            Customer customer=buildRandomCustomer();
            customers.add(customer);
        }
        return customers;
    }

    private Customer buildRandomCustomer() {
        Customer customer=new Customer();
        customer.setName(NameGenerator.getName());
        customer.setCity(customer.getCity());
        customer.setOrderCount(OrderCountGenerator.getOrderCount());
        customer.setVisiterCount(VisitCountGenerator.getVisitCount());
        return customer;
    }
}
