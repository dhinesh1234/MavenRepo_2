package com.java.spring.core.spring_core_example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	public static void main(String[] args) {
		/*Resource r = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		
		//A a = factory.getBean("proxy", A.class);
		//System.out.println("proxy class name:"+a.getClass().getName());
		//a.m();
		Validator validator = factory.getBean("proxy", Validator.class);
		try {
			validator.validate(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("inside catch...");
			e.printStackTrace();
		}*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Operation e = (Operation)context.getBean("opBean");
		System.out.println("calling validate...");
		try {
			e.validate(18);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println("calling validate again...");
		try {
			e.validate(11);
		} catch (Exception e1) {
			System.out.println("inside catch...");
			// TODO Auto-generated catch block
			//e1.printStackTrace();
			System.out.println(e1);
		}
	}
}
