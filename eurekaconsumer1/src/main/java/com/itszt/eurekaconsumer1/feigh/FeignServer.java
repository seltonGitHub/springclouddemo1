package com.itszt.eurekaconsumer1.feigh;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("SPRING-CLOUD-EUREKA-PROVIDER")
public interface FeignServer {

    @GetMapping("/user")
    String getUser();
}
