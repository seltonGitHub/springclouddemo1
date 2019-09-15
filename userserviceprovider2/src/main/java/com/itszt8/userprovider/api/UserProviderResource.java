package com.itszt8.userprovider.api;

import com.itszt8.baseclouddemo.entities.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserProviderResource {

    @GetMapping("/user/{userId}")
    public User getUser(@PathVariable("userId") String userId) {
        User user = new User();
        user.setName("name -> " + userId);
        user.setPassword("password -> " + userId);
        return user;
    }
}
