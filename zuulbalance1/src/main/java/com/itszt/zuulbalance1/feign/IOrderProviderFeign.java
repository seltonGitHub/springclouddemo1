package com.itszt.zuulbalance1.feign;

import com.itszt8.baseclouddemo.entities.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient("SPRING-CLOUD-ORDERPROVIDER1")
public interface IOrderProviderFeign {

    @GetMapping("/order/{userId}")
    Order getOrder(@PathVariable("userId") String userId);
}
