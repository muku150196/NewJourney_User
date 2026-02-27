package PageObjects;

import java.io.FileOutputStream;



import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class onb_journey_PS extends BasePage {
	
	public onb_journey_PS(WebDriver driver) {
		super(driver);
	}

	//package pageObjects;


	@FindBy(xpath = "//input[@placeholder='Enter your mobile number']")
	WebElement EnterMobileNo;
	
	@FindBy(xpath = "//button[text()='Get OTP']")
	WebElement GetOtp;

	@FindBy(xpath = "//input[@class='EnterOTP_form__input__7-oPk']")
	WebElement OTPfield;
	@FindBy(xpath = "//button[text()='Verify OTP']")
	WebElement Verifybtn;
	@FindBy(xpath = "//span[text()='Get Cash']")
	WebElement GetCash;
	
	@FindBy(xpath = "//h1[text()='Pan Verification']")
	WebElement EnterPanTitle;
	//@FindBy(xpath = "//input[@placeholder='Enter Your PAN']")
	//WebElement PANfield;
	@FindBy(xpath = "//input[@id='panNumber']")
	WebElement PANfield;

	@FindBy(xpath = "//input[@placeholder='Enter PIN Code']")
	WebElement PINfield;
	@FindBy(xpath = "//span[text()='Select Loan Purpose']")
	WebElement LoanPurposedrpdn;
	
	@FindBy(xpath = "//button[text()='Yes, Confirm']")
	WebElement Yesbtn;
	@FindBy(xpath = "//button[text()='Bank Transfer']")
	WebElement BankTransfer;
	@FindBy(xpath = "//input[@name='companyName']")
	WebElement Companyname;
	
	@FindBy(xpath = "//input[@placeholder='Enter Monthly Income']")
	WebElement MonthlyIncome;
	@FindBy(xpath = "//span[text()='Next']")
	WebElement Next;
	@FindBy(xpath = "//button[text()='19']")
	WebElement dateofSalary;

	@FindBy(xpath = "//button[text()='Continue']")
	WebElement Continue;
	By EmandateContinue= By.xpath("//button[text()='Continue ']");
	
	@FindBy(xpath = "//div[text()='Salaried']")
	WebElement Salaried;
	@FindBy(xpath = "//button[text()='Self Employed']")
	WebElement SelfEmployed;
	
	@FindBy(xpath = "//span[text()='Personal Emergency']")
	WebElement PersonalEmergency;
	@FindBy(xpath = "//span[text()='Rent / Bills']")
	WebElement Rent_Bills;
	@FindBy(xpath = "//span[text()='Medical Emergency']")
	WebElement Medical_Emergency;
	@FindBy(xpath = "//span[text()='Salary Delay']")
	WebElement Salary_Delay;
	@FindBy(xpath = "//span[text()='Education']")
	WebElement Education;
	@FindBy(xpath = "//span[text()='Others']")
	WebElement Others;

	@FindBy(xpath = "//input[@placeholder='Enter Your Email ID']")
	WebElement EnterEmail;
	
	@FindBy(xpath = "//input[@placeholder='1234-5678-9000']")
	WebElement EnterAadhar;
	@FindBy(xpath = "//input[@name='accountHolderName']")
	WebElement AccountHolderName;
	@FindBy(xpath = "//input[@id='accountNo']")
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
	@FindBy(xpath="//button[@type='submit']")
	WebElement reemandatebtn;
	@FindBy(xpath="//button[text()='10']")
	WebElement tenrating;
   @FindBy(xpath = "//div[@style='display: flex; align-items: center;']")
    WebElement OTPfieldonb;
   @FindBy(xpath = "//button[@class='CustomButton_custom__button__Hi2sZ false false']")
   WebElement loanselectcontinue;

@FindBy(xpath="//iframe[@id='jouneryFrame']")
WebElement emandateiframe;
@FindBy(xpath="//input[@placeholder='Search Bank']")
WebElement SearchBankfinbox;

@FindBy(xpath="(//div[@class='sc-koXPp iqXyfA'])/div[1]")
WebElement Searched_bank;

@FindBy(xpath="(//div[text()='Fetch using Phone Number'])")
WebElement verify_finbox_phone_No;


 @FindBy(xpath="//div[contains(@class, 'SalaryDate_date__P4w2v')]")
 WebElement dateOptions;
 @FindBy(xpath="//button[text()='Proceed']")
 WebElement proceed_Finbox;
 @FindBy(xpath="//button[text()='Use Account']")
 WebElement Use_Account;
 @FindBy(xpath="//button[text()='Agree (1)']")
 WebElement Agree_Finbox;

 
 @FindBy(xpath="//button[text()='Continue']")
 WebElement Continuebtn;
 
 @FindBy(xpath="//button[text()='Send OTP']")
 WebElement Send_Otp;
 
 
 @FindBy(xpath="//button[text()='Verify OTP']")
 WebElement Verify_OTP;
public void DeletUserdata() throws IOException, SQLException, InterruptedException
{
		Thread.sleep(1000);
	//String filepath2=System.getProperty("user.dir")+"\\testdata\\locations.xlsx";

	Connection con=DriverManager.getConnection("jdbc:mysql://10.1.106.143:3306/ramfin?allowPublicKeyRetrieval=true&useSSL=false","update_staging","Update@12789");
	//statement/query//"jdbc:mysql://localhost:3306/your_db_name", "root", "your_password");
			Statement stmt = con.createStatement();
			Thread.sleep(3000);

			 stmt.executeUpdate("UPDATE leads l JOIN customer c ON l.customerID = c.customerID SET l.lenderID = 1 WHERE c.mobile = '8406052868';");
			
}


	public void enterMobile(String mobile) throws InterruptedException {
		//EnterUserName.clear();
		Thread.sleep(2000);
		//driver.switchTo().frame(framestagingrunTeam);
		   EnterMobileNo.sendKeys(mobile);
		   
		GetOtp.click();
		
		  Thread.sleep(10000);
		 // OTPfieldonb.sendKeys("987654");
		  
		  Verifybtn.click();
	}
public void click_getcash() throws InterruptedException {
	Thread.sleep(2000);
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
	public void enterPANandPIN(String PAN,String PIN) throws InterruptedException  {
		//EnterUserName.clear();
		
			Thread.sleep(5000);
            PANfield.sendKeys(PAN);
	        Thread.sleep(2000);
		    PINfield.sendKeys(PIN);
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
//			
//			Thread.sleep(2000);
//			
			// TODO Auto-generated catch block
			
		}
		
	
	public void PANdetailverify() throws InterruptedException  {
		//EnterUserName.clear();
	
			Thread.sleep(5000);
			Yesbtn.click();
		
		
		}

	public void modeofpayment() throws InterruptedException  {
		//EnterUserName.clear();
	
			Thread.sleep(1000);
			BankTransfer.click();

			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

			
			
		
	}
	public void enterCompanyandIncome(String MI) throws InterruptedException  {
		//EnterUserName.clear();
	
			Thread.sleep(1000);

			MonthlyIncome.sendKeys(MI);
			
			}
	public void enterSalaryDate() throws InterruptedException  {
		//EnterUserName.clear();
		
			Thread.sleep(2000);
			dateofSalary.click();

				  

	}
	public void LoanSelectContinue() throws InterruptedException  {
		//EnterUserName.clear();



		Thread.sleep(2000);
		Continue.click();
		
		


	}
	
	public void bankSearchFinbox(String bankName) throws InterruptedException  {
		//EnterUserName.clear();
Thread.sleep(15000);
SearchBankfinbox.sendKeys(bankName);
Thread.sleep(9000);
Searched_bank.click();
Thread.sleep(5000);
verify_finbox_phone_No.click();
Thread.sleep(5000);
proceed_Finbox.click();
Thread.sleep(25000);
Use_Account.click();
Thread.sleep(5000);
Agree_Finbox.click();
Thread.sleep(200000);
}
	
	

	public void LoanSelectrefresh() throws InterruptedException  {

	Thread.sleep(4000);
	driver.navigate().refresh();


		
	}
	public void ApprovalPageContinue() throws InterruptedException {
		//EnterUserName.clear();
		Thread.sleep(7000);
		Continue.click();
		Thread.sleep(10000);
	}
	public void employmentDetail() throws InterruptedException {
		//EnterUserName.clear();
		
			Thread.sleep(5000);
			//Salaried.click();
			SelfEmployed.click();
		
		
		
	}
	public void employmentDetailasSelf() throws InterruptedException {
		//EnterUserName.clear();
		
			Thread.sleep(5000);
			//Salaried.click();
			SelfEmployed.click();
		
		
		
	}
	public void LoanPurpose() throws InterruptedException  {
		//EnterUserName.clear();
		
			Thread.sleep(2000);
			LoanPurposedrpdn.click();
			
			//PersonalEmergency.click();
			//Others.click();
			//Medical_Emergency.click();
			//Education.click();
			//Rent_Bills.click();
			Thread.sleep(2000);
			Salary_Delay.click();
			Thread.sleep(2000);
			Continue.click();
			
		
		
	}
	public void enterEmailandNext(String email) throws InterruptedException  {
		//EnterUserName.clear();
		
			Thread.sleep(4000);
			
			EnterEmail.sendKeys(email);
			Continue.click();
			Thread.sleep(30000);
			Verify_OTP.click();
			
		
		
	}
	public void enterAadharandNext(String aadhar) throws InterruptedException  {
		//EnterUserName.clear();
		
			Thread.sleep(5000);
			Continue.click();

			Thread.sleep(2000);
			EnterAadhar.sendKeys(aadhar);

			Thread.sleep(2000);
			Send_Otp.click();
			
		
	}
	public void enterOtpandNext() throws InterruptedException {
		//EnterUserName.clear();
		Thread.sleep(30000);
		Verify_OTP.click();
	}
	public void enterBankDetails(String accNo,String ReAccNo,String IFSC) throws InterruptedException  {
		
		
			Thread.sleep(6000);
			
			AccountNo.sendKeys(accNo);
			
			confirmAccountNo.sendKeys(ReAccNo);
			enterIFSC.sendKeys(IFSC);
			Thread.sleep(2000);
			submit.click();
		
	}
	public void Emandate_Continue() throws InterruptedException {

		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		    List<WebElement> allButtons = wait.until(
		            ExpectedConditions.presenceOfAllElementsLocatedBy(EmandateContinue)
		    );

		    for (WebElement btn : allButtons) {
		        if (btn.isDisplayed()) {
		            wait.until(ExpectedConditions.elementToBeClickable(btn)).click();
		            break;
		        }
		    }
		}	

//	public void Emandate_Continue() throws InterruptedException {
//		Thread.sleep(12000);
//	
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.elementToBeClickable(EmandateContinue)).click();
//
//	}
	public void EmandateContact() throws InterruptedException {
		Thread.sleep(8000);
		driver.switchTo().frame(frameEmandate);
		Thread.sleep(2000);
	    contactNoEmandate.sendKeys("7777777777");
	    Thread.sleep(2000);
		AuthenticateEmandate.click();
	}
	
	
	
	public void EMauthenticate_with_Aadhar() throws InterruptedException {
		Thread.sleep(2000);
		AuthenticateusingAadhar.click();
		Thread.sleep(2000);
	}
	
	
	public void continue_btn() {
		try {
			Thread.sleep(12000);
			Continuebtn.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
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

	public void ReemandatePage() throws InterruptedException  {
		//EnterUserName.clear();
		Thread.sleep(10000);
		driver.switchTo().frame(emandateiframe);
		reemandatebtn.click();
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
	
	public void KFSAcceptance() throws InterruptedException {
	    Thread.sleep(6000);
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
			Thread.sleep(1000);
		//String filepath2=System.getProperty("user.dir")+"\\testdata\\locations.xlsx";

		Connection con=DriverManager.getConnection("jdbc:mysql://10.1.106.143:3306/ramfin?allowPublicKeyRetrieval=true&useSSL=false","update_staging","Update@12789");
		//statement/query//"jdbc:mysql://localhost:3306/your_db_name", "root", "your_password");
				Statement stmt = con.createStatement();
				Thread.sleep(3000);
				stmt.executeUpdate("UPDATE leads l JOIN customer c ON l.customerID = c.customerID SET l.lenderID = 1 WHERE c.mobile = '7488660739'");
//				Thread.sleep(7000);
//				 String sql =
//						    "INSERT INTO bureauData ( " +
//						    " customerID, leadID, reference_id, " +
//						    " affordability_generic, predicted_income, predicted_affordability, " +
//						    " Decision, LoanAmount, emi_eligible, emi_max_tenure, " +
//						    " emi_max_monthly_amt, long_term_emi_eligible, " +
//						    " long_term_tenure, long_term_loan_amount, " +
//						    " long_term_loan_roi, approval_roi ) " +
//						    "SELECT " +
//						    " c.customerID, l.leadID, CONCAT(c.customerID,'|',l.leadID), " +
//						    " 85000, 50000, 75000, 'Approve', 15000, '1', 4, " +
//						    " 5000, '1', 6, 40000, 180, 180 " +
//						    "FROM customer c " +
//						    "JOIN leads l ON l.customerID = c.customerID " +
//						    "WHERE c.Mobile = '7488660739' " +
//						    "ON DUPLICATE KEY UPDATE " +
//						    " affordability_generic = 85000, " +
//						    " predicted_income = 50000, " +
//						    " predicted_affordability = 75000, " +
//						    " Decision = 'Approve', " +
//						    " LoanAmount = 15000, " +
//						    " emi_eligible = '1', " +
//						    " emi_max_tenure = 4, " +
//						    " emi_max_monthly_amt = 5000, " +
//						    " long_term_emi_eligible = '1', " +
//						    " long_term_tenure = 6, " +
//						    " long_term_loan_amount = 40000, " +
//						    " long_term_loan_roi = 180, " +
//						    " approval_roi = 180";
//
//						stmt.executeUpdate(sql);
//
//
//						 Thread.sleep(7000);
//						 
				 //ResultSet rs= stmt.executeQuery("SELECT * FROM customer WHERE mobile=7488660739;");
			//System.out.println(rs);	
			
//			XSSFWorkbook workbook = new XSSFWorkbook();
//			XSSFSheet sheet=workbook.createSheet("User data");
//			XSSFRow row=sheet.createRow(0);
//			row.createCell(21).setCellValue("otp");
//			
//			int r=1;
//			int otp=0;
//			while(rs.next())
//			{
//				otp =rs.getInt("otp");
//				row=sheet.createRow(r++);
//				row.createCell(0).setCellValue(otp);
//						
//			}
//			FileOutputStream fos=new FileOutputStream(".\\testdata\\otp.xlsx");
//			XSSFRow currentRow = sheet.getRow(1);
//		    XSSFCell cell = currentRow.getCell(0);
//	         String otp_=otp+"";
//			
//			System.out.print(cell.toString() + "\t");
//		
//			OTPfield.sendKeys(otp_);
//			
//			Verifybtn.click();
//			
			//workbook.close();
	



	}

		public void Emicreation() throws IOException, SQLException, InterruptedException
		{
				Thread.sleep(1000);
			//String filepath2=System.getProperty("user.dir")+"\\testdata\\locations.xlsx";

			Connection con_=DriverManager.getConnection("jdbc:mysql://10.1.106.143:3306/ramfin?allowPublicKeyRetrieval=true&useSSL=false","update_staging","Update@12789");
			//statement/query//"jdbc:mysql://localhost:3306/your_db_name", "root", "your_password");
					Statement stmt = con_.createStatement();
					Thread.sleep(3000);
					String sqlPayday =
						    "INSERT INTO ramfin.bureauData ( " +
						    " customerID, leadID, reference_id, affordability_generic, predicted_income, predicted_affordability, " +
						    " Decision, LoanAmount, version, emi_eligible, emi_max_tenure, emi_max_monthly_amt, api_version, " +
						    " long_term_emi_eligible, long_term_tenure, long_term_loan_amount, long_term_loan_roi, approval_roi, " +
						    " createdDate, iu_date, personal_loan_decision, personal_loan_max_emi_amount, personal_loan_roi, " +
						    " personal_loan_max_tenure, month12_flag, loan_type, emi_roi, disable_mandate ) " +
						    "SELECT c.customerID, l.leadID, CONCAT(c.customerID,'|',l.leadID), " +
						    " NULL, NULL, NULL, 'Approve', 10000.0, 'v1', NULL, NULL, NULL, 'v4', " +
						    " NULL, NULL, NULL, NULL, NULL, '2026-01-08 12:57:07', '2026-01-08 12:57:07', " +
						    " 'Reject', NULL, NULL, NULL, NULL, 'payday', NULL, '1' " +
						    "FROM customer c JOIN leads l ON l.customerID = c.customerID " +
						    "WHERE c.mobile = 7488660739";
					stmt.executeUpdate(sqlPayday);
					Thread.sleep(3000);
					String sqlEmi =
						    "INSERT INTO ramfin.bureauData ( " +
						    " customerID, leadID, reference_id, affordability_generic, predicted_income, predicted_affordability, " +
						    " Decision, LoanAmount, version, emi_eligible, emi_max_tenure, emi_max_monthly_amt, api_version, " +
						    " long_term_emi_eligible, long_term_tenure, long_term_loan_amount, long_term_loan_roi, approval_roi, " +
						    " createdDate, iu_date, personal_loan_decision, personal_loan_max_emi_amount, personal_loan_roi, " +
						    " personal_loan_max_tenure, month12_flag, loan_type, emi_roi, disable_mandate ) " +
						    "SELECT c.customerID, l.leadID, CONCAT(c.customerID,'|',l.leadID), " +
						    " NULL, NULL, NULL, 'Approve', NULL, 'v1', '1', 3, 7589, 'v2', " +
						    " '1', 6, 15345.0, 8, NULL, '2026-01-07 22:16:52', '2026-01-08 12:58:31', " +
						    " 'Approve', 36500, 10, 12, NULL, 'emi', 10, NULL " +
						    "FROM customer c JOIN leads l ON l.customerID = c.customerID " +
						    "WHERE c.mobile = 7488660739";
					stmt.executeUpdate(sqlEmi);	
							
							Thread.sleep(7000);
		}


		
		
		
		public void ChangePAN() throws IOException, SQLException, InterruptedException
		{
				Thread.sleep(1000);
			//String filepath2=System.getProperty("user.dir")+"\\testdata\\locations.xlsx";

			Connection con=DriverManager.getConnection("jdbc:mysql://10.1.106.143:3306/ramfin?allowPublicKeyRetrieval=true&useSSL=false","update_staging","Update@12789");
			//statement/query//"jdbc:mysql://localhost:3306/your_db_name", "root", "your_password");
					Statement stmt = con.createStatement();
					Thread.sleep(3000);
					String sql = "UPDATE customer SET pancard = CONCAT(" +
					        "CHAR(FLOOR(65 + RAND() * 26))," +
					        "CHAR(FLOOR(65 + RAND() * 26))," +
					        "CHAR(FLOOR(65 + RAND() * 26))," +
					        "CHAR(FLOOR(65 + RAND() * 26))," +
					        "CHAR(FLOOR(65 + RAND() * 26))," +
					        "FLOOR(1000 + RAND() * 9000)," +
					        "CHAR(FLOOR(65 + RAND() * 26))" +
					        ") WHERE mobile = ?";

		}
}
