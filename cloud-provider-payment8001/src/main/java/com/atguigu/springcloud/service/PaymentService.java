package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author zyp
 * @create 2023-03-09 22:32
 */
public interface PaymentService {
    public  int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
