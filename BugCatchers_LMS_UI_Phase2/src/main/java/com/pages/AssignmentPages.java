package com.pages;

import java.util.Date;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.factory.DriverFactory;

public class AssignmentPages{
	
	public WebDriver driver;
	public Actions act;
	public AssignmentPages(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
		act=new Actions(driver);
	}
	
	@FindBy(xpath ="//span[text()='Assignment']")
	WebElement  Assignment;
	
	@FindBy(xpath ="//div[text()=' Manage Assignment']")
	WebElement ManageAssignment;
	
	@FindBy(xpath ="//button[@id='new']")
	WebElement  NewAssignment;
	
	@FindBy(xpath ="//input[@class='p-inputtext p-component']")
	WebElement  SearchBox;
	
	@FindBy(xpath ="//tbody[@class='p-datatable-tbody']/tr/td[2]") 
	WebElement SearchedAssignName;
	
	@FindBy(xpath ="//tbody[@class='p-datatable-tbody']/tr/td[3]") 
	WebElement SearchedAssignDescription;
	
	@FindBy(xpath= "//th[@psortablecolumn='assignmentName']")
	WebElement  AssignmentName;
	
	@FindBy(id = "//th[@psortablecolumn='assignmentDescription']")
	WebElement   AssignmentDescription;
	
	@FindBy(xpath="//th[@psortablecolumn='assignmentComments']")
	WebElement  AssignmentDuedate;
	
	@FindBy(xpath="//th[@psortablecolumn='assignmentGraderId']")
	WebElement  AssignmentGrade;
	
	@FindBy(xpath="//tr[2]//div[contains(@class,'p-checkbox p-component')]")
	WebElement AssignmentCheckbox;
	
	@FindBy(xpath ="//div[@class='box']//button[@ng-reflect-icon='pi pi-trash']")
	WebElement  btnDeletetop;
	
	@FindBy(xpath = "//span[@class='p-paginator-current ng-star-inserted']")
	WebElement Paginationtext;
	
	@FindBy(xpath= "//div[@class='p-d-flex p-ai-center p-jc-between ng-star-inserted']")
	WebElement  FooterText;
	
	@FindBy(xpath="//span[@class='p-dialog-title ng-tns-c132-21 ng-star-inserted']")
	WebElement  AssignmentDetailForm ;
	
	@FindBy(xpath = "//button[@label='Save' and @icon='pi pi-check']")
	WebElement  AssbtnSave;
	
	@FindBy(xpath="//button[@label='Cancel']")
	WebElement  AssbtnCancel;
	
	@FindBy(xpath ="//div//*[contains(@class,'p-invalid ng-star-inserted')]")
	WebElement MessageName;
	
	@FindBy(xpath="//tbody/tr[1]//td[6]//span[2]//button[1]")
	WebElement  Deleteright;
	
	@FindBy(xpath="//tr[2]//*[contains(@class,'p-button-icon pi pi-pencil')]")
	WebElement  Editright;
	
	@FindBy(xpath="//span[@class='p-dialog-title ng-tns-c132-21 ng-star-inserted' and @id='pr_id_11-label' ]")
	WebElement AssignformHeader;
	
	@FindBy(xpath ="//input[@id='assignment']")
	WebElement  AssignFormAssName;
	
	@FindBy(xpath ="//input[@id='assignmentDescription']")
	WebElement  AssignFormAssDesc;
	
	@FindBy(xpath ="//input[@id='assignmentGraderId']")
	WebElement  AssignFormAssGrade;
	
	@FindBy(xpath ="//span[@class='p-button-icon pi pi-calendar']")
	WebElement  AssignFormAssDateClick;
		
	@FindBy(xpath="//div[@class='p-datepicker-group-container ng-tns-c105-87 ng-star-inserted']") 
	WindowType AssignFormDatePicker;
		
	@FindBy(xpath ="//span[@class='ng-tns-c105-24 p-highlight p-ripple ng-star-inserted' and text()='28']")
	WebElement  AssignFormDate;
	
    @FindBy(xpath = "//button[@type='button']//span[@class='p-dialog-header-close-icon ng-tns-c132-6 pi pi-times']")
	WebElement  AssformExitbtn;
  
	@FindBy(xpath="//p-confirmdialog[@class='ng-tns-c133-7']")
	WebElement  DeleteConfirmwindow;

	@FindBy(xpath="//span[@class='p-dialog-title ng-tns-c133-7 ng-star-inserted']")
	WebElement  DeleteConfirm;
	
	@FindBy(xpath="//button[@ng-reflect-label='Yes']")
	WebElement DeleteSaveButton;

	@FindBy(xpath="//button[@ng-reflect-label='No']")
	WebElement DeleteNoButton;
	
	@FindBy(xpath ="//div[contains(@class,'p-toast-detail ng-tns-c90')]")
	WebElement deleteMsg;
	 
