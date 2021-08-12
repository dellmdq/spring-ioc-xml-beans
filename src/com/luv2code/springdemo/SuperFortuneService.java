package com.luv2code.springdemo;

import java.util.Random;

public class SuperFortuneService implements FortuneService {
	
	private String fortuneArray[];

	
	public SuperFortuneService() {
		this.fortuneArray = new String[] {
				"This is your lucky day",
				"Be carefull it may be not your best day", 
				"Go and give it all luck is for losers!"};
	}
	
	@Override
	public String getFortune() {
		System.out.println("Array length: " + fortuneArray.length);
		Random randomIndex = new Random();
		return fortuneArray[randomIndex.nextInt(fortuneArray.length)];
	}

}
