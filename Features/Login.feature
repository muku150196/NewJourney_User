Feature: customer Login 

  Scenario: Successful Login                                                                                                                                  
  
   Given the user is on the Ram Fincorp login page
    When user enters Mobile Number as "7488660739"
    Then user Enters  PAN AS "EESPK0277M" and PINcode as "847203" in Enter your Pan Page
    Then user clicks Yes on PAN,NAME AND DOB match page
    When User click "bank Transfer" in  Mode of Payment page
    Then User clicks "Self Employed" on  employmentDetails
    And User enters MonthlyIncome as "70000" and click Next
    Then User enters salary date as "25"
    Then User update lenderID in Lead Table
 And User Update Bureau Table for EMI Creation
 And user click Continue button on Loan Selection Screen
 When User click Continue on offerpage
 When User clicks Personal Emergency on Loan Purpose
 Then User enters Email as "mukund.kumar@ramfincorp.com" and clicks Next
 When User enter AccName as "MUKUND KUMAR",AccNo as "50451442852",cnfAc as "50451442852",ifsc as "HDFC0003859"
 And User clicks continue on emandate
Then User enters mobileNo  as "7777777777" in ContactDetails Page
Then user clicks on Success in Rajorpay window
When User is again on emandate page and click Continue
And user enters aadhar as "884626198697" and clicks Next
Then User has to manually enter OTP and click next
Given User is on KFS Page , manually selects checkbox and click continue
Then User chages Pan for LMS Testing




#Given the user is on the Ram Fincorp login page
    #When user enters Mobile Number as "8406052868"
    #Then user Enters  PAN AS "HVKPS6764R" and PINcode as "847203" in Enter your Pan Page
    #Then user clicks Yes on PAN,NAME AND DOB match page
    #When User click "bank Transfer" in  Mode of Payment page
    #Then User clicks "Self Employed" on  employmentDetails
    #And User enters MonthlyIncome as "70000" and click Next
    #Then User enters salary date as "25"
    #Then User update lenderID in Lead Table
 #And User Update Bureau Table for EMI Creation
 #And user click Continue button on Loan Selection Screen
 #When User click Continue on offerpage
 #When User clicks Personal Emergency on Loan Purpose
 #Then User enters Email as "mukund.kumar@ramfincorp.com" and clicks Next
 #When User enter AccName as "SANDEEP KUMAR SAH",AccNo as "764567876543",cnfAc as "764567876543",ifsc as "HDFC0003859"
 #And User clicks continue on emandate
#Then User enters mobileNo  as "7777777777" in ContactDetails Page
#Then user clicks on Success in Rajorpay window
#When User is again on emandate page and click Continue
#And user enters aadhar as "245143339573" and clicks Next
#Then User has to manually enter OTP and click next




    #Given the user is on the Ram Fincorp login page
    #When user enters Mobile Number as "8754567898"
    #Then user Enters  PAN AS "AOGPV9573H" and PINcode as "847203" in Enter your Pan Page
    #Then user clicks Yes on PAN,NAME AND DOB match page
    #When User click "bank Transfer" in  Mode of Payment page
    #Then User clicks "Self Employed" on  employmentDetails
    #And User enters MonthlyIncome as "70000" and click Next
    #Then User enters salary date as "25"
    #Then User update lenderID in Lead Table
 #And User Update Bureau Table for EMI Creation
 #And user click Continue button on Loan Selection Screen
 #When User click Continue on offerpage
 #When User clicks Personal Emergency on Loan Purpose
 #Then User enters Email as "mukund.kumar@ramfincorp.com" and clicks Next
 #When User enter AccName as "MUKUND KUMAR",AccNo as "76327656754",cnfAc as "76327656754",ifsc as "HDFC0003859"
 #And User clicks continue on emandate
#Then User enters mobileNo  as "7777777777" in ContactDetails Page
#Then user clicks on Success in Rajorpay window
#When User is again on emandate page and click Continue
#And user enters aadhar as "884626198697" and clicks Next
#Then User has to manually enter OTP and click next
#Given User is on KFS Page , manually selects checkbox and click continue
#Then User chages Pan for LMS Testing

