package com.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.factory.DriverFactory;
import com.util.ConfigReader;

public class ManageBatch_PageObj {
	//	 ConfigReader configReader = new ConfigReader();

	//initialize the driver
	WebDriver driver;
	String deleteMsgStr;
	List<String> columnHeaderDataBeforeClick;
	List<String> columnHeaderDataAfterClick;
	List<String> columnHeaderData;

	//Finding elements on the page
	@FindBy(css = "#username") 
	WebElement UserNameTxtBx;

	@FindBy(css = "#password")
	WebElement PasswordTxtBx;

	@FindBy(css = ".mat-button-wrapper")
	WebElement LoginBtn;

	@FindBy(xpath = "//button[@routerlink='/batch']") 
	WebElement BatchBtnOnRibbonTab;

	@FindBy(xpath = "//mat-card-title[@class='mat-card-title']/div[1]")
	WebElement maanagePgmTxt;

	@FindBy(xpath = "//button[@class='p-button-danger p-button p-component p-button-icon-only']")
	WebElement multiDeleteBtn;

	@FindBy(xpath = "//tbody[@class='p-datatable-tbody']//tr[@class='ng-star-inserted']")
	List<WebElement> noOfRecordsOnGrid;

	@FindBy(xpath = "//input[@placeholder='Search...']")
	WebElement searchBtn;

	@FindBy(xpath = "//tbody[@class='p-datatable-tbody']//tr/td[2]")
	List<WebElement> batchNameDataFromTable;

	@FindBy(xpath = "//tbody[@class='p-datatable-tbody']//tr/td[3]")
	List<WebElement> batchdescriptionDataFromTable;

	@FindBy(xpath = "//tbody[@class='p-datatable-tbody']//tr/td[5]")
	List<WebElement> noOfClasesDataFromTable;

	@FindBy(xpath = "//tbody[@class='p-datatable-tbody']//tr/td[6]")
	List<WebElement> pgmNameDataFromTable;

	@FindBy(css = ".p-paginator-next.p-paginator-element.p-link.p-ripple")
	WebElement nextBtn;

	@FindBy(css = ".p-paginator-prev.p-paginator-element.p-link.p-disabled.p-ripple")
	WebElement previousBtn;

	@FindBy(xpath = "//button[contains(@class , 'p-paginator-prev p-paginator-element')]")
	WebElement genericPreviousBtn;

	@FindBy(xpath = "//span[@class='p-paginator-pages ng-star-inserted']//button")
	List<WebElement> pageNumbers;

	@FindBy(xpath = "//tbody[@class='p-datatable-tbody']//tr[1]/td[7]//div/span[1]")
	WebElement firstEditBtn;

	@FindBy(css = "#pr_id_5-label")
	WebElement batchDetailsTxtToBeChecked;

	@FindBy(css = "#batchName")
	WebElement batchNameTxtBx;

	@FindBy(css = "#batchDescription")
	WebElement batchDescriptionTxtBx;

	@FindBy(xpath = "//input[@placeholder='Select a Program name']")
	WebElement pgmNameTxtBx;

	@FindBy(xpath = "//p-radiobutton[@ng-reflect-input-id='INACTIVE']")
	WebElement inactiveRadioBtn;

	@FindBy(id = "batchNoOfClasses")
	WebElement batchNoOfClassesTxtBx;

	@FindBy(xpath = "//button[@ng-reflect-label='Save']")
	WebElement saveBtn;

	@FindBy(xpath = "//button[@ng-reflect-label='Cancel']")
	WebElement cancelBtn;

	@FindBy(xpath = "//tbody[@class='p-datatable-tbody']//tr[1]/td")
	List<WebElement> firstRecordOfTheTable;

	@FindBy(xpath = "//tbody[@class='p-datatable-tbody']//tr[1]/td[7]/div/span[2]")
	WebElement firstDeleteBtnInTable;

	@FindBy(xpath = "//button[@ng-reflect-label='Yes']")
	WebElement popupYesBtn;

	@FindBy(xpath = "//button[@ng-reflect-label='No']")
	WebElement popupNoBtn;

	@FindBy(xpath = "//div[contains(@class,'p-toast-summary ng-tns-c90')]")
	WebElement successMsg;

	@FindBy(xpath = "//div[contains(@class,'p-toast-detail ng-tns-c90')]")
	WebElement deleteMsg;


	@FindBy(xpath = "//tbody[@class='p-datatable-tbody']//tr[1]/td[1]")
	WebElement firstChkBx;

	@FindBy(xpath = "//tbody[@class='p-datatable-tbody']//tr[2]/td[1]")
	WebElement secondChkBx;


	@FindBy(css = ".p-sortable-column[psortablecolumn='batchName']")
	WebElement headerBatchName;

