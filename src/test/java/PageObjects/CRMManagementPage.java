package PageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CRMManagementPage extends BasePage {
	
	public CRMManagementPage(WebDriver driver) {
		super(driver);
	}
		

	//package pageObjects;


	@FindBy(linkText="CRM Management")
	WebElement CRMManagement;

	@FindBy(linkText = "Users")
	WebElement Users;

	@FindBy(xpath= "(//div[@role='combobox'])[1]")
	WebElement SearchBy;
	@FindBy(xpath = "//span[text()='Mobile No.']")
	WebElement Mobileoption;
	@FindBy(xpath = "(//input[@class='rs-input'])[2]")
	WebElement selectedoptionDetail;
	
	@FindBy(xpath="(//div[@role='combobox'])[2]")
	WebElement Roles;

	@FindBy(xpath="//span[text()='Admin']")
	WebElement AdminOption;
	
	@FindBy(xpath="(//div[@role='combobox'])[3]")
	WebElement status;
	

	@FindBy(xpath="//span[text()='Active']")
	WebElement StatusActive;

	@FindBy(xpath="//button[text()='Search']")
	WebElement Searchbtn;
		
	@FindBy(xpath="//div[text()='Mobile Number']")
	WebElement MobileNumberDisplayed;
	@FindBy(xpath="(//div[@class='rs-table-cell-content'])[16]")
	WebElement MobileNumberdataDisplayed;
	@FindBy(xpath="//*[normalize-space(text())='Admin']")
	WebElement roleDisplayed;
	@FindBy(xpath="//*[normalize-space(text())='Active']")
	WebElement Statuschosen;
	@FindBy(xpath="//button[text()='Excel Download']")
	WebElement ExcelDownload;
	@FindBy(xpath="//button[text()='Clear Filter']")//button[@type='button'])[3]
	WebElement ClearFilter;  //button[@class='rs-stack-item rs-btn-icon rs-btn-icon-placement-left rs-btn-icon-circle rs-btn rs-btn-subtle rs-btn-xs']//*[name()='svg']
	@FindBy(xpath="//button[@class='rs-stack-item rs-btn-icon rs-btn-icon-placement-left rs-btn-icon-circle rs-btn rs-btn-subtle rs-btn-xs']//*[name()='svg']")
	WebElement AddUsericon;
	@FindBy(xpath="(//span[@class='fw-300 op-05'])")
	WebElement UserTitle;
	@FindBy(xpath="(//span[text()='All'])[2]")
	WebElement Alloption;
	@FindBy(xpath="(//span[text()='Name'])[2]")
	WebElement nameOption;
	
	public void CRM_Management() throws InterruptedException{
		//EnterUserName.clear();
		Thread.sleep(2000);
		CRMManagement.click();
	}

	public void Usersoption() throws InterruptedException {
		//txtPassword.clear();
		Thread.sleep(2000);
		Users.click();
	}

	public void SearchByoption() throws InterruptedException {
		Thread.sleep(2000);
		SearchBy.click();
	}
	public void  AllOption() throws InterruptedException {
		Thread.sleep(2000);
		Alloption.click();
	}
		
	public void  MobileOption() throws InterruptedException {
		Thread.sleep(2000);
		Mobileoption.click();
	}
	public void  Selected_option_detail(String MobileNo) throws InterruptedException {
		Thread.sleep(2000);
		selectedoptionDetail.click();
		selectedoptionDetail.sendKeys(MobileNo);
	}
	
	public void  Roles_as_Admin() throws InterruptedException {
		Thread.sleep(2000);
		Roles.click();
		AdminOption.click();
		
	}
	
	public void  Status() throws InterruptedException {
		Thread.sleep(2000);
		status.click();
		StatusActive.click();
		
	}
	public void  SearchClick() throws InterruptedException {
		Thread.sleep(2000);
		Searchbtn.click();
		
		
	}
	
	public String Mobile_Number_Displayed() throws InterruptedException
	{
		Thread.sleep(2000);
		try {
			return(MobileNumberDisplayed.getText());
		} catch(Exception e) {
			return(e.getMessage());
		}
	}
	public String MobileNumberdataDisplayed() throws InterruptedException
	{
		Thread.sleep(2000);
		try {
			return(MobileNumberdataDisplayed.getText());
		} catch(Exception e) {
			return(e.getMessage());
		}
	}
	public String role_Displayed() throws InterruptedException
	{try{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(roleDisplayed));
        return roleDisplayed.getText(); } 
	catch (Exception e) {
        return e.getMessage();
		}
	}
	public String Status_chosen() throws InterruptedException
	{	String text = Statuschosen.getText();
		Thread.sleep(2000);
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.visibilityOf(Statuschosen));
	        return text;}
		catch(Exception e) {
			return(e.getMessage());
		}
	}
	public void  ExcelDownloadClick() throws InterruptedException {
		Thread.sleep(2000);
		ExcelDownload.click();
		
		
	}
	public void  ClearFilterClick() throws InterruptedException {
		Thread.sleep(2000);
		ClearFilter.click();
		
		
	}
	public void  addUserClick() throws InterruptedException {
		Thread.sleep(2000);
		AddUsericon.click();
		
		
	}
	public String  UserTitleVerify() throws InterruptedException {
		Thread.sleep(2000);
		Thread.sleep(2000);
		try {
			return(UserTitle.getText());
		} catch(Exception e) {
			return(e.getMessage());
		}
		
		
		
	}
	
}

	

		//package pageObjects;





