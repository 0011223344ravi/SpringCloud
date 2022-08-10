package com.example.shoppingservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ShoppingController {


    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getShoppingDetails/{price}")

    public String invokePaymentService(@PathVariable int price) {
        String url = "http://PAYMENT-SERVICE/payment-provider/getPayment" + price;
        return restTemplate.getForObject(url, String.class);
    }

}
