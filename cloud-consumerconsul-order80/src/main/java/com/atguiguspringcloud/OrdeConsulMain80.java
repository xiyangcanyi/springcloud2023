package com.atguiguspringcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zyp
 * @create 2023-03-16 10:36
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrdeConsulMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrdeConsulMain80.class,args);
    }
}
