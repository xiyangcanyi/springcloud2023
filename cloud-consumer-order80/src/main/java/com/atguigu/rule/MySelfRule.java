package com.atguigu.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zyp
 * @create 2023-03-18 19:24
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule getRule(){
        return new RandomRule();
    }
}
