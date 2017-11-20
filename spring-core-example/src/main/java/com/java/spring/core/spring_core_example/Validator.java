package com.java.spring.core.spring_core_example;

public class Validator {
	public void validate(int age) throws Exception {
		if(age < 18){
			throw new ArithmeticException("Not valid age");
		} else {
			System.out.println("vote confirmed");
		}
	}
}
