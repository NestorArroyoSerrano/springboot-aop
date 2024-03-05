package com.nestor.curso.springboot.app.aop.springbootaop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GreetingServicePointcuts {

    @Pointcut("execution(* com.nestor.curso.springboot.app.aop.springbootaop.services.GreetingService.*(..))")
    private void greetingLoggerPointCut() {

    }
    @Pointcut("execution(* com.nestor.curso.springboot.app.aop.springbootaop.services.GreetingService.*(..))")
    private void greetingFooLoggerPointcut() {

    }
}