	@FindBy(css = ".p-sortable-column[psortablecolumn='batchDescription']")
	WebElement headerbatchDescription;

	@FindBy(css = ".p-sortable-column[psortablecolumn='batchStatus']")
	WebElement headerbatchStatus;

	@FindBy(css = ".p-sortable-column[psortablecolumn='batchNoOfClasses']")
	WebElement headerbatchNoOfClasses;

	@FindBy(css = ".p-sortable-column[psortablecolumn='programName']")
	WebElement headerprogramName;

	@FindBy(id = "new")
	WebElement addANewBatchBtn;

    @FindBy(css = ".p-invalid.ng-star-inserted")
    WebElement errorMsg;
    
    @FindBy(xpath = "//*[@class='mat-card-title']/div[1]")
    WebElement manageBatchHeader;

	//Create a constructor and initialize the PageFactory
	public ManageBatch_PageObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		//   PageFactory.initElements(driver, ManageBatch_PageObj.class);

	}

	public void appLogin() {

		UserNameTxtBx.sendKeys("lms");
		PasswordTxtBx.sendKeys("lms");
		LoginBtn.click();

	}

	public void clickOnBatchBtnOnRibbonTab() {

		BatchBtnOnRibbonTab.click();

	}

	public String getText() {
		System.out.println(maanagePgmTxt.getText());
		return maanagePgmTxt.getText(); 
	}

	public Boolean isDisabled() {
		System.out.println("Is delete button disbaled "+ multiDeleteBtn.isEnabled()); 
		return multiDeleteBtn.isEnabled();

	}

	public int noOfRecordsDisplayed() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int no = noOfRecordsOnGrid.size();
		return no;
	}

	public void enterText(String search) {

		searchBtn.sendKeys(search);

	}

	public Boolean searchValueInTable(String searchString) {

		//check if batchNameFromTable is not zero
		if(!(batchNameDataFromTable.size()==0)) {

			//Check if nextBtn is enaled.disabled
			while(true) {

				try {
					Thread.sleep(5000);

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				//getting batch name from the table
				for (int i = 0; i < batchNameDataFromTable.size(); i++) {

					System.out.println("Value at i "+batchNameDataFromTable.get(i).getText());
					if(((batchNameDataFromTable.get(i).getText()).toLowerCase()).contains(searchString.toLowerCase())) {

						continue;

					}
					else {

						return false;
					}

				}    
				//click on next button
				if (nextBtn.isDisplayed() && nextBtn.isEnabled()){

					try {
						nextBtn.click();
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					break;
				}
			} 

		}
		else { 

			return false;

		}

		return true;
	}

	public void clickOnEditButton() {

		firstEditBtn.click();

	}

	public String checkBatchDetailsPopUp() {

		return batchDetailsTxtToBeChecked.getText(); 

	}

	public void editBatchDetails(String batchName, String batchDescription, String programName,
			String statusRadio, String noOfClasses, String clickOnButton) {

		batchNameTxtBx.sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END), batchName);
		batchDescriptionTxtBx.sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END),batchDescription);
		pgmNameTxtBx.sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END),programName);
		inactiveRadioBtn.click();
		batchNoOfClassesTxtBx.sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END),noOfClasses);

		if(clickOnButton.equals("Cancel")) {

			cancelBtn.click();

		} else if(clickOnButton.equals("Save")) {

			saveBtn.click();
		}
	}

	public boolean searchEditedValueInTable(String batchNameTxtBx, String batchDescription, String programNameDrpDwn,
			String statusRadioBtn, String noOfClassesTxtBx) {

		List<String> values = new ArrayList<String>();
		values.add(batchNameTxtBx);
		values.add(batchDescription);
		values.add(programNameDrpDwn);
		values.add(statusRadioBtn);
		values.add(noOfClassesTxtBx);

		if(firstRecordOfTheTable.size() > 0) {
			for (int i = 1; i < firstRecordOfTheTable.size()-1; i++) {

				String temp = firstRecordOfTheTable.get(i).getText();

				if((values.contains(temp))){
					continue;
				}
			}
		}
		else {
			return false;
		}
		return true;
	}

	public void clickOnFirstDeleteBtn() {

		firstDeleteBtnInTable.click();
	}

	public void clickOnConfirmationBtn(String yesnoDecision) {

		if(yesnoDecision.equals("Yes")) {

			popupYesBtn.click();
			deleteMsgStr = deleteMsg.getText();

		}else if(yesnoDecision.equals("No")) {

			popupNoBtn.click();

		}

	}

	public boolean confirmationMsgAfterDelete(String msg) {

		if(msg.equals("batch Deleted")) {
			//	successMsg.getText();

			if(deleteMsgStr.equals(msg)){
				return true;
			}

		}else if(msg.equals("no message")) {

			/*
			 * if(deleteMsgStr.equals("null") || deleteMsgStr.equals("")){ return true; }
			 */
			return true;
		}

		return false;
	}

	public void multipleRecordsDeleted() {

		firstChkBx.click();
		secondChkBx.click();
		multiDeleteBtn.click();

	}

	public boolean previousLinkDisabled() {

		if(previousBtn.isEnabled()) {
			return false;
		}
		else {
			return true;
		}
	}

	public boolean isOnPage(String string) {

		if(string.equals("1")) {

			if((pageNumbers.get(0)).isEnabled()) {

				return true;

			}
		}else if(string.equals("2")) {

			if((pageNumbers.get(1)).isEnabled()) {

				return true;

			}

		} else if(string.equals("clickon1and2")) {

			if((pageNumbers.get(1)).isEnabled()) {

				return true;

			}

		}
		return false;
	}

	public void goToPage(String link) {

		if(link.equals("next")) {

			nextBtn.click();

		}else if(link.equals("previous")) {

			//previousBtn.click();
			genericPreviousBtn.click();

		}else if(link.equals("clickon1and2")) {

			nextBtn.click();
		}

	}

	public void goToLastPage() {

		while(true) {

			//click on next button
			if (nextBtn.isDisplayed() && nextBtn.isEnabled()){

				nextBtn.click();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else 
				break;
		}
	}

	public boolean nextLinkDisabled() {

		if(nextBtn.isEnabled()) {
			return false;
		}
		else {
			return true;
		}
	}

	public void clickOnHeaderAscending(String columnName) {

		//Before clicking get the data from the Columns

		if(columnName.equals("Batch name")) {

			//Before clicking get the data from the Columns
			columnHeaderDataBeforeClick = getHeaderData(batchNameDataFromTable);

			headerBatchName.click();

			//After clicking get the data from the Columns
			columnHeaderDataAfterClick = getHeaderData(batchNameDataFromTable);


		}else if(columnName.equals("Batch Description")) {

			//Before clicking get the data from the Columns
			columnHeaderDataBeforeClick = getHeaderData(batchdescriptionDataFromTable);

			headerbatchDescription.click();

			//After clicking get the data from the Columns
			columnHeaderDataAfterClick = getHeaderData(batchdescriptionDataFromTable);

		}else if(columnName.equals("No Of Classes")) {

			//Before clicking get the data from the Columns
			columnHeaderDataBeforeClick = getHeaderData(noOfClasesDataFromTable);

			headerbatchNoOfClasses.click();

			//After clicking get the data from the Columns
			columnHeaderDataAfterClick = getHeaderData(noOfClasesDataFromTable);


		}else if(columnName.equals("Program Name")) {

			//Before clicking get the data from the Columns
			columnHeaderDataBeforeClick = getHeaderData(pgmNameDataFromTable);

			headerprogramName.click();

			//After clicking get the data from the Columns
			columnHeaderDataAfterClick = getHeaderData(pgmNameDataFromTable);



		}


	}

	private List<String> getHeaderData(List<WebElement> listOfwebElement) {

		//check if batchNameFromTable is not zero
		if(!(listOfwebElement.size()==0)) {

			columnHeaderData = new ArrayList<String>();

			//Check if nextBtn is enaled.disabled
			while(true) {

				try {
					Thread.sleep(5000);

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				for (WebElement webElement : listOfwebElement) {

					//	System.out.println("webElement.getText()  "+ webElement.getText());
					columnHeaderData.add(webElement.getText().toLowerCase());
				}

				//click on next button
				if (nextBtn.isDisplayed() && nextBtn.isEnabled()){

					try {
						nextBtn.click();
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					break;
				}
			} 

		}

		return columnHeaderData;
	}

	public boolean verifySortedResultAscending(String columnName) {

		if(columnName.equals("No of Classes")) {
			// Convert List of String to list of Integer
			List<Integer> expected = columnHeaderDataBeforeClick.stream()
					.map(s -> Integer.parseInt(s))
					.collect(Collectors.toList());

			List<Integer> actual = columnHeaderDataAfterClick.stream()
					.map(s -> Integer.parseInt(s))
					.collect(Collectors.toList());

			Collections.sort(expected);
			System.out.println("columnHeaderDataBeforeClick  "+expected);
			System.out.println("columnHeaderDataAfterClick  "+actual);
			System.out.println("***********************Are the list equal  "+ expected.equals(actual));
			return actual.equals(expected);

		}
		else {
			Collections.sort(columnHeaderDataBeforeClick);
			System.out.println("columnHeaderDataBeforeClick  "+columnHeaderDataBeforeClick);
			System.out.println("columnHeaderDataAfterClick  "+columnHeaderDataAfterClick);
			System.out.println("***********************Are the list equal  "+ columnHeaderDataAfterClick.equals(columnHeaderDataBeforeClick));
			boolean isSorted=true;
			for(int i=0 ; i < columnHeaderDataBeforeClick.size();i++){
				if(columnHeaderDataBeforeClick.get(i).compareTo(columnHeaderDataAfterClick.get(i)) > 0){
					System.out.println(columnHeaderDataBeforeClick.get(i)+"    "+columnHeaderDataAfterClick.get(i));
					isSorted= false;
					break;
				}
			}

			return isSorted;
		}
	}

	public void clickOnHeaderDescending(String columnName) {

		//Before clicking get the data from the Columns

		if(columnName.equals("Batch name")) {

			//Before clicking get the data from the Columns
			columnHeaderDataBeforeClick = getHeaderData(batchNameDataFromTable);

			headerBatchName.click();
			headerBatchName.click();

			//After clicking get the data from the Columns
			columnHeaderDataAfterClick = getHeaderData(batchNameDataFromTable);


		}else if(columnName.equals("Batch Description")) {

			//Before clicking get the data from the Columns
			columnHeaderDataBeforeClick = getHeaderData(batchdescriptionDataFromTable);

			headerbatchDescription.click();
			headerbatchDescription.click();

			//After clicking get the data from the Columns
			columnHeaderDataAfterClick = getHeaderData(batchdescriptionDataFromTable);

		}else if(columnName.equals("No Of Classes")) {

			//Before clicking get the data from the Columns
			columnHeaderDataBeforeClick = getHeaderData(noOfClasesDataFromTable);

			headerbatchNoOfClasses.click();
			headerbatchNoOfClasses.click();

			//After clicking get the data from the Columns
			columnHeaderDataAfterClick = getHeaderData(noOfClasesDataFromTable);


		}else if(columnName.equals("Program Name")) {

			//Before clicking get the data from the Columns
			columnHeaderDataBeforeClick = getHeaderData(pgmNameDataFromTable);

			headerprogramName.click();
			headerprogramName.click();

			//After clicking get the data from the Columns
			columnHeaderDataAfterClick = getHeaderData(pgmNameDataFromTable);



		}


	}

	public boolean verifySortedResulDescending(String columnName) {

		if(columnName.equals("No of Classes")) {
			// Convert List of String to list of Integer
			List<Integer> expected = columnHeaderDataBeforeClick.stream()
					.map(s -> Integer.parseInt(s))
					.collect(Collectors.toList());

			List<Integer> actual = columnHeaderDataAfterClick.stream()
					.map(s -> Integer.parseInt(s))
					.collect(Collectors.toList());

			Collections.sort(expected , Collections.reverseOrder());

			System.out.println("columnHeaderDataBeforeClick  "+expected);
			System.out.println("columnHeaderDataAfterClick  "+actual);
			System.out.println("***********************Are the list equal  "+ expected.equals(actual));
			return actual.equals(expected);

		}
		else {
			Collections.sort(columnHeaderDataBeforeClick , Collections.reverseOrder());

			System.out.println("columnHeaderDataBeforeClick  "+columnHeaderDataBeforeClick);
			System.out.println("columnHeaderDataAfterClick  "+columnHeaderDataAfterClick);
			System.out.println("***********************Are the list equal  "+ columnHeaderDataAfterClick.equals(columnHeaderDataBeforeClick));
			boolean isSorted=true;
			for(int i=0 ; i < columnHeaderDataBeforeClick.size();i++){
				if(columnHeaderDataBeforeClick.get(i).compareTo(columnHeaderDataAfterClick.get(i)) > 0){
					System.out.println(columnHeaderDataBeforeClick.get(i)+"    "+columnHeaderDataAfterClick.get(i));
					isSorted= false;
					break;
				}
			}

			return isSorted;
		}
	}

	public void clikcOnANewBatcBtn() {

		addANewBatchBtn.click();

	}
	
	public String ddNewBatchgetText() {

		return batchDetailsTxtToBeChecked.getText(); 
	}

	public void clickOnSaveBtn() {
		
		saveBtn.click();
		
	}

	public String getMsg() {
	
	System.out.println(errorMsg.getText());
	return	errorMsg.getText();
		
	}

	public void clickOnCancelBtn() {
		
		cancelBtn.click();
		
	}

	public String getHeaderTxt() {
		System.out.println(manageBatchHeader.getText());
		return manageBatchHeader.getText();
		
	}

	public String getBatchDetailsTxt() {
		
		return batchDetailsTxtToBeChecked.getText();
	}
}





