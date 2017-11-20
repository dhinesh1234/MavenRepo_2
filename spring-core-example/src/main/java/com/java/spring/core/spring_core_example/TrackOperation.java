package com.java.spring.core.spring_core_example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

//@Aspect
public class TrackOperation {

	//@Pointcut("execution(* Operation.*(..))")
	//public void k(){}//pointcut name
	
	/*@AfterReturning( pointcut = "execution(* Operation.*(..))", returning="result")
	public void myadvice(JoinPoint jp, Object result)
	{
		System.out.println("additional concern");
		System.out.println("Method Signature: "+jp.getSignature());
		System.out.println("Result in advice: "+result);
		System.out.println("end of after returning advice...");
	}*/
	
	/*@Pointcut("execution(* Operation.*(..))")
	public void abcPointcut(){}
	*/
	/*@Around("abcPointcut()")
	public Object myadvice(ProceedingJoinPoint pjp) throws Throwable
	{
		System.out.println("Additional Concern Before calling actual method");
		Object obj = pjp.proceed();
		System.out.println("Additional Concern After calling actual method");
		return obj;
	}*/
	
	/*@AfterThrowing(pointcut="abcPointcut()", throwing="error" )
	
	public void myadvice(JoinPoint jp, Throwable error)
	{
		System.out.println("additional concern");
		System.out.println("Method Signature: "+jp.getSignature());
		System.out.println("Exception is: "+ error);
		System.out.println("end of after throwing advice...");
	}*/
	
	public void myadvice(JoinPoint jp, Throwable error)
	{
		System.out.println("additional concern");
		System.out.println("Method Signature: "+jp.getSignature());
		System.out.println("Exception is: "+error);
		System.out.println("end of after throwing advice...");
	}
}
