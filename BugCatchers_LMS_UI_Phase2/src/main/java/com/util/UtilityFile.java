package com.util;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilityFile {
	
	/*
	 * Wait for the element to be clickable ignoring the StaleElementReferenceException
	 */
	public boolean waitForElementToBeClickableBool(WebDriver    driver, By attributeValue, Duration waitTime) {	
		boolean flag = false;
		try{
			new WebDriverWait(driver, waitTime).ignoring(StaleElementReferenceException.class)
					.until(ExpectedConditions.elementToBeClickable(attributeValue));
			flag=true;
			return flag;
			
		}catch(Exception Ex){
			return flag;
		}
	}
	
	/*
	 * Wait for the Alert present ignoring the StaleElementReferenceException
	 */
	public boolean waitForAlertPresent(WebDriver driver, Duration waitTime) {
		boolean flag = false;
		new WebDriverWait(driver, waitTime).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.alertIsPresent());
		try{
			driver.switchTo().alert();
			return flag = true;
		}catch(Exception Ex){
			return flag;
		}
	}
	
	/*
	 * Wait for the element to be visible ignoring the StaleElementReferenceException
	 */
	/**
	 * This method is used to wait for element till visibility of element.
	 * 
	 * @param driver
	 * @param attributeValue
	 *            - provide locator value of element till it is visible on
	 *            application and then click that element.
	 * @param waitTime
	 *            - provide maximum wait time in seconds for driver
	 */
	public boolean waitForElementToBeVisible(WebDriver driver, By attributeValue, Duration waitTime) {
		boolean flag = false;
		try {
			new WebDriverWait(driver, waitTime).ignoring(StaleElementReferenceException.class)
					.until(ExpectedConditions.visibilityOfElementLocated(attributeValue));
			flag=true;
			return flag;
		} catch (Exception Ex) {
			return flag;
		}
	}
	
	/*
	 * Switch to another Frame
	 */
	/**
	 * This method is to Switch to an iframe
	 * 
	 * @param driver
	 * @param attributeValue-This
	 *            is the unique attribute of the frame to be switched
	 */
	public void switchToFrame(WebDriver driver, By attributeValue) {		
		try {
			if (waitForElementToBePresentBool(driver, attributeValue, maxTimeout)) {
				String iframe =driver.findElement(attributeValue);
				driver.switchTo().frame(iframe);
							System.out.println("Switched to frame");
			} else {
							System.out.println("Frame not found");
			}
		} catch (Exception Ex) {
			System.out.println("Exception occured");
			}
}
	
	/**
	 * This method is to Switch to an default iframe
	 * 
	 * @param driver
	 * @param attributeValue-This
	 *            is the unique attribute of the frame to be switched
	 */
	public void switchToDefaultFrame(WebDriver driver) {
		try {
			driver.switchTo().defaultContent();
			
		} catch (Exception Ex) {
			System.out.println("Exception occured");
		}
	}
	
	
	/*
	 * Move to Element and Click Action in Selenium
	 */
	public void MouseClickActionMoveToElement(WebDriver driver, By attributeValue, Duration maxTimeout) {
		try {
			if 
//The below method is defined above
(waitForElementToBeClickableBool(driver, attributeValue, maxTimeout)) {
				WebElement element = driver.findElement(attributeValue);
				//element.click();
				Actions builder = new Actions(driver);
				builder.moveToElement(element).click().build().perform();
                System.out.println("Able to locate and click to element !");
				
			} else {
				System.out.println("Not able to locate the element !");
			}
		} catch (Exception Ex) {
			System.out.println("Exception occured");
		}
	}
	/*
	 * Get text from the element and return as string
	 */
		public String getTextFromElement(WebDriver driver, By locator) {
			String text = null;
			try {
				if (waitForElementToBePresentBool(driver, locator, maxTimeout)) {
					WebElement element = driver.findElement(locator);
					text = element.getText();
	System.out.println("Element Text is: "+ text);
					
				} else {
	System.out.println("Element not present !");
					
				}
			} catch (Exception Ex) {
	System.out.println("Exception occured");
				
			}
			return text;
		}
		
	/*
	 * Get current system time
	 */
		/**
		 * @Method:getcurrenttime This method is used to return system time in
		 *                        seconds.
		 */
		public static int getcurrenttime() {
			long currentDateMS = new Date().getTime();
			int seconds = (int) ((currentDateMS / 1000) % 3600);
			return seconds;
		}
		
		
	/*
	 * Close all windows except parent
	 */
		/**
		 * @Method:closeAllOtherWindows - This method is used to close all open
		 *                              windows except parent window.
		 * @param driver
		 * @return
		 * @throws InterruptedException
		 */
		public static boolean closeAllOtherWindows(WebDriver driver) throws InterruptedException {
			String Parent_Window = driver.getWindowHandle();
			java.util.Set<String> allWindowHandles = driver.getWindowHandles();
			for (String currentWindowHandle : allWindowHandles) {
				if (!currentWindowHandle.equals(Parent_Window)) {
					driver.switchTo().window(currentWindowHandle);
					driver.close();
					Thread.sleep(2000);
				}
			}
			driver.switchTo().window(Parent_Window);
			if (driver.getWindowHandles().size() == 1)
				return true;
			else
				return false;
		}
	
	/*
	 * Select a value in dropdown by Text
	 */
		/**
		 * This method is for simple dropdown selection by visibleText
		 * 
		 * @param driver
		 * @param dropDownID-This
		 *            is the unique attribute to find an dropdownelement
		 * @param dropDownValue-This
		 *            is the text to search in dropdown
		 */
		public static void dropDownSelectionByText(WebDriver driver, By dropDownID, String dropDownValue) {
			try {
				WebElement element = null;
				new WebDriverWait(driver, 5).ignoring(StaleElementReferenceException.class)
						.until(ExpectedConditions.elementToBeClickable(dropDownID));
				element = driver.findElement(dropDownID);
				Select dropDown = new Select(element);
				dropDown.selectByVisibleText(dropDownValue);
			}
			catch (StaleElementReferenceException ex) {
				System.out.println("Exception while selecting a value from dropdown" + ex.getMessage());
			}
		}
	
	/*
	 * Select a value in dropdown by Value
	 */
		/**
		 * This method is for simple dropdown selection by value
		 * 
		 * @param driver
		 * @param dropDownID-This
		 *            is the unique attribute to find an dropdownelement
		 * @param dropDownValue-This
		 *            is the text to search in dropdown
		 */
		public static void dropDownSelectionByValue(WebDriver driver, By dropDownID, String dropDownValue) {
			try {
				WebElement element = null;
				new WebDriverWait(driver, 5).ignoring(StaleElementReferenceException.class)
						.until(ExpectedConditions.elementToBeClickable(dropDownID));
				element = driver.findElement(dropDownID);
				Select dropDown = new Select(element);
				dropDown.selectByValue(dropDownValue);
			}
			catch (StaleElementReferenceException ex) {
				System.out.println("Exception while selecting a value from dropdown" + ex.getMessage());
			}
		}
	
	/*
	 * Select a value in dropdown by Index
	 */
		/**
		 * This method is for simple dropdown selection by index
		 * 
		 * @param driver
		 * @param dropDownID-This
		 *            is the unique attribute to find an dropdownelement
		 * @param dropDownValue-This
		 *            is the text to search in dropdown
		 */
		public static void dropDownSelectionByIndex(WebDriver driver, By dropDownID, int dropDownValue) {
			try {
				WebElement element = null;
				new WebDriverWait(driver, 5).ignoring(StaleElementReferenceException.class)
						.until(ExpectedConditions.elementToBeClickable(dropDownID));
				element = driver.findElement(dropDownID);
				Select dropDown = new Select(element);
				dropDown.selectByIndex(dropDownValue);
			}
			catch (StaleElementReferenceException ex) {
				System.out.println("Exception while selecting a value from dropdown" + ex.getMessage());
			}
		}
		
	/*
	 * This function will fetch message on Pop-up
	 */
		public static String getPopupMessage(final WebDriver driver) {
			String message = null;
			try {
			Alert alert = driver.switchTo().alert();
			message = alert.getText();
			alert.accept();
			} catch (Exception e) {
			message = null;
			}
			System.out.println("message"+message);
			return message;
			}
		
	/*
	 * This function will Canceling pop-up in Selenium-WebDriver
	 */
		public static String cancelPopupMessageBox(final WebDriver driver) {
			String message = null;
			try {
			Alert alert = driver.switchTo().alert();
			message = alert.getText();
			alert.dismiss();
			} catch (Exception e) {
			message = null;
			}
			return message;
			}
	
	/*
	 * Inserting string in Text Field in Selenium-WebDriver
	 */
		public static void insertText(WebDriver driver, By locator, String value) {
			WebElement field = driver.findElement(locator);
			field.clear();
			field.sendKeys(value);
			}
	
	/*
	 * Reading ToolTip text in in Selenium-WebDriver
	 */
		public static String tooltipText(WebDriver driver, By locator){
			String tooltip = driver.findElement(locator).getAttribute("title");
			return tooltip;
			}
	
	/*
	 * Selecting Radio Button in Selenium-WebDriver
	 */
		public static void selectRadioButton(WebDriver driver, By locator, String value){ List<WebElement> select = driver.findElements(locator);
		for (WebElement element : select)
		{
		if (element.getAttribute("value").equalsIgnoreCase(value)){
		element.click();
		}
		}
	
		}
		
		/*
		 * Selecting Dropdown in Selenium-WebDriver
		 */
		public static void selectDropdown(WebDriver driver, By locator, String value){
			new Select (driver.findElement(locator)).selectByVisibleText(value); }
		
		/*
		 * Selecting searched dropdown in Selenium-WebDriver
		 */
		public static void selectSearchDropdown(WebDriver driver, By locator, String value){
			driver.findElement(locator).click();
			driver.findElement(locator).sendKeys(value);
			driver.findElement(locator).sendKeys(Keys.TAB);
			}
}
