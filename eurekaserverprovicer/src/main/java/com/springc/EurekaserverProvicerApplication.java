package com.springc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaClient //提供服务的注解
public class EurekaserverProvicerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaserverProvicerApplication.class, args);
	}

}
