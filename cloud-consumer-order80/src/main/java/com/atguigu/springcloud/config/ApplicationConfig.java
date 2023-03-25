package com.atguigu.springcloud.config;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author zyp
 * @create 2023-03-10 19:27
 */
@Configuration
public class ApplicationConfig {
    @Bean
//    @LoadBalanced  //轮询提供服务
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }


   

}
