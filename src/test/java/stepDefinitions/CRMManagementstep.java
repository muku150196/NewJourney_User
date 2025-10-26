//package stepDefinitions;
//
//import java.io.IOException;
//import java.sql.SQLException;
//import java.util.HashMap;
//import java.util.List;
//
//import org.junit.Assert;
//
//import Factory.BaseClass;
//import PageObjects.CRMManagementPage;
//import PageObjects.LoginPage;
//import PageObjects.SearchByPage;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import utilities.DataReader;
//
//public class CRMManagementstep {
//
//	
//    LoginPage lp=new LoginPage(BaseClass.getDriver());
//  //SearchByPage  sp=new SearchByPage(BaseClass.getDriver());
// 	CRMManagementPage cp=new CRMManagementPage(BaseClass.getDriver());
// 	  List<HashMap<String, String>> datamap; //Data driven
//      
//	SearchByPage sp=new SearchByPage(BaseClass.getDriver());
//    
//	@Given("the user has logged into CRM management application")
//	public void the_user_has_logged_into_crm_management_application() throws InterruptedException, IOException, SQLException {
//	    // Write code here that turns the phrase above into concrete actions
//		
//		lp.setUsername("mukundAutomation");
//    	lp.setPassword("1234");
//    	lp.clickLogin();
//    	Thread.sleep(2000);
//    	lp.GetOTPandEnter();
//		if(lp.VerifyLogin().equals("ॐ नमो भगवते वासुदेवाय नमः"))
//        {
//        	   Assert.assertTrue(true);
//        }
//        else
//        {
//        	 Assert.assertTrue(false);
//
//        }
//	}
//	@When("user clicks on CRM Management>>Users>>test with mobile as  {string}")
//	public void user_clicks_on_crm_management_users_test_with_mobile_as(String MobileNo)  throws InterruptedException {
//	   cp.CRM_Management();
//	   cp.Usersoption();
//	   cp.SearchByoption();
//	   cp.MobileOption();
//	   cp.Selected_option_detail(MobileNo);
//	   cp.Roles_as_Admin();
//	   cp.Status();
//	   
//	   cp.SearchClick();
//	}
//
//	@When("the user verifies with data displayed")
//	public void the_user_verifies_with_data_displayed() throws InterruptedException {
//	    // Write code here that turns the phrase above into concrete actions
//	   
//		String expectedMobNo = "Mobile Number";
//	    
//		 String DisplayedMobNo=cp.Mobile_Number_Displayed();
//		 
//		 String expectedrole = "Admin";
//		    
//		 String RoleDisplayed =cp.role_Displayed();
//		 String Expectedstatus="Active";
//		 String StatusDisplyed=cp.Status_chosen();
//		 
//		 
//		 //String DisplayedMo=cp.Mobile_Number_Displayed();
//	  	  try {
//		        Assert.assertEquals(expectedMobNo,DisplayedMobNo);
//	  	  }
//	  	  catch(Exception e) {
//	  		  System.out.println("Mobile Number  name column not displayed");
//	  	  }
//	  	try {
//	        Assert.assertEquals("9555104210",cp.MobileNumberdataDisplayed());
//  	  }
//  	  catch(Exception e) {
//  		  System.out.println("Mobile Number  data not matched");
//  	  }
//	  	  System.out.println(cp.Mobile_Number_Displayed());
//	  	  System.out.println(cp.MobileNumberdataDisplayed());
//	  	System.out.println(cp.role_Displayed());
//	  	System.out.println(StatusDisplyed);
//	  	try {
//	        Assert.assertEquals(expectedrole,RoleDisplayed);
//  	  }
//  	  catch(Exception e) {
//  		  System.out.println("Role  data not matched");
//  	  }
//	  	try {
//	        Assert.assertEquals(Expectedstatus,StatusDisplyed);
//  	  }
//  	  catch(Exception e) {
//  		  System.out.println("status  data not matched");
//  	  }
//	  	
//	  	  
//	  	  
//	}
//	@When("the user clicks Excel download")
//	public void the_user_clicks_excel_download() throws InterruptedException {
//	    // Write code here that turns the phrase above into concrete actions
//	   cp.ExcelDownloadClick();
//	}
//
//	@When("User clicks {string} button")
//	public void user_clicks_button(String string) throws InterruptedException {
//	    // Write code here that turns the phrase above into concrete actions
//	   cp.ClearFilterClick();
//	}
//
//	@When("User Clicks {string} icon to add Users")
//	public void user_clicks_icon_to_add_users(String string) throws InterruptedException {
//	    // Write code here that turns the phrase above into concrete actions
//	    cp.addUserClick();
//	}
//
//	@Then("User goes to {string} title Page")
//	public void user_goes_to_title_page(String string) throws InterruptedException {
//	    // Write code here that turns the phrase above into concrete actions
//	   // cp.UserTitleVerify();
//	    
//	    try {
//	        Assert.assertEquals(cp.UserTitleVerify(),"User");
//  	  }
//  	  catch(Exception e) {
//  		  System.out.println(" User title page not displayed");
//  	  }
//	}
//	@When("user clicks on CRM Management>>Users>>test with Mobiledata fromExcel with  {string}")
//	public void user_clicks_on_crm_management_users_test_with_mobiledata_from_excel_with(String rows) throws InterruptedException {
//    // Write code here that turns the phrase above into concrete actions
//		  datamap=DataReader.data(System.getProperty("user.dir")+"\\TestData\\user_management_list_20250710_111010.xlsx", "Sheet1");
//		
//	       int index=Integer.parseInt(rows)-1;
//	    //String Name = datamap.get(index).get("Name");
//	    String MobileNo = datamap.get(index).get("Mobile");
//	   /* String custID= datamap.get(index).get("CustID");
//	    String leadID = datamap.get(index).get("LeadID");
//	    String LoanNo= datamap.get(index).get("LoanNo");
//	    String Email= datamap.get(index).get("Email");
//	    String PAN= datamap.get(index).get("PAN");
//	    String Aadhar= datamap.get(index).get("Aadhar");*/
//	    
//
//	    CRMManagementPage  cp=new CRMManagementPage(BaseClass.getDriver());
//	 
//	    	{
//	    		 {
//	    			 
//	    			 cp.CRM_Management();
//	    			   cp.Usersoption();
//	    			   cp.SearchByoption();
//	    			   cp.MobileOption();
//	    			   cp.Selected_option_detail(MobileNo);
//	    			  // cp.Roles_as_Admin();
//	    			   //cp.Status();
//	    			   
//	    			   cp.SearchClick();
//	    			
//	    		    	 String confMobile=cp.MobileNumberdataDisplayed();
//	    		  	  
//	    				if(MobileNo.equalsIgnoreCase(confMobile))
//	    				{
//	    					System.out.println("Test passed");
//	    				}
//	    				else
//	    				{
//	    					System.out.println("Test failed");
//	    					
//	    				}
//	    				
//	    		    	
//	    		    }
//	    	}
//	}
//}