package com.practice.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service  //service is an alias for component annotation however service is used for business logic whereas component is mostly used for utility logic
public class OrderService {
    private PaymentService paymentService;

    //@Autowired //used when more than one constructors exist to avoid null exception beanexception errors
    public OrderService(PaymentService paymentService){
        this.paymentService =  paymentService;
    }

    public void placeOrder(){
        paymentService.processPayment(10);
    }
}
