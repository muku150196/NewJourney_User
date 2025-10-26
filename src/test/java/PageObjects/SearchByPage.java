package PageObjects;

import java.io.File;




import java.io.IOException;
import java.sql.SQLException;
import java.time.Duration;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Factory.BaseClass;
//import pageObjects.AccountRegistrationPage;

public class SearchByPage extends BasePage{
	

	
	public SearchByPage(WebDriver driver) {
		super(driver);
	}


	@FindBy(xpath = "//button[@id='menubutton-:r1:']")
	WebElement menubutton;
	

	@FindBy(xpath = "//span[text()='Lead ID']")
	WebElement LeadIDoption;
	@FindBy(xpath = "//span[text()='Customer ID']")
	WebElement CustomerIDoption;
	@FindBy(xpath = "//span[text()='Loan A/c Number']")
	WebElement LoanACoption;
	@FindBy(xpath = "//span[text()='Email']")
	WebElement Emailoption;
	
	@FindBy(xpath = "//li[@id='menuitem-:r7:']")
	WebElement Nameoption;
	@FindBy(xpath = "//span[text()='PAN']")
	WebElement PANoption;
	@FindBy(xpath = "//span[text()='Mobile']")
	WebElement Mobileoption;
	
	@FindBy(xpath = "(//div[@class='rs-col rs-col-xs-8'])[3]")
	WebElement EmailDisplayed;
	@FindBy(xpath = "(//h6[@class='rs-heading'])[2]")
	WebElement PANDisplayed;
	@FindBy(xpath = "(//div[@class='rs-col rs-col-xs-8'])[2]")
	WebElement MobileDisplayed;
	
	@FindBy(xpath = "//input[@class='rs-input']")
	WebElement Searchbar;
	@FindBy(xpath = "//div[@class='user_id bg_gray']")
	WebElement actualCustID;
	@FindBy(xpath = "//h6[@class='rs-stack-item name rs-heading']")
	WebElement actualName;
	//span[@class='rs-stack-item'])[1]
	@FindBy(xpath = "(//span[@class='rs-stack-item'])[1]")
	WebElement matchingdata;
	
	@FindBy(xpath = "(//h6[@class='rs-stack-item fs-14 rs-heading'])[7])")
	WebElement actualLeadID;
	@FindBy(xpath = "//*[@id='root']/section[1]/main/div/div[3]/div/div[7]/div[2]/div/div[1]/div/h6")
	WebElement actualLoanACNo;


	public boolean ismatchingDataExists()   // MyAccount Page heading display status
	{
		try {
			return (matchingdata.isDisplayed());
		} catch (Exception e) {
			return (false);
		}
	}
	public void Dataclick()
	{
		 try {
	            boolean Datamatch=matchingdata.isDisplayed();//tru/false
	           // System.out.println("target page: "+ targetpage);
	           // if(exp_res.equals("Valid"))
	            //{
	                if(Datamatch==true)
	                {
	                   // MyAccountPage myaccpage=new MyAccountPage(BaseClass.getDriver());
	                	Thread.sleep(2000);
	                	matchingdata.click();
	                    Assert.assertTrue(true);
	                }}
		 	 catch(Exception e){
		 		{System.out.println("Matching data does'nt exists");
                
             } }
	}

public void menubuttonclick() throws InterruptedException {
	Thread.sleep(2000);
		
	menubutton.click();
		}

	public void selectLeadID() throws InterruptedException {
		Thread.sleep(2000);
		LeadIDoption.click();
		}
	public void selectLoanAc() throws InterruptedException {
		Thread.sleep(2000);
		LoanACoption.click();
		}
	public void selectCustID() throws InterruptedException {
		Thread.sleep(2000);
		CustomerIDoption.click();
		}
public void selectName() throws InterruptedException {
	Thread.sleep(2000);
	Nameoption.click();
		}
public void selectEmail() throws InterruptedException {
	Thread.sleep(2000);
	Emailoption.click();
		}
public void selectPAN() throws InterruptedException {
	Thread.sleep(2000);
	PANoption.click();
		}

public void selectMobile() throws InterruptedException {
	Thread.sleep(2000);
	Mobileoption.click();
		}

	
	
	
	public void SearchbyLoanacNo(String LoanNo) throws InterruptedException {
		Thread.sleep(2000);
		Searchbar.clear();
		Searchbar.sendKeys(LoanNo);
	}
	public void SearchbyCustID(String custID) throws InterruptedException {
		Thread.sleep(2000);
		Searchbar.clear();
		Searchbar.sendKeys(custID);
	}
	public void SearchbyName(String Name) throws InterruptedException {
		Thread.sleep(2000);
		Searchbar.clear();
		Searchbar.sendKeys(Name);
	}
	
	public void SearchbyLead(String leadID) throws InterruptedException {
		Thread.sleep(2000);
		Searchbar.clear();
		Searchbar.sendKeys(leadID);
	
		
		
			}
	
	public void SearchbyEmail(String Email) throws InterruptedException {
		Thread.sleep(2000);
		Searchbar.clear();
		Searchbar.sendKeys(Email);
	}
	public void SearchbyPAN(String PAN) throws InterruptedException {
		Thread.sleep(2000);
		Searchbar.clear();
		Searchbar.sendKeys(PAN);
	}
	public void SearchbyMobile(String mobile) throws InterruptedException {
		Thread.sleep(2000);
		Searchbar.clear();
		Searchbar.sendKeys(mobile);
	}
	
	public void matcingDataClick() throws InterruptedException {
		//Searchbar.clear();
		Thread.sleep(2000);
		matchingdata.click();
	}

	public String getleadIDDisplayed() throws InterruptedException
	{
		Thread.sleep(2000);
		try {
			return(actualLeadID.getText());
		} catch(Exception e) {
			return(e.getMessage());
		}
	}
	public String LoanNoDisplayed() throws InterruptedException
	{
		Thread.sleep(2000);
		try {
			return(actualLoanACNo.getText());
		} catch(Exception e) {
			return(e.getMessage());
		}
	}
	
	public String getCustIDDisplayed() throws InterruptedException
	{
		Thread.sleep(2000);
		try {
			return(actualCustID.getText());
		} catch(Exception e) {
			return(e.getMessage());
		}
	}
	
	public String getNameDisplayed() throws InterruptedException
	{
		Thread.sleep(2000);
		try {
			return(actualName.getText());
		} catch(Exception e) {
			return(e.getMessage());
		}
	}
	
	public String getemailIDDisplayed() throws InterruptedException
	{
		Thread.sleep(2000);
		try {
			return(EmailDisplayed.getText());
		} catch(Exception e) {
			return(e.getMessage());
		}
	}
	

	public String getPANNODisplayed() throws InterruptedException
	{
		Thread.sleep(2000);
		try {
			return(PANDisplayed.getText());
		} catch(Exception e) {
			return(e.getMessage());
		}
	}
	
	public String getMobilenoDisplayed() throws InterruptedException
	{Thread.sleep(2000);
		try {
			return(MobileDisplayed.getText());
		} catch(Exception e) {
			return(e.getMessage());
		}
	}

			



}
		
		