package com.pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.jsoup.internal.FieldsAreNonnullByDefault;
import org.junit.experimental.categories.Category;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ManageUserPage {
	
	public String user = "LMS";
	public String pwd = "LMS";
	public String LMS_url= "https://lms-frontend-phase2.herokuapp.com/";
	public String ManageUser_url = "https://lms-frontend-phase2.herokuapp.com/user";
	
	
	//1.Web Elements on Manage User page
	WebDriver driver = null;
	@FindBy(id="username") @CacheLookup WebElement username;
	@FindBy(id="password") @CacheLookup WebElement password;
	@FindBy(css="span.mat-button-wrapper") @CacheLookup WebElement login_button;
	@FindBy(xpath="//button[@routerlink='/user']") @CacheLookup WebElement user_tab;
	@FindBy (xpath="//div[contains(@class,'p-d-flex')]") @CacheLookup WebElement footerText;
	@FindBy (xpath="//p-sorticon[@ng-reflect-field='phoneNumber']") @CacheLookup WebElement sort_icon;
	@FindBy (xpath="//tr[@class='ng-star-inserted']/td[5]") @CacheLookup List<WebElement> contacts;
	@FindBy (xpath="//div[contains(@class,'p-checkbox-box')]") @CacheLookup List<WebElement> userid_checkbox;
	@FindBy (xpath="//div[@class='box']/div[1]/button[1]") @CacheLookup WebElement header_delete_icon;
	@FindBy(xpath="//div[contains(@class,'p-confirm-dialog')]") @CacheLookup WebElement confirm_delete;
	@FindBy (xpath="//div[contains(@class,'p-confirm-dialog')]/div/div")@CacheLookup WebElement closeX_icon;
	@FindBy(xpath="//div[contains(@class,'p-checkbox-box')]")@CacheLookup WebElement single_user_checkbox;
    @FindBy (xpath="//div[contains(@class,'p-confirm-dialog')]/div[3]/button[2]") @CacheLookup WebElement confirm_Yes;
    @FindBy (xpath="//button[contains(@class,'p-paginator-page')]") @CacheLookup WebElement userpagecount;
    @FindBy (xpath="//button[contains(@class,'p-paginator-next')]") @CacheLookup WebElement nextpage;
    @FindBy (xpath="//button[contains(@class,'p-paginator-prev')]") @CacheLookup WebElement previouspage;
    @FindBy (xpath="//button[contains(@class,'p-paginator-last')]") @CacheLookup WebElement lastpage;
    @FindBy (xpath="//button[contains(@class,'p-paginator-first')]") @CacheLookup WebElement firstpage;
    @FindBy (xpath="//table[@role='grid']//td[8]/div/span[2]/button") @CacheLookup WebElement delete_userRow_icon;
    @FindBy (xpath="//table[@role='grid']//td[8]/div/span[1]/button") @CacheLookup WebElement edit_userRow_icon;
    @FindBy (xpath="//div[@role='dialog']") @CacheLookup WebElement edit_userDetails_Dialog;
	@FindBy (xpath="//span[@class='p-input-icon-left']//input") @CacheLookup WebElement search_box;
	@FindBy (xpath="//span[contains(@class,'p-paginator-current')]") @CacheLookup WebElement search_count;
	@FindBy (xpath="//div[@role='dialog']//span[@class='p-button-label']") @CacheLookup WebElement cancel_dialog;
	@FindBy (xpath="//button[contains(@class,'p-button-link')]") @CacheLookup WebElement userid_link;
	@FindBy (xpath="//button[@label='Add New User']") @CacheLookup WebElement add_NewUser_button;
	@FindBy(xpath = "//div[contains(@class,'p-toast-summary ng-tns-c90')]") WebElement successMsg;
	@FindBy (xpath = "//div[4]//span[@class='mat-button-wrapper']") WebElement add_AptAddress_button;
	@FindBy (xpath="//textarea[@ng-reflect-name='address2']") WebElement address2_textbox;
    @FindBy (xpath="//div[contains(@class,'p-dialog-content')]/form//div[5]//div[contains(@class,'mat-select-arrow-wrapper')]") 
    WebElement expand_state_dropdown;
    @FindBy (xpath="//div[contains(@class,'p-dialog-content')]/form//div[7]//div[contains(@class,'mat-select-arrow-wrapper')]")
    WebElement expand_role_dropdown;
    @FindBy (xpath = "//span[@class='mat-option-text']") List<WebElement> list_of_states;
    
    @FindBy (xpath="//mat-option[@ng-reflect-value='Staff']") WebElement select_role_from_dropdown;
    @FindBy (xpath="//mat-option[@id='mat-option-4']") WebElement select_state_from_dropdown;
    @FindBy(xpath = "//div[contains(@class,'p-toast-detail ng-tns-c90')]") WebElement deleteMsg;
    @FindBy (xpath="//button[contains(@class,'mat-primary')]") WebElement submit_button;
    @FindBy (xpath="//button[contains(@class,'mat-warn')]/span") WebElement cancel_userDetails_button;
    @FindBy (xpath="//div[@class='p-dialog-header-icons ng-tns-c132-6']/button") WebElement cancel_userDetails_icon;
    @FindBy (xpath="//input[@formcontrolname='postalCode']") WebElement postalCode_inputbox;
    @FindBy (xpath="//input[@formcontrolname='firstName']") WebElement firstName;
    @FindBy (xpath="//input[@formcontrolname='middleName']") WebElement middleName;
    @FindBy (xpath="//input[@formcontrolname='lastName']") WebElement lastName;
    @FindBy (xpath="//input[@formcontrolname='emailAddress']") WebElement email;
    @FindBy (xpath="//input[@formcontrolname='phoneNumber']") WebElement phone;
    @FindBy (xpath="//textarea[@formcontrolname='address']") WebElement address;
    @FindBy (xpath="//input[@formcontrolname='city']") WebElement city;
    @FindBy (xpath="//input[@formcontrolname='program']") WebElement program;
    @FindBy (xpath="//input[@formcontrolname='ugProgram']") WebElement ugprogram;
    @FindBy (xpath="//input[@formcontrolname='pgProgram']") WebElement pgprogram;
    @FindBy (xpath="//input[@formcontrolname='skill']") WebElement skill;
    @FindBy (xpath="//input[@formcontrolname='experience']") WebElement experience;
    @FindBy (xpath="//input[@formcontrolname='visaStatus']") WebElement visa;
    @FindBy (xpath="//input[@formcontrolname='batch']") WebElement batch;
    @FindBy (xpath="//input[@formcontrolname='comments']") WebElement comments;
    @FindBy (xpath="//input[@formcontrolname='userName']") WebElement userName;
    @FindBy (xpath="//input[@formcontrolname='password']") WebElement form_pwd;
    @FindBy (xpath="//input[@formcontrolname='fileType']") WebElement filetype;
	
	//2.constructor of the page class
		public ManageUserPage (WebDriver driver) {
			this.driver=driver;
			try {
				
				PageFactory.initElements(driver, this);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			}
		
	//3. Actions on Web Elements
		//Enter username, password and click Login button
		public void Login(String user,String pwd) {
			username.clear();
			username.sendKeys(user);
			password.clear();
			password.sendKeys(pwd);
			login_button.click();
		}
		
		//Click User tab on LMS page
		public void click_userTab() {
			user_tab.click();
		}
		//Get current url
		public String getURL() {
			return driver.getCurrentUrl();
		}
		
		//Verify footer text
		public void check_footerText() {
			if(footerText.isDisplayed()) 
				
			System.out.println("Footer text displayed under User Table : "+footerText.getText());			
		}
		
		public void sort_Contacts() {
			int size = contacts.size();
			List<String> contactBeforeSort = new ArrayList();
	        List<String> contactAfterSort = new ArrayList();
	        
	        sort_icon.click();
	        //Add contacts to the list after sort
	        for(int i=0;i<size;i++) {
	        	contactBeforeSort.add(contacts.get(i).getText());
	        	contactAfterSort.add(contacts.get(i).getText());
	        }
	        
	        Collections.sort(contactBeforeSort);
	        
	        for(int i=0;i<size;i++) {
	        	System.out.println("Contact Before Sort : "+contactBeforeSort.get(i)+" Contact After Sort : "+contactAfterSort.get(i));
	        	if((contactBeforeSort.get(i).equals(contactAfterSort.get(i)))){
	        		
	            	System.out.println("Contact not sorted: "+i);
	            	
	            }
	        	else
	        		System.out.println("Contacts are sorted");
	        }
	       
	        
	        
		}
		
		public void check_userid_Checkbox() {
			
			userid_checkbox.get(0).click();
			
			for(int i=0;i<userid_checkbox.size();i++) {
				if(userid_checkbox.get(i).isSelected())
					System.out.println("User id checkbox is unchecked");
				else
				System.out.println("All user id checkboxes are checked");
			}
        }
		
		public void uncheck_userid_Checkbox() {
			try {
			WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(userid_checkbox.get(0)));
			userid_checkbox.get(0).click();}
			catch(Exception e) {
				System.out.println("User id Checkbox is not clickable");
			}
			for(int i=0;i<userid_checkbox.size();i++) {
				if(userid_checkbox.get(i).isSelected())
					System.out.println("User id checkbox is checked");
				else
				System.out.println("All user id checkboxes are unchecked");
			}
		}
		
		public void verify_header_Delete_Icon() {
			if(header_delete_icon.isEnabled())
				System.out.println("Delete icon is enabled");
			else
				System.out.println("Delete icon is disabled");
		}
		
		public void click_header_Delete_Icon() {
			header_delete_icon.click();
		}
		
		public void verify_confirm_delete() {
			if(confirm_delete.isDisplayed())
				System.out.println("Dialog box to confirm delete user id is displayed");
		}
		
		public void click_closeX_icon() {
			closeX_icon.click();
		}
		
		public void check_single_user() {
			single_user_checkbox.click();
		}
		
		public void click_Yes_Delete() {
			confirm_Yes.click();
		}
		
		public boolean checkPagination() {
			String pageCount = userpagecount.getText();
			System.out.println("Manage User page count : "+pageCount);
			if(Integer.valueOf(pageCount)>1) {
				if(nextpage.isEnabled()&& previouspage.isEnabled()&&lastpage.isEnabled()&&firstpage.isEnabled()) {
					return true;
				}
				else
					return false;
			}
			return false;
		}
		
		public void clickNextPage() {
			
			if(checkPagination()==true) {
				nextpage.click();
			}
		}
		
        public void clickPreviousPage() {
			
			if(checkPagination()==true) {
				previouspage.click();
			}
		}
        
        public void deleteUserRow() throws InterruptedException {
        	Thread.sleep(1000);
        	delete_userRow_icon.click();
        }
        
        public void editUserRow() throws InterruptedException {
        	Thread.sleep(1000);
        	edit_userRow_icon.click();
        }
        public boolean edit_userDetails_display() {
        	if(edit_userDetails_Dialog.isDisplayed())
        		return true;
			return false;
        }
        
        public void searchText() {
        	search_box.clear();
        	search_box.sendKeys("John");
        }
        
        public String searchResult() throws InterruptedException {
        	search_box.clear();
        	search_box.sendKeys("John");
        	Thread.sleep(500);
        	
        	if(search_count.getText().contains("0"))
        		return ("No records found : "+search_count.getText());
        	else return ("Records found : "+search_count.getText());
        	
        }
        
        public void click_userId_link() throws InterruptedException {
        	Thread.sleep(1000);
        	userid_link.click();
        }
        
        public void click_add_NewUser() throws InterruptedException {
        	Thread.sleep(500);
        	add_NewUser_button.click();
        }
        
        public String print_user_deleted_msg() {
        	return deleteMsg.getText();
        }
        
        public void click_addAptAddress_button() {
        	add_AptAddress_button.click();
        }
        
        public boolean address2_displayed() {
        	return address2_textbox.isDisplayed();
        }
        
        public void expand_state_dropdown() {
        	expand_state_dropdown.click();
        }
        
        public void expand_role_dropdown() {
        	expand_role_dropdown.click();
        }
        
        public void select_state_from_dropdown() {
        	System.out.println("No. of states in the drop down : "+ list_of_states.size());
        	select_state_from_dropdown.click();
        	System.out.println("State "+select_state_from_dropdown.getText()+" is selected from drop down");
        }
        
        public void select_role_from_dropdown() {
        	select_role_from_dropdown.click();
        	System.out.println("User Role "+select_role_from_dropdown.getText()+" is selected from dropdown");
        }
        
        public void click_submit_userDetails() throws InterruptedException {
        	Thread.sleep(1000);
        	submit_button.click();
        }
        
        public void select_dropdown(String option) {
        	switch(option) {
        	case "State":
        		expand_state_dropdown();
        		break;
        	case "User Role":
        		expand_role_dropdown();
        		break;
        	default:
        		System.out.println("Wrong option");
        		break;
        	}
        }
        
        public void select_value_from_dropdown(String option) {
        	switch(option) {
        	case "State":
        		select_state_from_dropdown();
        		break;
        	case "User Role":
        		select_role_from_dropdown();
        		break;
        	default:
        		System.out.println("Wrong option");
        		break;
        	}
        }
        
        public void cancel_userDetails(String s) throws InterruptedException {
        	switch(s) {
        	case "Cancel button":
        		Thread.sleep(1000);
        		cancel_userDetails_button.click();
        		break;
        	case "Cancel icon":
        		Thread.sleep(1000);
        		cancel_userDetails_icon.click();
        		break;
        	default:
        		System.out.println("Invalid cancel link");
        		break;
        	}
        }
        
        public boolean click_PostalCode() {
        	postalCode_inputbox.click();
        	return postalCode_inputbox.isEnabled();
        }
        
        public void enter_firstname(String name) {
        	firstName.sendKeys(name);
        }
        public void enter_lastname(String name) {
        	lastName.sendKeys(name);
        }
        public void enter_middlename(String name) {
        	middleName.sendKeys(name);
        }
        public void enter_email(String s) {
        	email.sendKeys(s);
        }
        public void enter_phone(String ph) {
        	phone.sendKeys(ph);
        }
        public void address(String adr) {
        	address.sendKeys(adr);
        }
        public void enterCity(String ct) {
        	city.sendKeys(ct);
        }
        public void enterPostalCode(String code) {
        	postalCode_inputbox.sendKeys(code);
        }
        public void enterProgram(String pg) {
        	program.sendKeys(pg);
        }
        public void enterUgProgram(String code) {
        	ugprogram.sendKeys(code);
        }
        public void enterPgProgram(String code) {
        	pgprogram.sendKeys(code);
        }
        public void enterSkill(String code) {
        	skill.sendKeys(code);
        }
        public void enterExperience(String code) {
        	experience.sendKeys(code);
        }
        public void enterVisa(String v) {
        	visa.sendKeys(v);
        }
        public void enterbatch(String v) {
             batch.sendKeys(v);
        }
        public void enterComments(String v) {
        	comments.sendKeys(v);
        }
        public void enterFiletype(String type) {
        	filetype.sendKeys(type);
        }
        public void enterUserName(String name) {
        	userName.sendKeys(name);
        }
        public void enterFormPwd(String pwd) {
        	form_pwd.sendKeys(pwd);
        }
        
        public void add_newUser_validData() throws InterruptedException {
        	Thread.sleep(1000);
    		
    		new Actions(driver).click(submit_button).perform();
        }

}
