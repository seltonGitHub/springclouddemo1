package com.springc.feign.hystrix;

import com.springc.feign.FeignServer;
import org.springframework.stereotype.Component;

/**
 * Created by JZC on 2019/9/17.
 */
@Component
public class FeignServerImpl implements FeignServer {
    @Override
    public String getUser() {


        return "熔断器work";
    }
}
