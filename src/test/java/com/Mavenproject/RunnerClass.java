package com.Mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RunnerClass  extends BaseClass {
	
	public static void main(String[] args) {
		 launchbrowser("chrome");
		 urllaunch("https://www.facebook.com/");
		 WebElement email = driver.findElement(By.id("email"));
		 inputValues(email,"Ravi");
		 
		 WebElement pswrd = driver.findElement(By.id("pass"));
		 inputValues(email,"Rahul@123");
		 
		 WebElement login = driver.findElement(By.id("login"));
		 clickElement(login);
		 
		 navigateto("https://www.amazon.in/");
		 
		 WebElement clickclick = driver.findElement(By.xpath("(//a[@class='nav-a'])[4]"));
		 rightclick(clickclick);
		 
}
}