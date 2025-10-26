package PageObjects;

import java.io.FileOutputStream;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	//package pageObjects;


	@FindBy(xpath = "//input[@placeholder='Enter your mobile number']")
	WebElement EnterMobileNo;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement GetOtp;

	@FindBy(xpath = "//input[@class='EnterOTP_form__input__7-oPk']")
	WebElement OTPfield;
	@FindBy(xpath = "//div[@class='CustomButton_button__container__4-pjM ']")
	WebElement Verifybtn;
	@FindBy(xpath = "//span[text()='Get Cash']")
	WebElement GetCash;
	
	@FindBy(xpath = "//h1[text()='Pan Verification']")
	WebElement EnterPanTitle;
	@FindBy(xpath = "//input[@placeholder='Enter your PAN']")
	WebElement PANfield;
	@FindBy(xpath = "//input[@placeholder='Enter Pin Code']")
	WebElement PINfield;
	@FindBy(xpath = "//button[text()='Yes']")
	WebElement Yesbtn;
	@FindBy(xpath = "//div[text()='Bank Transfer']")
	WebElement BankTransfer;
	@FindBy(xpath = "//input[@name='companyName']")
	WebElement Companyname;
	
	@FindBy(xpath = "//input[@name='monthlyIncome']")
	WebElement MonthlyIncome;
	@FindBy(xpath = "//span[text()='Next']")
	WebElement Next;
	@FindBy(xpath = "//div[text()='10']")
	WebElement dateofSalary;

	@FindBy(xpath = "//span[text()='Continue']")
	WebElement Continue;
	@FindBy(xpath = "//button[text()='Continue ']")
	WebElement EmandateContinue;
	@FindBy(xpath = "//div[text()='Salaried']")
	WebElement Salaried;

	@FindBy(xpath = "//div[text()='Personal Emergency']")
	WebElement PersonalEmergency;
	@FindBy(xpath = "//input[@placeholder='Enter your e-mail']")
	WebElement EnterEmail;
	@FindBy(xpath = "//input[@placeholder='Enter your aadhaar number']")
	WebElement EnterAadhar;
	@FindBy(xpath = "//input[@name='accountHolderName']")
	WebElement AccountHolderName;
	@FindBy(xpath = "//input[@name='accountNo']")
	WebElement AccountNo;
	@FindBy(xpath = "//input[@name='confirmedAccountNo']")
	WebElement confirmAccountNo;
	@FindBy(xpath = "//input[@name='ifsc']")
	WebElement enterIFSC;
	@FindBy(xpath = "//input[@name='bankName']")
	WebElement bankName;
	@FindBy(xpath = "//iframe[@class='razorpay-checkout-frame']")
	WebElement iframeLocator;
	@FindBy(xpath = "//iframe[@src='https://www.googletagmanager.com/static/service_worker/5a20/sw_iframe.html?origin=https%3A%2F%2Fapplyonline.staging.ramfincorp.co.in']")
	WebElement feedbackiframe;
	@FindBy(xpath = "//input[@id='contact']")
	WebElement contactField;
	@FindBy(xpath = "//span[text()='I Accept']")
	WebElement kfsAccept;
	//input[@id='contact']
	@FindBy(xpath="//iframe[@id='jouneryFrame']")
	WebElement framestagingrunTeam;
	@FindBy(xpath="//iframe[@class='razorpay-checkout-frame']")
	WebElement frameEmandate;
	@FindBy(xpath="//input[@id='contact']")
	WebElement contactNoEmandate;
	@FindBy(xpath="//button[text()='Authenticate']")
	WebElement AuthenticateEmandate;
	@FindBy(xpath="//div[@class='auth-option item aadhaar svelte-13gz49']")
	WebElement AuthenticateusingAadhar;
	@FindBy(xpath="//button[text()='Success']")
	WebElement successRajorPay;
	@FindBy(xpath="//button[text()='Submit']")
	WebElement submit;
	@FindBy(xpath="//button[text()='10']")
	WebElement tenrating;
	
	public void enterMobile(String mobile) throws InterruptedException {
		//EnterUserName.clear();
		Thread.sleep(2000);
		//driver.switchTo().frame(framestagingrunTeam);
		   EnterMobileNo.sendKeys(mobile);
		GetOtp.click();
		  // Thread.sleep(10000);
		 //  Verifybtn.click();
	}
