package com.springc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//调用注册中心eurekaserver的注解
public class EurekaserverdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaserverdemoApplication.class, args);
	}

}
