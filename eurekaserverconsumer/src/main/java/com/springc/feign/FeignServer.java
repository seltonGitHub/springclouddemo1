package com.springc.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by JZC on 2019/9/17.
 */
@FeignClient("SPRING-CLOUD--PROVICER")
public interface FeignServer {

    @GetMapping("/user")
    public String getUser();
}
