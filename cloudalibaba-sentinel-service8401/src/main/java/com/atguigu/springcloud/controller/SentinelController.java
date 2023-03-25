package com.atguigu.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Time;
import java.util.concurrent.TimeUnit;


/**
 * @author zyp
 * @create 2023-03-22 22:05
 */
@RestController
@Slf4j
public class SentinelController {

    @GetMapping("/testA")
    public String testA() {
//        try {
//            TimeUnit.SECONDS.sleep(2);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
        return "testA~~~~~~~";
    }

    @GetMapping("/testB")
    public String testB() {
        return "testB~~~~~~~";
    }

    @GetMapping("/testD")
    public String testD() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.info("testD RT");
        log.info("testD 异常比例");
        int i=10/0;
        return "~~~~~~~~testD~~~~~~~";
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey",blockHandler = "deal_testHotKey")
    public String testHotKey(@RequestParam(value = "p1",required = false) String p1,
                             @RequestParam(value = "p2" ,required = false) String p2){
        return "---------------testHotKey";

    }
//兜底处理
    public  String deal_testHotKey(String p1,String p2){
        return "--------------deal_testHotKey,/(ㄒoㄒ)/~~";//Sentinel默认提示：blocking by Sentinel（flowlimiting）
    }

//



}
