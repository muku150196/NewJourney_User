package stepDefinitions;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.junit.Assert;

import Factory.BaseClass;
import PageObjects.CRMManagementPage;
import PageObjects.CRM_addUser_Page;
import PageObjects.LoginPage;
import PageObjects.SearchByPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.DataReader;

public class CRMaddnewUserstep {
	CRM_addUser_Page cu=new CRM_addUser_Page(BaseClass.getDriver());
	LoginPage lp=new LoginPage(BaseClass.getDriver());
	  //SearchByPage  sp=new SearchByPage(BaseClass.getDriver());
	 	CRMManagementPage cp=new CRMManagementPage(BaseClass.getDriver());
	 	
	 List<HashMap<String, String>> datamap; 
	/*@Given("the user is on CRM Management Add User page")
	public void the_user_is_on_crm_management_add_user_page() {
	    // Write code here that turns the phrase above into concrete actions
	  BaseClass.getDriver().get("https://crmstaging-sandeepa.ramfincorp.co.in/crm-management/user-list-add");
	}*/
	/*@Given("the user has logged into CRM management application")
	public void the_user_has_logged_into_crm_management_application() throws InterruptedException, IOException, SQLException {
	    // Write code here that turns the phrase above into concrete actions
		
		lp.setUsername("mukundAutomation");
    	lp.setPassword("1234");
    	lp.clickLogin();
    	Thread.sleep(2000);
    	lp.GetOTPandEnter();
		if(lp.VerifyLogin().equals("ॐ नमो भगवते वासुदेवाय नमः"))
        {
        	   Assert.assertTrue(true);
        }
        else
        {
        	 Assert.assertTrue(false);

        }
	}*/
	@When("user clicks on CRM Management>>Users")
	public void user_clicks_on_crm_management_users()  throws InterruptedException {
	   cp.CRM_Management();
	   cp.Usersoption();
	   //cp.SearchByoption();
	   //cp.MobileOption();
	  // cp.Selected_option_detail(MobileNo);
	   //cp.Roles_as_Admin();
	   //cp.Status();
	   
	   //cp.SearchClick();
	   
	   cp.addUserClick();
	   
	}

	@When("the user enters Name and other details from Excel {string}")
	public void the_user_enters_name_and_other_details_from_excel(String rows) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		datamap=DataReader.data(System.getProperty("user.dir")+"\\TestData\\CRMNewUserData.xlsx", "Sheet1");
		//Name	Email	Mobile	DID No	Username	Password	Whatsapp email	LoginID	Enten

	       int index=Integer.parseInt(rows)-1;
	    String name = datamap.get(index).get("Name");
	    String  email= datamap.get(index).get("Email");
	    String MobileNo= datamap.get(index).get("Mobile");
	    String DID_No = datamap.get(index).get("DID No");
	    String username= datamap.get(index).get("Username");
	    String pwd= datamap.get(index).get("Password");
	    String wpemail= datamap.get(index).get("Whatsapp email");
	    String loginID= datamap.get(index).get("LoginID");
	    String enten= datamap.get(index).get("Enten");
	    

	    //SearchByPage  sp=new SearchByPage(BaseClass.getDriver());
	    CRM_addUser_Page cu=new CRM_addUser_Page(BaseClass.getDriver());
		
	    	
	    		 {
	    		    	cu.EnterName(name);
	    		 	   cu.EnterEmail(email);
	    		 	   cu.enterMobile(MobileNo);
	    		 	   cu.EnterDIDNo(DID_No);
	    		 	   cu.enterUSername(username);
	    		 	   cu.enterPassword(pwd);
	    		 	
	    		 	
	    		
	    		 	   
	    		 	   cu.enterWhatsappEmail(wpemail);
	    		 	   cu.enterLoginID(loginID);
	    		 	   cu.EnterEnten(enten);
	    		 	   
	    		 	   
	    		 	 
	    		 	   
	    		 	   
	    		 	   
	    				/*if("Success".equalsIgnoreCase(cu.verify()))
	    				{
	    					System.out.println("Test passed");
	    				}
	    				else
	    				{
	    					System.out.println("Test failed");
	    					
	    				}*/
	    				
	    		    	
	    		 }
	
	}


	// Write code here that turns the phrase above into concrete actions
			@When("the user selects Role as Admin")
	public void the_user_selects_role_as_admin() throws InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions
		cu.chooserole();
	 	   
	 	   
	}


	@When("the user selects Branch as Delhi")
	public void the_user_selects_branch_as_Delhi() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		cu.chooseBranch();
	}

	@When("the user choose Status  as Active")
	public void the_user_choose_status_as_Active() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		cu.chooseStatus();
	}


	@When("the user clicks   on Check all")
	public void the_user_clicks_on_check_all() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		cu.checkAll();
	}
        // Write code here that turns the phrase above into concrete actions
	

	@When("the user clicks on Submit")
	public void the_user_clicks_on_submit() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    cu.Submit();
	    Thread.sleep(3000);
	}

	@Then("the user should see confirmation of successful user creation")
	public void the_user_should_see_confirmation_of_successful_user_creation() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(cu.verify());
		
		if("Success".equalsIgnoreCase(cu.verify()))
		{
			System.out.println("Test passed");
		}
		
		else
		{
			System.out.println("Test failed");
			
		}
		
	}



}
