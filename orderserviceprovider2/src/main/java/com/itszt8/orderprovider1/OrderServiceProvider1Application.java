package com.itszt8.orderprovider1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OrderServiceProvider1Application {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceProvider1Application.class, args);
	}

}
