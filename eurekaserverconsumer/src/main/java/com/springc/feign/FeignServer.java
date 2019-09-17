package com.springc.feign;

import com.springc.feign.hystrix.FeignServerImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by JZC on 2019/9/17.
 */
@FeignClient(value = "SPRING-CLOUD--PROVICER",fallback = FeignServerImpl.class)
public interface FeignServer {

    @GetMapping("/user")
    public String getUser();
}
