package com.springc.comtroller;

import com.springc.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by JZC on 2019/9/16.
 */
@RestController
public class UserController {


    @GetMapping("/user")
    public String getUser(){

        return "xiaoming";
    }
}
