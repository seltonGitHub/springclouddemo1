package com.itszt.eurekaconsumer1.feigh;

<<<<<<< HEAD
import com.itszt.eurekaconsumer1.feigh.hystrix.feignServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "SPRING-CLOUD-EUREKA-PROVIDER",fallback = feignServiceImpl.class)
=======
import com.itszt.eurekaconsumer1.feigh.hystrix.FeighServerImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "SPRING-CLOUD-ZUUL", fallback = FeighServerImpl.class)
>>>>>>> ebb7bc7f7038aa2ae11ffff6e327f7132a8672cf
public interface FeignServer {

    @GetMapping("/provider/user")
    String getUser();
}
