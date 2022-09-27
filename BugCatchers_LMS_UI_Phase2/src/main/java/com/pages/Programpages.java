package com.pages;

import java.util.List;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.factory.DriverFactory;

import com.util.ConfigReader;

public class Programpages {
	public WebDriver driver;
	String Text1 = "LMS - Learning Management System";

	public Programpages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public ConfigReader configReader;
	Properties prop;

	@FindBy(xpath = "//button[@routerlink='/program']")
	@CacheLookup
	WebElement programPage;

	@FindBy(xpath = "//div[normalize-space()='Manage Program']")
	@CacheLookup
	WebElement pageTitle;

	@FindBy(xpath = "//div[@class='p-d-flex p-ai-center p-jc-between ng-star-inserted']")
	@CacheLookup
	WebElement footer;

	@FindBy(xpath = "//span[@class='p-paginator-current ng-star-inserted']")
	@CacheLookup
	WebElement entries;

	@FindBy(xpath = "//span[@class='p-paginator-pages ng-star-inserted']")
	@CacheLookup
	WebElement pagination;

	@FindBy(xpath = "//span[@class='p-paginator-pages ng-star-inserted']")
	@CacheLookup
	List<WebElement> paginations;

	@FindBy(xpath = "//button[normalize-space()='1']")
	@CacheLookup
	WebElement currentPage;

	@FindBy(css = ".p-paginator-page.p-paginator-element.p-link.p-ripple.ng-star-inserted.p-highlight")
	@CacheLookup
	WebElement highligtedPage;

	// @FindBy(xpath = "//button[@class='p-paginator-prev p-paginator-element p-link
	// p-ripple p-disabled']")
	@FindBy(xpath = "button[@class='p-paginator-first p-paginator-element p-link p-disabled p-ripple ng-star-inserted']")
	@CacheLookup
	WebElement previousPageButton;

	@FindBy(xpath = "//button[@class='p-paginator-prev p-paginator-element p-link p-ripple']")
	@CacheLookup
	WebElement backwardPage;

	// @FindBy(xpath = "//span[@class='p-paginator-icon pi pi-angle-right']")
	@FindBy(xpath = "//button[@class='p-paginator-next p-paginator-element p-link p-ripple']")
	@CacheLookup
	WebElement nextPageButton;

	@FindBy(xpath = "//button[normalize-space()='6']']")
	@CacheLookup
	WebElement lastPageButton;

	@FindBy(xpath = "//button[@class='p-button-danger p-button p-component p-button-icon-only']")
	@CacheLookup
	WebElement leftDeleteButton;

	@FindBy(xpath = "//input[@type='text']")
	@CacheLookup
	WebElement searchBox;

	@FindBy(xpath = "//div[@class='p-checkbox p-component']")
	@CacheLookup
	WebElement checkBox;

	@FindBy(xpath = "//p-radiobutton[@ng-reflect-input-id='Active']")
	@CacheLookup
	WebElement statusActiveButton;

	@FindBy(xpath = "//p-radiobutton[@ng-reflect-input-id='Inactive']")
	@CacheLookup
	WebElement statusInactiveButton;

	@FindBy(xpath = "//button[@ng-reflect-icon='pi pi-trash']")
	@CacheLookup
	WebElement rightDeleteButton;

	@FindBy(xpath = "//div[@class='p-checkbox-box']")
	@CacheLookup
	WebElement checkBoxAllButton;

	@FindBy(xpath = "//span[normalize-space()='No']")
	@CacheLookup
	WebElement deleteNoButton;

	@FindBy(xpath = "//span[normalize-space()='Yes']")
	@CacheLookup
	WebElement deleteYesButton;

	@FindBy(xpath = "//span[normalize-space()='Cancel']")
	@CacheLookup
	WebElement cancelButton;

	@FindBy(xpath = "//span[normalize-space()='Save']")
	@CacheLookup
	WebElement saveButton;

	@FindBy(xpath = "//i[@class='p-sortable-column-icon pi pi-fw pi-sort-amount-up-alt']")
	@CacheLookup
	WebElement oderButtonProgramNameAscending;

	@FindBy(xpath = "//i[@class='p-sortable-column-icon pi pi-fw pi-sort-amount-down']")
	@CacheLookup
	WebElement oderButtonProgramNameDescending;

	@FindBy(xpath = "//input[@id='username']")
	WebElement Username;

	@FindBy(xpath = "//input[@id='password']")
	WebElement Password;

	@FindBy(xpath = "//button[@id='login']")
	WebElement login;

