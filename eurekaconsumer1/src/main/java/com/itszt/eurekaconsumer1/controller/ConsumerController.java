package com.itszt.eurekaconsumer1.controller;

import com.itszt.eurekaconsumer1.feigh.FeignServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RefreshScope
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private FeignServer feignServer;

    @GetMapping("consumerUser2")
    public String consumerUser2() {
        return feignServer.getUser();
    }

    @Value("${newurl}")
    private String url;

    @GetMapping("consumerUser3")
    public String consumerUser3() {
        System.out.println("url = " + url);
        return url;
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
