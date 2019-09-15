package com.itszt.eurekaconsumer1.feigh.hystrix;

import com.itszt.eurekaconsumer1.feigh.FeignServer;
import org.springframework.stereotype.Component;

@Component
public class feignServiceImpl implements FeignServer {

    @Override
    public String getUser() {
        return "断路器——————work";
    }
}
