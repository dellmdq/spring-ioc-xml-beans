package com.luv2code.springdemo;

public class SoccerCoach implements Coach {
	
	private SuperFortuneService theSuperFortuneService;
	
	public SoccerCoach() {
		System.out.println("Inside SoccerCoach no-arg constructor");
	}

	public SoccerCoach(SuperFortuneService theSuperFortuneService) {
		System.out.println("Inside SoccerCoach constructor");
		this.theSuperFortuneService = theSuperFortuneService;
	}



	//setter to inject dependency
	public void setTheSuperFortuneService(SuperFortuneService theSuperFortuneService) {
		System.out.println("Inside SoccerCoach SuperFortune setter: injecting dependency...");
		this.theSuperFortuneService = theSuperFortuneService;
	}

	
	//methods
	@Override
	public String getDailyWorkOut() {
		return "Warm up for 10 minutes and then 20 minutes of dribbling practice";
	}

	@Override
	public String getDailyFortune() {
		return this.theSuperFortuneService.getFortune();//using methods from injected dependency

	}
		
}
	