	@FindBy(xpath = "//p-confirmdialog[@class='ng-tns-c133-4']")
	WebElement successMessage;

	@FindBy(xpath = "//span[normalize-space()='LMS - Learning Management System']")
	WebElement Header;

	@FindBy(xpath = "//div[@class='p-dialog-header ng-tns-c132-3 ng-star-inserted']")
	@CacheLookup
	WebElement programDetailsForm;

	@FindBy(xpath = "//small[@class='p-invalid ng-star-inserted']")
	@CacheLookup
	WebElement nameRequired;

	public void getProgramDetailsForm() {
		programDetailsForm.getText();
	}

	public void ProgramDetail_page() {
		String isVisible = programDetailsForm.getAttribute("ng-reflect-visible");
		System.out.println("Program Details Page" + isVisible);
	}

	public void program_Page() {
		programPage.click();
	}

	public void prevoiusPageBtn() {
		backwardPage.click();
	}

	public void nextPageBtn() {
		if (nextPageButton.isEnabled() == true) {
			System.out.println("IsEnabled " + nextPageButton.isEnabled());
			nextPageButton.click();
		} else {
			System.out.println("IsEnabled1 " + nextPageButton.isEnabled());
		}
	}

	public String nextPage() {
		String data = nextPageButton.getText();
		return data;
	}

	public void lastPage() {
		WebElement lstPg = driver.findElement(By.xpath("//button[normalize-space()='5']"));

		System.out.println("Element is: " + lstPg.getText());
		lstPg.click();
		WebElement nxtPgbtn = driver.findElement(By.xpath("//span[@class='p-paginator-icon pi pi-angle-right']"));
		System.out.println("nextbtn: " + nxtPgbtn.isEnabled());
		/*
		 * pagination.getSize(); int len = pagination.; System.out.println("length=" +
		 * len + " Text " + pagination.getText()); for(int i=0;i<= len;i++) { if(i == 6)
		 * {
		 * 
		 * paginations.get(i).click(); //span[@class='p-paginator-pages
		 * ng-star-inserted'])[1] //lastPageButton(i).click(); break; } }
		 */
		// lastPageButton.click();

	}

	public void leftDeleteBtn() {
		leftDeleteButton.isEnabled();
	}

	public void search() {
		searchBox.sendKeys("");
	}

	public void checkTick() {
		checkBox.click();
	}
	
	

	public void statusActive() {
		statusActiveButton.click();
	}

	public void statusInactive() {
		statusInactiveButton.click();
	}

	public void deleteBtn() {
		rightDeleteButton.click();
	}

	public void checkTickAll() {
		checkBoxAllButton.click();
	}

	public void deleteNoBtn() {
		deleteNoButton.click();
	}

	public String successfullyCreated() {
		String data = successMessage.getText();
		return (data);
	}
	
	public String SearchedDataText()
	{
		String Text = searchBox.getText();
		System.out.println(Text);
		return Text;
	}
	
	public void searchboxContent(String string) {
		searchBox.sendKeys(string);
	}
	
	
	public String successfullydeleted() {
		String data = successMessage.getText();
		return (data);
	}
	public void deleteYesBtn() {
		deleteYesButton.click();
	}

	public void orderAscending() {
		oderButtonProgramNameAscending.click();
	}

	public void orderDescending() {
		oderButtonProgramNameDescending.click();
	}

	public void URL() {
		String url = driver.getCurrentUrl();
		System.out.print(url);
	}

	public String validatepagetitle() {
		System.out.println(driver.getTitle());
		return driver.getTitle();

	}

	public String pageProgramTitle() {
		String title = pageTitle.getText();
		return title;
	}

	public String pageEntries() {
		String data = entries.getText();
		return data;
	}

	public String allPages() {

		String totalP = footer.getText();
		return totalP;
	}

	public void userpassword(String User, String Password1) {

		Username.sendKeys("Username");
		Password.sendKeys("Password1");
	}

	public void Login() {
		login.click();
	}

	public String nameRequiredInForm() {
		String data = nameRequired.getText();
		return (data);
	}

	public void header() {
		programPage.getTagName();
	}

	public boolean previousLink() {
		boolean prev = previousPageButton.isEnabled();
		return prev;
	}

	public String CurrentPage() {
		String data = highligtedPage.getText();
		return data;
	}

	public String page12() {
		String data = pagination.getText();
		return data;
	}

	public boolean leftDisabledDeleteBtn() {
		boolean data = leftDeleteButton.isEnabled();
		return data;
	}

	public boolean pageOneRecord() {
		boolean data = entries.getText().contains("5");
		return data;
	}

}
