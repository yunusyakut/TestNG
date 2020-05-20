package com.class01;

import org.testng.annotations.*;

public class DiffAnnotations {
	
	@BeforeSuite
	
	public void beforesuite() {
		System.out.println("Before Suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
	

	@BeforeMethod//1st execution
	public void beforeMethod() {//open browser, navigate to url
		System.out.println("Before Method");
	}

	@AfterMethod//after test execution
	public void afterMethod() {//closing browser genereting reports
		System.out.println("After Method");
	}

	@Test//after before execution
	public void test() {
		System.out.println("Actual Test is running...");
	}

}
