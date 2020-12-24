package com.ghy.demo.FeignClientsRegistrarDemo;


import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class FeignClientsRegistrarDemo implements ImportBeanDefinitionRegistrar {


    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        //通过多态构建一个Bean
        BeanDefinition beanDefinition=new GenericBeanDefinition();
        //设置Bean的名称
        beanDefinition.setBeanClassName(Demo.class.getName());
        registry.registerBeanDefinition("Demo",beanDefinition);
    }
}
