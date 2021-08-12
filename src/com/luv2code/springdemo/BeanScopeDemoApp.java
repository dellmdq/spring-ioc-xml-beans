package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load the spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//get bean from container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//check if they are the same
		boolean result = (theCoach == alphaCoach);
		
		//print out results
		System.out.println("\nPointing to the same object: " + result);
		System.out.println("\nMemory location for theCoach: " + theCoach);
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach);
	
		
		System.out.println("\nPractice activity. Scope.");
		//get bean from container
		Coach theSoccerCoach = context.getBean("mySoccerCoach", Coach.class);
		
		Coach alphaSoccerCoach = context.getBean("mySoccerCoach", Coach.class);
		
		//check if they are the same
		boolean result2 = (theSoccerCoach == alphaSoccerCoach);
		
		//print out results
		System.out.println("\nPointing to the same object: " + result2);
		System.out.println("\nMemory location for theCoach: " + theSoccerCoach);
		System.out.println("\nMemory location for alphaCoach: " + alphaSoccerCoach);
		
		//close context
		context.close();
	}

}
