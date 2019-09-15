package com.itszt.zuulbalance1.feign;

import com.itszt8.baseclouddemo.entities.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("SPRING-CLOUD-USERPROVIDER1")
public interface IUserProviderFeign {
    @GetMapping("/user/{userId}")
    User getUser(@PathVariable("userId") String userId);
}
