package com.springc.controller;

import com.springc.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping("consumerUser")
    public User consumerUser(){

            String url="http://SPRING-CLOUD--PROVICER/user";

        HttpEntity<Object> objectHttpEntity = new HttpEntity<>("");

        ResponseEntity<User> exchange = restTemplate.exchange(url, HttpMethod.GET, objectHttpEntity, User.class);

        User body = exchange.getBody();

        return body;

    }

}
