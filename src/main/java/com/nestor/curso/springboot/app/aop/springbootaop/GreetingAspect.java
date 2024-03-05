package com.nestor.curso.springboot.app.aop.springbootaop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GreetingAspect {


    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before("execution(* com.nestor.curso.springboot.app.aop.springbootaop.services.GreetingService.*(..))")
    public void loggerBefore(JoinPoint joinPoint) {

        String method = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        logger.info("Antes: " + method + " con los argumentos " + args);
    }

    @After("execution(* com.nestor.curso.springboot.app.aop.springbootaop.services.GreetingService.*(..))")
    public void loggerAfter(JoinPoint joinPoint) {

        String method = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        logger.info("Despues: " + method + " con los argumentos " + args);
    }

    @AfterReturning("execution(* com.nestor.curso.springboot.app.aop.springbootaop.services.GreetingService.*(..))")
    public void loggerAfterReturning(JoinPoint joinPoint) {

        String method = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        logger.info("Despues de retornar: " + method + " con los argumentos " + args);
    }
    @AfterThrowing("execution(* com.nestor.curso.springboot.app.aop.springbootaop.services.GreetingService.*(..))")
    public void loggerAfterThrowing(JoinPoint joinPoint) {

        String method = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        logger.info("Despues de lanzar la excepcion: " + method + " con los argumentos " + args);
    }

    @Around("execution(* com.nestor.curso.springboot.app.aop.springbootaop.services.*.*(..))")
    public Object loggerAround(ProceedingJoinPoint joinPoint) {

        String method = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());


        Object result = null;
        try {
            result = joinPoint.proceed();

            
            return result;
        } catch (Throwable e) {
           
        }
        return result;
    }
    
    
}
