package com.atguigu.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author zyp
 * @create 2023-03-25 10:11
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    public static HashMap<Long,Payment> hashMap=new HashMap<>();

    static {
        hashMap.put(1L, new Payment(1L,"199811046510"));
        hashMap.put(2L, new Payment(2L,"199811046511"));
        hashMap.put(3L, new Payment(3L,"199811046512"));
    }

    @GetMapping(value = "/payment/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id){
        Payment payment=hashMap.get(id);
        CommonResult<Payment> result=new CommonResult(200,"from mysql ,serverport: "+serverPort ,payment);
        return result;
    }
}

