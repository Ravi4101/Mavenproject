package com.Mavenproject;

import org.openqa.selenium.WebDriver;

public class TestngRunnerClass {
	static WebDriver driver;
	public static void main(String[] args) {
		LoginpageOpenMrs one  = new LoginpageOpenMrs (driver);
		
		one.login();
	}
   
}


