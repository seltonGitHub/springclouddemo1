package com.itszt.eurekaconsumer1.controller;

import com.itszt.eurekaconsumer1.feigh.FeignServer;
import com.itszt.eurekaserverprovider1.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private FeignServer feignServer;

    @GetMapping("consumerUser2")
    public String consumerUser2() {
        return feignServer.getUser();
    }

    @GetMapping("consumerUser")
    public String consumerUser() {
        String url = "http://SPRING-CLOUD-EUREKA-PROVIDER/user";

        HttpEntity<Object> objectHttpEntity = new HttpEntity<>("");

        ResponseEntity<String> exchange = restTemplate.exchange(url, HttpMethod.GET, objectHttpEntity, String.class);

        String body = exchange.getBody();

        System.out.println("body = " + body);

        return body;
    }
}
