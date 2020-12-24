package com.ghy.demo.FeignClientsRegistrarDemo;


import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(FeignClientsRegistrarDemo.class)
public @interface EnableFeignClientsRegistrar {
}
