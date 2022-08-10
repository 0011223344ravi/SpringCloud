package com.example.paymentservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment-provider")
public class PaymentController {

    @GetMapping("/getPayment/{price}")
    public  String  getPayment(@PathVariable int price){
        return "payment of rupees "+price +"is done successfully";

    }
}
