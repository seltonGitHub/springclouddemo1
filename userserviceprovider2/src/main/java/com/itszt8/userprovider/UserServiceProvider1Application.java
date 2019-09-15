package com.itszt8.userprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserServiceProvider1Application {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceProvider1Application.class, args);
	}

}
