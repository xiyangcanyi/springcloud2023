package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zyp
 * @create 2023-03-16 20:31
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentNacosMain9002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentNacosMain9002.class,args);
    }

}
