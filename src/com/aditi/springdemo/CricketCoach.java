package com.aditi.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	
	//add new fields for email and team;
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricket Coach - Inside setter method for setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Cricket Coach - Inside setter method for setTeam");
		this.team = team;
	}

	//create no-arg constructor
	public CricketCoach()
	{
		System.out.println("Cricket Coach - Inside no-arg constructor");
	}

	//setter method for setter injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket Coach - Inside setter");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice Fast Bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
