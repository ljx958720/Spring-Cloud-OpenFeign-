package com.ghy.demo;

import com.ghy.demo.FeignClientsRegistrarDemo.Demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import com.ghy.demo.FeignClientsRegistrarDemo.EnableFeignClientsRegistrar;

@EnableFeignClientsRegistrar
@EnableFeignClients
@ComponentScan(basePackages = "com.ghy")
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext contxt=SpringApplication.run(DemoApplication.class, args);
        System.out.println(contxt.getBean(Demo.class));
       // SpringApplication.run(DemoApplication.class, args);
    }

}
