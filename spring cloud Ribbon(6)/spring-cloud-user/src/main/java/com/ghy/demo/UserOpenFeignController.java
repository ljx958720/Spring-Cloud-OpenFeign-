package com.ghy.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserOpenFeignController {
    @Resource
    UserOpenFeign userOpenFeign;

    @GetMapping("/userOpenFeign")
    public String userOpenFeign(){

        return  userOpenFeign.getAllOrder();
    }
}
