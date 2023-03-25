package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author zyp
 * @create 2023-03-16 20:52
 */
@RestController
@Slf4j
public class OrderNacosController {


    @Resource
    public RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String serverURL;

    @GetMapping(value = "/consumer/payment/nacos/{id}")
    public String getInfo(@PathVariable("id") Long id){
        return  restTemplate.getForObject(serverURL+"/payment/nacos/"+id,String.class);

    }
}
