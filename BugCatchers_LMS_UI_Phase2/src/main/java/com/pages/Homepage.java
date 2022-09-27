package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	

	public WebDriver driver;
	
	public Homepage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
		
	/*@FindBy(xpath ="//div[text()=' Manage Assignment']")
	WebElement ManageAssignment;*/
	
	@FindBy(xpath ="//button[@ng-reflect-router-link='/program']")
	WebElement Program;
	
	@FindBy(xpath ="//button[@ng-reflect-router-link='/batch']")
	WebElement  Batch;
	
	@FindBy(xpath ="//button[@ng-reflect-router-link='/user']") 
	WebElement User;
	
	@FindBy(xpath ="//span[@class='mat-button-wrapper' and text()='Assignment']") 
	WebElement Assignment;
	
	@FindBy(xpath ="//span[@class='mat-button-wrapper' and text()='Attendance']")
	WebElement  Attendance;
	
	@FindBy(xpath ="//button[@class='mat-focus-indicator mat-button mat-button-base ng-star-inserted']")
	WebElement  Logout;
	

   public String ProgramTextDisplay()
   {
	   Program.isDisplayed();
	   String pg=Program.getText();
	   return pg;
   }
   
   public String BatchTextDisplay()
   {
	   Batch.isDisplayed();
	   String Bt=Batch.getText();
	   return Bt;
   }
   
   public String UserTextDisplay()
   {
	   User.isDisplayed();
	   String us=User.getText();
	   return us;
   }
   
   public String AssigmentTextDisplay()
   {
	   Assignment.isDisplayed();
	   String Agn=Assignment.getText();
	   return Agn;
   }
   
   public String AttendanceTextDisplay()
   {
	   Attendance.isDisplayed();
	   String Attend=Attendance.getText();
	   return Attend;
   }
   
  public String LogoutTextDisplay()
   {
	   Logout.isDisplayed();
	   String log=Logout.getText();
	    return log;
   }
 }
