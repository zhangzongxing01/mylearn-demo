package com.netease.zzx.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.Ordered;

import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;

/**
 * Created by hzzhangzongxing on 2017/4/24.
 */
public class ApplicationIdQBankAspect implements Ordered {

    @Pointcut("execution(* com.netease.zzx.spring.aspect.*.*(..))")
    public void apiImpl() {
    }
    @Around("apiImpl()")
    public Object aroundLog(ProceedingJoinPoint joinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method=methodSignature.getMethod();
        TypeVariable<Method>[]typeVariables= method.getTypeParameters();
        for(TypeVariable TypeVariable:typeVariables ){
            TypeVariable.getName();
        }
        return  joinPoint.proceed();
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
