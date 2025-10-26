package stepDefinitions;


import java.io.IOException;



import java.sql.SQLException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Factory.BaseClass;
//import Factory.BaseClass;
//import Factory.BaseClass.SessionManager;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import pageObjects.MyAccountPage;
//import pageObjects.HomePage;
import PageObjects.LoginPage;
//import pageObjects.MyAccountPage;
import utilities.DataReader;
 
public class LoginSteps {
	
     WebDriver driver;
     //HomePage hp;
     LoginPage lp;
     //MyAccountPage macc;
    // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

     List<HashMap<String, String>> datamap; //Data driven
     @Given("the user is on the Ram Fincorp login page")
     public void the_user_is_on_the_ram_fincorp_login_page() {
         // Write code here that turns the phrase above into concrete actions
    	 BaseClass.getLogger().info("Goto crm URL ");
     	lp=new LoginPage(BaseClass.getDriver());
     	
     }

     @When("user enters Mobile Number as {string}")
     public void user_enters_mobile_number_as(String mobile) throws InterruptedException {
         // Write code here that turns the phrase above into concrete actions
     lp.enterMobile(mobile);
     }


     @When("User Enter OTP in EnterOTP field")
     public void user_enter_otp_in_enter_otp_field() throws IOException, SQLException, InterruptedException {
         // Write code here that turns the phrase above into concrete actions
    	 lp.GetOTPandEnter();
     }

 	@Then("user Enters  PAN AS {string} and PINcode as {string} in Enter your Pan Page")
 	public void user_enters_pan_as_and_pi_ncode_as_in_enter_your_pan_page(String PAN, String PIN) throws InterruptedException {
 	    // Write code here that turns the phrase above into concrete actions
 		lp.enterPANandPIN(PAN, PIN);
 	}
 	@Then("User clicks on Get cash")
 	public void user_clicks_on_get_cash() throws InterruptedException {
 	    // Write code here that turns the phrase above into concrete actions
 	    lp.click_getcash();
 	}

 	@Then("User clicks on Next button on one page")
 	public void user_clicks_on_next_button_on_one_page() throws InterruptedException {
 	    // Write code here that turns the phrase above into concrete actions
 	   lp.click_next_one_page();
 	}


 	@Then("user clicks Yes on PAN,NAME AND DOB match page")
 	public void user_clicks_yes_on_pan_name_and_dob_match_page() {
 	    // Write code here that turns the phrase above into concrete actions
 	try {
		lp.PANdetailverify();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 	}
 	@When("User click {string} in  Mode of Payment page")
 	public void user_click_in_mode_of_payment_page(String string) {
 	    // Write code here that turns the phrase above into concrete actions
 	    try {
			lp.modeofpayment();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 	}

 	@When("User enters MonthlyIncome as {string} and click Next")
 	public void user_enters_monthly_income_as_and_click_next(String MI) {
 	    // Write code here that turns the phrase above into concrete actions
 		try {
 			lp.enterCompanyandIncome(MI);
 		} catch (InterruptedException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
 	}

 	
	@Then("User enters salary date as {string}")
	public void user_enters_salary_date_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    try {
			lp.enterSalaryDate();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Then("user click Continue button on Loan Selection Screen")
	public void user_click_continue_button_on_loan_selection_screen() {
	    // Write code here that turns the phrase above into concrete actions
		try {
			lp.LoanSelectContinue();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("User click Continue on offerpage")
	public void user_click_continue_on_offerpage() {
	    // Write code here that turns the phrase above into concrete actions
	    try {
			lp.ApprovalPageContinue();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Then("User clicks {string} on  employmentDetails")
	public void user_clicks_on_employment_details(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    try {
			lp.employmentDetail();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@When("User clicks Personal Emergency on Loan Purpose")
	public void user_clicks_personal_emergency_on_loan_purpose() {
	    // Write code here that turns the phrase above into concrete actions
	  try {
		lp.LoanPurpose();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	@Then("User enters Email as {string} and clicks Next")
	public void user_enters_email_as_and_clicks_next(String email) {
	    // Write code here that turns the phrase above into concrete actions
	    try {
			lp.enterEmailandNext(email);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
	}


	@Then("user enters aadhar as {string} and clicks Next")
	public void user_enters_aadhar_as_and_clicks_next(String aadhar) {
	    // Write code here that turns the phrase above into concrete actions
	    try {
			lp.enterAadharandNext(aadhar);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Then("User has to manually enter OTP and click next")
	public void user_has_to_manually_enter_otp_and_click_next() {
	    // Write code here that turns the phrase above into concrete actions
	    try {
			lp.enterOtpandNext();
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
		}
	}

	@When("User enter AccName as {string},AccNo as {string},cnfAc as {string},ifsc as {string}")
	public void user_enter_acc_name_as_acc_no_as_cnf_ac_as_ifsc_as(String accHolderName, String accNo, String ReAccNo, String IFSC) {
try {
	lp.enterBankDetails(accHolderName,accNo, ReAccNo, IFSC);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
@When("User clicks continue on emandate")
public void user_clicks_continue_on_emandate() {
    // Write code here that turns the phrase above into concrete actions
try {
	lp.Emandate_Continue();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}
@Then("User enters mobileNo  as {string} in ContactDetails Page")
public void user_enters_mobile_no_as_in_contact_details_page(String string) {
    // Write code here that turns the phrase above into concrete actions
    try {
		lp.EmandateContact();
	lp.EMauthenticate_with_Aadhar();
    
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		
		e.printStackTrace();
	}
}
@Then("user clicks on Success in Rajorpay window")
public void user_clicks_on_Success_in_Rajorpay_window() {
	try {
		lp.rajorpaysuccess();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
//@When("user is on Kindly select bank account for loan disbursal page and click Continue")
public void user_is_on_kindly_select_bank_account_for_loan_disbursal_page_and_click_continue() {
    // Write code here that turns the phrase above into concrete actions
    
}
@When("User is again on emandate page and click Continue")
public void user_is_again_on_emandate_page_and_click_continue() {
    // Write code here that turns the phrase above into concrete actions
    try {
		lp.ReemandatePage();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
	
	}
}
@Given("user has complete pennydrop and on slectbankacc for disbursal and click continue")
public void user_has_complete_pennydrop_and_on_slectbankacc_for_disbursal_and_click_continue() {
    // Write code here that turns the phrase above into concrete actions
  try {
	lp.verifiedbnkaccpage();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
@Then("user manually select checkbox and click Continue")
public void user_manually_select_checkbox_and_click_continue() {
    // Write code here that turns the phrase above into concrete actions
      
}

@Given("User is on KFS Page , manually selects checkbox and click continue")
public void user_is_on_kfs_page_manually_selects_checkbox_and_click_continue() {
    lp.KFSAcceptance();
    
    }

@Then("User is on ApprovedPage and manually disburse fromCRM")
public void user_is_on_approved_page_and_manually_disburse_from_crm() {
    // Write code here that turns the phrase above into concrete actions
    lp.DisbursalfromCRM();
}

}