public void click_getcash() throws InterruptedException {
	Thread.sleep(6000);
//	driver.switchTo().frame(feedbackiframe);
//	tenrating.click();
//	submit.click();
	//Thread.sleep(2000);
	GetCash.click();
}
public void click_next_one_page() throws InterruptedException {
	Thread.sleep(2000);
	Next.click();
}
	public void enterPANandPIN(String PAN,String PIN) throws InterruptedException {
		//EnterUserName.clear();
		Thread.sleep(4000);
		GetCash.click();
		Thread.sleep(2000);
		PANfield.sendKeys(PAN);
		PINfield.sendKeys(PIN);
		Next.click();
	}
	public void PANdetailverify() throws InterruptedException {
		//EnterUserName.clear();
		Yesbtn.click();
		}

	public void modeofpayment() throws InterruptedException {
		//EnterUserName.clear();
		Thread.sleep(2000);
		BankTransfer.click();
	}
	public void enterCompanyandIncome(String MI) throws InterruptedException {
		//EnterUserName.clear();
		Thread.sleep(2000);
		//Companyname.sendKeys(Cname);
		
		MonthlyIncome.sendKeys(MI);
		Next.click();
	}
	public void enterSalaryDate() throws InterruptedException {
		//EnterUserName.clear();
		Thread.sleep(4000);
		dateofSalary.click();
	}
	public void LoanSelectContinue() throws InterruptedException {
		//EnterUserName.clear();
		Thread.sleep(4000);
		Continue.click();
	}
	public void ApprovalPageContinue() throws InterruptedException {
		//EnterUserName.clear();
		Thread.sleep(5000);
		Continue.click();
	}
	public void employmentDetail() throws InterruptedException {
		//EnterUserName.clear();
		Thread.sleep(5000);
		Salaried.click();
		
	}
	public void LoanPurpose() throws InterruptedException {
		//EnterUserName.clear();
		Thread.sleep(2000);
		PersonalEmergency.click();
		
	}
	public void enterEmailandNext(String email) throws InterruptedException {
		//EnterUserName.clear();
		Thread.sleep(2000);
		EnterEmail.sendKeys(email);
		Next.click();
	}
	public void enterAadharandNext(String aadhar) throws InterruptedException {
		//EnterUserName.clear();
		Thread.sleep(2000);
		EnterAadhar.sendKeys(aadhar);
		Next.click();
	}
	public void enterOtpandNext() throws InterruptedException {
		//EnterUserName.clear();
		Thread.sleep(20000);
		Next.click();
	}
	public void enterBankDetails(String accHolderName,String accNo,String ReAccNo,String IFSC) throws InterruptedException {
		
		Thread.sleep(5000);
		AccountHolderName.clear();
		AccountHolderName.sendKeys(accHolderName);
		AccountNo.sendKeys(accNo);
		confirmAccountNo.sendKeys(ReAccNo);
		enterIFSC.sendKeys(IFSC);
		Thread.sleep(2000);
		Next.click();
	
	}
	public void Emandate_Continue() throws InterruptedException {
		Thread.sleep(2000);
		EmandateContinue.click();
		Thread.sleep(2000);
		
	}
	public void EmandateContact() throws InterruptedException {
		Thread.sleep(2000);
		driver.switchTo().frame(frameEmandate);
	    contactNoEmandate.sendKeys("6666666666");
		AuthenticateEmandate.click();
	}
	
	public void EMauthenticate_with_Aadhar() throws InterruptedException {
		Thread.sleep(2000);
		AuthenticateusingAadhar.click();
		Thread.sleep(2000);
	}
	
	public void rajorpaysuccess() throws InterruptedException{
		// Get current window handle (parent)
		String parentWindow = driver.getWindowHandle();

		// Click something that opens a new window/tab
		AuthenticateEmandate.click();
		
		// Get all window handles
		Set<String> allWindows = driver.getWindowHandles();

		// Loop through and switch to the child window
		for (String handle : allWindows) {
		    if (!handle.equals(parentWindow)) {
		        driver.switchTo().window(handle);
		        System.out.println("Switched to child window: " + driver.getTitle());
		        
		        // Perform some action in new window
		        successRajorPay.click();
		        
		        // Close child window if needed
		        
		    }
		}

		// Switch back to the main (parent) window
		driver.switchTo().window(parentWindow);
		System.out.println("Back to parent window: " + driver.getTitle());
       
	}
	
	public void selectBnkAcfordisburse() throws InterruptedException {
		//EnterUserName.clear();
		//Thread.sleep(2000);
		Continue.click();
	}

	public void ReemandatePage() throws InterruptedException {
		//EnterUserName.clear();
		Thread.sleep(9000);
		EmandateContinue.click();
		//Thread.sleep(3000);
		//EmandateContinue.click();
	}

	public void verifiedbnkaccpage() throws InterruptedException {
		//EnterUserName.clear();
		//Thread.sleep(5000);
		Continue.click();
	}
	public void checkboxBank() throws InterruptedException {
		//EnterUserName.clear();
		//Thread.sleep(15000);
	
	}
	
	public void KFSAcceptance() {
	    //Thread.sleep(7000);
		kfsAccept.click();
	}
	public void DisbursalfromCRM() {
	    // Write code here that turns the phrase above into concrete actions
	    try {
			Thread.sleep(50000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Then locate your element inside that frame
	//driver.findElement(By.id("username")).sendKeys("Mukund");

	// Always go back to main page after operation
	//driver.switchTo().defaultContent();
		public void GetOTPandEnter() throws IOException, SQLException, InterruptedException
	{
		String filepath2=System.getProperty("user.dir")+"\\testdata\\locations.xlsx";
		
		Connection con=DriverManager.getConnection("jdbc:mysql://10.1.106.143/ramfin?allowPublicKeyRetrieval=true&useSSL=false","preprod_read","Re@d1234");
		//statement/query//"jdbc:mysql://localhost:3306/your_db_name", "root", "your_password");
				Statement stmt = con.createStatement();
				Thread.sleep(3000);
				ResultSet rs= stmt.executeQuery("SELECT * FROM customer WHERE mobile=7488660739;");
			//System.out.println(rs);	
			XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet sheet=workbook.createSheet("User data");
			XSSFRow row=sheet.createRow(0);
			row.createCell(21).setCellValue("otp");
			
			int r=1;
			int otp=0;
			while(rs.next())
			{
				otp =rs.getInt("otp");
				row=sheet.createRow(r++);
				row.createCell(0).setCellValue(otp);
						
			}
			FileOutputStream fos=new FileOutputStream(".\\testdata\\otp.xlsx");
			XSSFRow currentRow = sheet.getRow(1);
		    XSSFCell cell = currentRow.getCell(0);
	         String otp_=otp+"";
			
			System.out.print(cell.toString() + "\t");
			//System.out.println(otp);
			//EnterOTP.clear();
			OTPfield.sendKeys(otp_);
			
			Verifybtn.click();
			
			workbook.close();
	//Recheck tbelow code



	}



}
