package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean!!
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		SoccerCoach theSoccerCoach = context.getBean("mySoccerCoach", SoccerCoach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(theCoach.getDailyFortune());
		
		//call our new methods to get the literal values
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		
		//call random super fortune on soccer coach class
		System.out.println(theSoccerCoach.getDailyFortune());
		
		
		//close context.
		context.close();

	}

}
