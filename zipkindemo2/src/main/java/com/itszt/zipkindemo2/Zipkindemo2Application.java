package com.itszt.zipkindemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin2.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class Zipkindemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Zipkindemo2Application.class, args);
	}

}
