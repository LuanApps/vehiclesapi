package com.udacity.pricing;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//In Spring Boot 3.0 there ir no need to use @EnableEurekaClient, this annotation also don`t work with spring-cloud-version 2022.0.1
public class PricingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PricingServiceApplication.class, args);
    }

}
