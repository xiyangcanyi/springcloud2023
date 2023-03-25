package com.atguiguspringcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author zyp
 * @create 2023-03-16 10:39
 */
@RestController
public class OrderConsulController {

    public static final String INNVOCA_URL="http://consul-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/consul")
    public String paymentInfo(){
        return restTemplate.getForObject(INNVOCA_URL+"/payment/consul",String.class);
    }

}
