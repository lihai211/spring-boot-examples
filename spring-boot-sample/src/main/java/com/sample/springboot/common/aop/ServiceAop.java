package com.sample.springboot.common.aop;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author Lucifer
 * @create 2017-11-30
 * @Description: 切面test
 **/
@Aspect
@Component
public class ServiceAop {

    //@Before("execution(* com.example.springboot.service..*.*(..))")
    public void before() {
        System.out.println("Spring AOP");
    }
}
