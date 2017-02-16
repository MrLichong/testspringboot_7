package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient("test-springboot-one")
public class Testspringboot7Application {

	public static void main(String[] args) {
		SpringApplication.run(Testspringboot7Application.class, args);
	}
}
