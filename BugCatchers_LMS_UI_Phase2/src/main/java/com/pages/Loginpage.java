package com.pages;

import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.factory.DriverFactory;
import com.util.ConfigReader;



public class Loginpage{
	
	public WebDriver driver;
	String Text1="LMS - Learning Management System";
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		}

	@FindBy(xpath= "//input[@id='username']")
	WebElement  Username ;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement  Password ;
	
	
	@FindBy(xpath = "//button[@id='login']")
	WebElement login;

	@FindBy(xpath = "//span[normalize-space()='LMS - Learning Management System']")
	WebElement Header;
		
	public String validatepagetitle() { 
	  System.out.println(driver.getTitle());
	  return driver.getTitle();
	}
		
	public void userpassword(String User,String Password1)
	{
		Username.sendKeys(User);
		Password.sendKeys(Password1);
	}
	
	public void Login()
	{
		login.click();
	}
	
	public void validateheader()
	{    String Text=Header.getText();
		 Assert.assertEquals(Text1,Text);
	}

	
	}