	@FindBy(xpath = "//div[contains(@class,'p-toast-detail ng-tns-c90')]")
	WebElement deleteSuccessMsg;
	 
	@FindBy(xpath = "//div[contains(@class,'p-toast-summary ng-tns-c90')]")
    WebElement successMsg;
		
	@FindBy(xpath ="//input[@id='assignment' and @type='text']")
	WebElement  AssignEditAssName;
	
	@FindBy(xpath ="//input[@id='assignmentDescription' and @type='text']")
	WebElement  AssignEditAssDesc;
	
	@FindBy(xpath ="//input[@id='assignmentGraderId' and @type='text']")
	WebElement  AssignEditAssGrade;
	
    public String validatepagetitle()
	{
		System.out.println(driver.getTitle());
		return driver.getTitle();
		
	}
	public String pageheader()
	{
	  String pagehead=AssignformHeader.getText();
	  System.out.println(pagehead);
	  return pagehead;
	}
	
	public void Clickfun()
	{
		Assignment.click();
	}
	
	public String validateheader()
	{    String Text=ManageAssignment.getText();
	     return Text;
	}
	
	public String validatepagination() {
		String Text=Paginationtext.getText();
		return Text;
	}
	
	public String validateFooter() {
		String Text=FooterText.getText();
		return Text;
	}
	
	public boolean Deletebuttontop() {
		if (btnDeletetop.isDisplayed()) {
		return true;
		}
	return false;
	}
	
	public void Deletebuttontopclick() {
		btnDeletetop.click();
	}
	
	public boolean Deletebuttonright() {
		if (Deleteright.isDisplayed()) {
		return true;
		}
	return false;
	}
	
	public void DeleteNoButtonclick() {
		DeleteNoButton.click();
	}
	
	public void DeleteSaveButtonclick() {
		DeleteSaveButton.click();
	}
	
	public void DeletebuttonRightclick() {
		Deleteright.click();
	}
	
	public void EditbuttonRightclick() {
		Editright.click();
	}
	
	public boolean DeleteConfirmwindowpop() {
		if (DeleteConfirmwindow.isDisplayed()) 
		{
		return true;
		}
	return false;
	}
	
	/*
	 * public boolean DeleteConfirmText() { if (DeleteConfirm.isDisplayed()) {
	 * return true; } return false; }
	 */
	
	public boolean searchdisplayed() {
		if (SearchBox.isDisplayed()) {
		return true;
		}
	return false;
	}
	
	public String SearchedDataText()//Searched Assignment Name 
	{
		String Text = SearchedAssignName.getText();
		System.out.println(Text);
		return Text;
	}
	
	public String deleteMsgText() {
		String Text = deleteMsg.getText();
		System.out.println(Text);
		return Text;
	}
	
	public String SearchedAssDescText()//Searched Assignment Description 
	{
		String Text = SearchedAssignDescription.getText();
		System.out.println(Text);
		return Text;
	}
		
	public void searchboxContent(String string) {
		SearchBox.sendKeys(string);
	}
	
	public void checkboxselect()
	{
		AssignmentCheckbox.click();
	}
	
	public boolean checkboxselected()
	{ if (AssignmentCheckbox.isSelected())
	   {
		return true;
	   }return false;
	}
	
	public void NewAssignmentClick() {
		NewAssignment.click();
	}
	
	public void AssformSaveClick() {
		AssbtnSave.click();
	}
	
	public void AssformCancelClick() {
		AssbtnCancel.click();
	}
	
     public void AssformExitclick()
	{
    	 AssformExitbtn.click();
	}
	
	public String validateNameisrequired() {
		String Text=MessageName.getText();
		System.out.println(Text);
		return Text;
	}
	
	public String validateDeleteSuccessmsg() {
		String Text=deleteSuccessMsg.getText();
		System.out.println(Text);
		return Text;
	}
	
	public String validateAddSuccessmsg() {
		String Text=successMsg.getText();
		System.out.println(Text);
		return Text;
	}
	public void NewAssignmentName(String string) {
		if (AssignFormAssName.isDisplayed())
		AssignFormAssName.sendKeys(string);
	}
	
	public void AssignformSomeFill(String string,String string1) {
		AssignFormAssName.sendKeys(" ");
		AssignFormAssName.sendKeys(Keys.TAB);
		AssignFormAssDesc.sendKeys(string);
		AssignFormAssGrade.sendKeys(string1);
	}
	
	public void EditAssignformFill(String string,String string1,String string2) {
		
		AssignEditAssName.sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END),string);
		AssignEditAssDesc.sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END),string1);
		AssignEditAssGrade.sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END),string2);
	}
		
	public void AssignDatefill()
	{
		AssignFormAssDateClick.click();
		driver.switchTo().newWindow(AssignFormDatePicker);
		act.moveToElement(AssignFormDate).click().build().perform();
		JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",AssignFormDate);
	}
	
	

	
}
