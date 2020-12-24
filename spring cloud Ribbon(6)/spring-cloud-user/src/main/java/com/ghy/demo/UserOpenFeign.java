package com.ghy.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("spring-cloud-server")
public interface UserOpenFeign {
    @GetMapping("/orders")
    public String getAllOrder();
}
