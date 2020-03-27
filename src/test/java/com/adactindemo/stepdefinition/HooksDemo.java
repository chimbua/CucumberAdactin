package com.adactindemo.stepdefinition;

import cucumber.api.java.Before;

public class HooksDemo {
	@Before("@regressionTest")
		public void beforeScenario() {
		System.out.println("Before:===========Regression Test");
	}
	
	public void afterScenario() {
		System.out.println("After:===========Regression Test");
	}

}
