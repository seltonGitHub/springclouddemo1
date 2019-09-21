package com.springc.controller;

import com.springc.feign.FeignServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by JZC on 2019/9/16.
 */
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private FeignServer feignServer;

    @GetMapping("consumerUser1")
    public String consumerUser1(){

        return feignServer.getUser();
    }
    @Value("${newurl}")
    private String url;
    @GetMapping("consumerUser2")
    public String consumerUser2(){
        return url;
    }

    @GetMapping("consumerUser")
    public String consumerUser(){

            String url="http://SPRING-CLOUD--PROVICER/user";

        HttpEntity<Object> objectHttpEntity = new HttpEntity<>("");

        ResponseEntity<String> exchange = restTemplate.exchange(url, HttpMethod.GET, objectHttpEntity,String.class);
        String body = exchange.getBody();

        return body;

    }

}
