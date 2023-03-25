package com.atguigu.springcloud.lb;

import com.netflix.loadbalancer.ILoadBalancer;
import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author zyp
 * @create 2023-03-18 20:34
 */
public interface LoadBalancer {
    ServiceInstance instance(List<ServiceInstance>serviceInstances);

}
