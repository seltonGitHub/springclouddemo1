package com.itszt.eurekaconsumer1.feigh;

import com.itszt.eurekaconsumer1.feigh.hystrix.FeighServerImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "SPRING-CLOUD-ZUUL", fallback = FeighServerImpl.class)
public interface FeignServer {

    @GetMapping("/provider/user")
    String getUser();
}
