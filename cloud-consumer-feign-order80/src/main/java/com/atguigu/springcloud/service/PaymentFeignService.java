package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.TimeUnit;

/**
 * @author zyp
 * @create 2023-03-18 21:45
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
   @GetMapping(value = "/payment/get/{id}")
   public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

   @GetMapping(value = "/payment/feign/timeout")
   public String paymentFeignTimeOut();
}
