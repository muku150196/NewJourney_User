//package stepDefinitions;
//
//import java.io.FileOutputStream;
//
//import java.io.IOException;
//import java.net.URISyntaxException;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.HashMap;
//
//import java.util.List;
//import java.util.Properties;
//
//import org.apache.poi.ss.usermodel.CellType;
//import org.apache.poi.ss.usermodel.Name;
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import Factory.BaseClass;
//import PageObjects.LoginPage;
//import PageObjects.SearchByPage;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
////import pageObjects.MyAccountPage;
////import pageObjects.HomePage;
////import pageObjects.MyAccountPage;
//import utilities.DataReader;
////import utilities.DataReader;
//
//public class SearchBySteps {
//	// WebDriver driver=new ChromeDriver();
//     LoginPage lp=new LoginPage(BaseClass.getDriver());
//  //SearchByPage  sp=new SearchByPage(BaseClass.getDriver());
// 	
//  
//	SearchByPage sp=new SearchByPage(BaseClass.getDriver());;
//       List<HashMap<String, String>> datamap; //Data driven
//     // =new SearchByPage(BaseClass.getDriver());
//	     
//	  // String leadID;
//    @Given("the user is in the CRM  page")
//    public void the_user_is_in_the_crm_page() throws IOException, URISyntaxException, SQLException, InterruptedException {
//        // Write code here that turns the phrase above into concrete actions
//    	//loginSteps.login();
////lp=BaseClass.initilizeBrowser();
//    	            System.out.println("Logging in only once...");
//    	            // Perform login steps here
//    	            // e.g., launch browser, navigate, enter creds, click login
//    	          //  driver.get(p.getProperty("appURL"));
//    	        	lp.setUsername("mukundAutomation");
//    	        	lp.setPassword("1234");
//    	        	lp.clickLogin();
//    	        	Thread.sleep(2000);
//    	        	lp.GetOTPandEnter();
//    	          
//    	    		
//    	    			
//    	    		
//    	           
//    	        }
//    	    
//   
//    
//    @When("the user should test Search filter by passing  Name,MobileNo,CustID,LeadID,LoanNo,Email,PAN,Aadhar,with excel row {string}")
//    public void the_user_should_test_search_filter_by_passing_name_mobile_no_cust_id_lead_id_loan_no_email_pan_aadhar_with_excel_row(String rows) throws InterruptedException {
//        
//       datamap=DataReader.data(System.getProperty("user.dir")+"\\TestData\\CRM_USER_DATA.xlsx", "CRMUserData");
//
//       int index=Integer.parseInt(rows)-1;
//    String Name = datamap.get(index).get("Name");
//    String Mobile = datamap.get(index).get("MobileNo");
//    String custID= datamap.get(index).get("CustID");
//    String leadID = datamap.get(index).get("LeadID");
//    String LoanNo= datamap.get(index).get("LoanNo");
//    String Email= datamap.get(index).get("Email");
//    String PAN= datamap.get(index).get("PAN");
//    String Aadhar= datamap.get(index).get("Aadhar");
//    
//
//    SearchByPage  sp=new SearchByPage(BaseClass.getDriver());
// 
//    	{
//    		 {
//    		    	sp.menubuttonclick();
//    		 	   
//    		 	   sp.selectName();
//    		 	   sp.SearchbyName(Name);
//    		 	   sp.Dataclick();
//    		 	  String confName=sp.getNameDisplayed();
//    		  	  
//    				if(Name.equalsIgnoreCase(confName))
//    				{
//    					System.out.println("Test passed");
//    				}
//    				else
//    				{
//    					System.out.println("Test failed");
//    					
//    				}
//    				
//    		    	
//    		    }
//    		 {
//    		    	sp.menubuttonclick();
//    		 	    		 	   sp.selectPAN();
//    		 	   sp.SearchbyPAN(PAN);
//    		 	  
//    		 	   sp.Dataclick();
//    		 	  String confPAN=sp.getPANNODisplayed();
//    		  	  
//  				if(PAN.equalsIgnoreCase(confPAN))
//  				{
//  					System.out.println("Test passed");
//  				}
//  				else
//  				{
//  					System.out.println("Test failed");
//  					
//  				}
//  			
//    		 } 
//    		 	
//    		 { sp.menubuttonclick();
//    		   
//    		   sp.selectLeadID();
//    		   sp.SearchbyLead(leadID);
//    		   sp.Dataclick();
//    		  String confLeadID=sp.getleadIDDisplayed();
//    	 	  
//    			if(leadID.equalsIgnoreCase(confLeadID))
//    			{
//    				System.out.println("Test passed");
//    			}
//    			else
//    			{
//    				System.out.println("Test failed");
//    				
//    			}
//
//    	 }
//
//    		 	   
//    		    
//    		 	   {
//    		    	sp.menubuttonclick();
//    		 	   
//    		 	   sp.selectEmail();;
//    		 	   sp.SearchbyEmail(Email);
//    		 	   sp.Dataclick();
//    		 	  String confEmail=sp.getemailIDDisplayed();
//    		  	  
//    				if(("Email: "+Email).equalsIgnoreCase(confEmail))
//    				{
//    					System.out.println("Test passed");
//    				}
//    				else
//    				{
//    					System.out.println("Test failed");
//    					
//    				}
//    				
//    		 }
//    				{
//    			    	
//    			    	sp.menubuttonclick();
//    			  	   
//    			  	   sp.selectMobile();
//    			  	   sp.SearchbyMobile(Mobile);
//    			  	   sp.Dataclick();
//    			  	  String confMobile=sp.getMobilenoDisplayed();
//    			   	  
//    			 		if(("Number: (+91) "+Mobile).equalsIgnoreCase(confMobile))
//    			 		{
//    			 			System.out.println("Test passed");
//    			 		}
//    			 		else
//    			 		{
//    			 			System.out.println("Test failed");
//    			 			
//    			 		}
//    			 		
//    			    	
//    			    }
//	    
//      
//   		
//    {
//    	sp.menubuttonclick();
//    	   
//    	   sp.selectLoanAc();
//    	   sp.SearchbyLoanacNo(LoanNo);
//    	   sp.Dataclick();
//    	  String confLoanNo=sp.LoanNoDisplayed();
//     	  
// 		if(LoanNo.equalsIgnoreCase(confLoanNo))
// 		{
// 			System.out.println("Test passed");
// 		}
// 		else
// 		{
// 			System.out.println("Test failed");
// 			
// 		}
// 		 }
//   
//    
//    {
//    	sp.menubuttonclick();
// 	   
// 	   sp.selectCustID();
// 	   sp.SearchbyCustID(custID);
// 	   sp.Dataclick();
// 	  String confCustNo=sp.getCustIDDisplayed();
//  	  
//		if(("ID: "+custID).equalsIgnoreCase(confCustNo))
//		{
//			System.out.println("Test passed");
//		}
//		else
//		{
//			System.out.println("Test failed");
//			
//		}
//		
//    	
//    }
//	
//   	
//    	
//    }
//   
//     
//    
//	
//}
//	}
//	
//
//
//
//    
//
//
//
