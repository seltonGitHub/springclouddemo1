package com.itszt.eurekaconsumer1.feigh;

import com.itszt.eurekaconsumer1.feigh.hystrix.feignServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "SPRING-CLOUD-EUREKA-PROVIDER",fallback = feignServiceImpl.class)
public interface FeignServer {

    @GetMapping("/user")
    String getUser();
}
