package PageObjects;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CRM_addUser_Page extends BasePage{

	
	public CRM_addUser_Page(WebDriver driver) {
		super(driver);
	}
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
   
	@FindBy(xpath = "(//input[@class='rs-input'])[2]")
	WebElement enterName;
	

	@FindBy(xpath = "//input[@placeholder='Email']")
	WebElement enterEmail;
	@FindBy(xpath = "//input[@placeholder='Mobile']")
	WebElement enterMobileNo;
	@FindBy(xpath = "//input[@placeholder='DID No']")
	WebElement enterDIDNo;
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement enterUsername;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement enterPassword;
	@FindBy(xpath = "(//div[@role='combobox'])[1]")
	WebElement Roleclick;
	@FindBy(xpath = "//span[text()='Admin']")
	WebElement RoleasAdmin;
	
	@FindBy(xpath = "//span[text()='Choose Branch']")
	WebElement chooseBranch;
	@FindBy(xpath = "//span[text()='Delhi']")
	WebElement BranchasDelhi;
	
	@FindBy(xpath = "//span[text()='Choose Status']")
	WebElement choosestatus;
	@FindBy(xpath = "//span[text()='Active']")
	WebElement statusasActive;
	
	@FindBy(xpath = "//input[@name='whatsapp_email']")
	WebElement WhatsEmail;
	@FindBy(xpath = "//input[@name='convoque_login_id']")
	WebElement LoginID;
	@FindBy(xpath = "//input[@name='convoque_exten']")
	WebElement Enten;
	//span[@class='rs-stack-item'])[1]
	//input[@name='convoque_exten']
	@FindBy(xpath = "(//span[@class='rs-toggle-inner'])[1]")
	WebElement checkall;
	
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement Submit;

	@FindBy(xpath = "//*[normalize-space(text())='Success']")
	WebElement Successmsg;
	

public  void EnterName(String name) throws InterruptedException {
	Thread.sleep(2000);
	 //wait.until(ExpectedConditions.visibilityOf(enterName));
	     enterName.click();
	     enterName.sendKeys(name);
		}

	public void EnterEmail(String email) throws InterruptedException {
		 wait.until(ExpectedConditions.visibilityOf(enterEmail));
		 enterEmail.click();
		 enterEmail.sendKeys(email);
	}
	public void enterMobile(String MobileNo) throws InterruptedException {
		 wait.until(ExpectedConditions.visibilityOf(enterMobileNo));
		 enterMobileNo.click();
		 enterMobileNo.sendKeys(MobileNo);	
		 }
	public void EnterDIDNo(String DID_No) throws InterruptedException {
		 wait.until(ExpectedConditions.visibilityOf(enterDIDNo));
		 enterDIDNo.click();
		 enterDIDNo.sendKeys(DID_No);	
		}
public void enterUSername(String Username) throws InterruptedException {
	 wait.until(ExpectedConditions.visibilityOf(enterUsername));
	 enterUsername.clear();
	 enterUsername.click();
	 enterUsername.sendKeys(Username);	
	
		}
public void enterPassword(String pwd) throws InterruptedException {
	wait.until(ExpectedConditions.visibilityOf(enterPassword));
	enterPassword.clear();
	enterPassword.click();
	enterPassword.sendKeys(pwd);	
		}
public void chooserole() throws InterruptedException {
	wait.until(ExpectedConditions.visibilityOf(Roleclick));
	Roleclick.click();
	Thread.sleep(2000);
	RoleasAdmin.click();
		
}

public void chooseBranch() throws InterruptedException {
	
	wait.until(ExpectedConditions.visibilityOf(chooseBranch));
	chooseBranch.click();
	BranchasDelhi.click();
		}

	
	
	
	public void chooseStatus() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(choosestatus));
		choosestatus.click();
		statusasActive.click();
		
	}
	public void enterWhatsappEmail(String wpemail) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(WhatsEmail));
		WhatsEmail.click();
		WhatsEmail.sendKeys(wpemail);	
			}
	public void enterLoginID(String loginID) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(WhatsEmail));
		LoginID.click();
		LoginID.sendKeys(loginID);	
		}
	
	public void EnterEnten(String enten) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(Enten));
		Enten.click();
		Enten.sendKeys(enten);	
		}
	
	public void checkAll() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(checkall));
		checkall.click();
	}
	public void Submit() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(Submit));
		Submit.click();
	}
	public String verify() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(Successmsg));
		return(Successmsg.getText());
		
	}	
			



}

