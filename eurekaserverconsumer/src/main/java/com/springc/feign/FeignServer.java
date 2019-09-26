package com.springc.feign;

import com.springc.feign.hystrix.FeignServerImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by JZC on 2019/9/17.
 */
@FeignClient(value = "SPRING-CLOUD--ZUUL",fallback = FeignServerImpl.class)
public interface FeignServer {

    @GetMapping("/provider/user")
    public String getUser();
}
