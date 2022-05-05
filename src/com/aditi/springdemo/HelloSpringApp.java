package com.aditi.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//load Spring Configuration File
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve bean from spring Container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//Call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//let's call new method for fortune
		System.out.println(theCoach.getDailyFortune());
		
		//Close the context
		context.close();

	}

}
