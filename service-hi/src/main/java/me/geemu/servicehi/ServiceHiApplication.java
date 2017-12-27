package me.geemu.servicehi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: Geemu
 * Email:cfmmail@sina.com
 * Date: 2017/12/5 13:42
 * Description:
 * @EnableEurekaClient Eureka Client 标识
 * @SpringBootApplication Spring Boot 应用标识
 */
@EnableEurekaClient
@SpringBootApplication
public class ServiceHiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceHiApplication.class, args);
    }
}
