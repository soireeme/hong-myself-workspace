package com.honglei.project.getway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

@EnableDiscoveryClient
@SpringBootApplication
public class GetwayApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext=SpringApplication.run(GetwayApplication.class, args);
        String userName = applicationContext.getEnvironment().getProperty("jeecg.test");
        System.err.println("user name :" +userName);
    }

}
