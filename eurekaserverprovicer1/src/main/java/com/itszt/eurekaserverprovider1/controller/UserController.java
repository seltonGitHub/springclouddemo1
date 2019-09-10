package com.itszt.eurekaserverprovider1.controller;

import com.itszt.eurekaserverprovider1.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public String getUser() {
        return "hello user.";
    }

}
