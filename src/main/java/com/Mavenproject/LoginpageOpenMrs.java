package com.Mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginpageOpenMrs extends BaseClass implements OpenMrsInterface  {
	WebDriver driver;
	@FindBy(id = username_id)
	private WebElement username;

	@FindBy(id = password_id)
	private WebElement password;

	@FindBy(xpath = Location_xpath)
	private WebElement location;

	@FindBy(id = Login_id)
	private WebElement login;

	public LoginpageOpenMrs( WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
       public void login() {
    	  launchbrowser("Chrome"); 
    	  urllaunch("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");
       }
	

	}


