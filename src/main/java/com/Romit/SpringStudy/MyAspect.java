package com.Romit.SpringStudy;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
//    @Pointcut("execution(* com.Romit.SpringStudy.Service.UserServiceImpl.printUser(..))")
//    private void selectAll(){}
//
//    @Before("execution(* com.Romit.SpringStudy.Service.UserServiceImpl.printUser(..))")
//    public void beforeAdvice(){
//        System.out.println("before之前");
//
//    }
//
//    @After("selectAll()")
//    public void afterAdvice(){
//
//        System.out.println("after之后");
//    }
    /**
     * This is the method which I would like to execute
     * when any method returns.
     */

}
