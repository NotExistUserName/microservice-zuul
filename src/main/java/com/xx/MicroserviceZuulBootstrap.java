package com.xx;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @discription zuul启动器
 * @author: xx
 * @date: 2021/2/27 11:31
 */
@Slf4j
@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class MicroserviceZuulBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceZuulBootstrap.class,args);
        log.info("micro service zuul boot successfully..");
    }

}
