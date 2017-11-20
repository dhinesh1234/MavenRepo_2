package com.java.spring.core.spring_core_example;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvisor implements AfterReturningAdvice{

	public void afterReturning(Object returnValue, Method method, Object[] args,
			Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("additional concern after returning advice");
		System.out.println("returnValue = "+returnValue);
		System.out.println("method = "+method.getName());
		System.out.println("end of afterReturning..");
	}

	
	
}
